import java.util.Scanner;

public class Telefon {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Dakika ücreti kuruş olarak girin : ");
		short dakikaUcret = giris.nextShort();
		float dakikaLira = dakikaUcret / 100;
		System.out.println("Sms ücreti kuruş olarak girin : ");
		short smsUcret = giris.nextShort();
		float smsLira = smsUcret / 100;
		System.out.println("İnternet ücreti lira olarak girin : ");
		byte internetLira = giris.nextByte();
		System.out.println("Kişi sayısı : ");
		byte ks = giris.nextByte();
		String ad[] = new String[ks];
		short dakika[] = new short[ks];
		short sms[] = new short[ks];
		short internet[] = new short[ks];
		short fatura[] = new short[ks];
		for (int i = 0; i < ks; i++) {
			System.out.println((i + 1) + ". kişinin adı : ");
			ad[i] = giris.next();
			System.out.println("Kaç dakika : ");
			dakika[i] = giris.nextShort();
			System.out.println("Kaç sms : ");
			sms[i] = giris.nextShort();
			System.out.println("Ne kadar internet : ");
			internet[i] = giris.nextShort();
			fatura[i] = (short) (dakika[i] * dakikaLira + sms[i] * smsLira + internet[i] * internetLira);
		}
		int faturaToplam = 0;
		for (int i = 0; i < ks; i++) {
			faturaToplam += fatura[i];
		}
		short faturaOrt = (short) (faturaToplam / ks);
		byte menu;
		for (;;) {
			System.out.println("0-Çıkış\n1-Listeleme\2-Fatura ortalaması\3- ortalamadan büyüklerin bilgisi");
			menu = giris.nextByte();
			switch (menu) {
			case 0:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			case 1:
				for (int i = 0; i < ks; i++) {
					System.out.println("Ad : " + ad[i]);
					System.out.println("Fatura : " + fatura[i]);
				}
				break;
			case 2:
				System.out.println(ks + " kişinin fatura ortalaması : " + faturaOrt);
				break;
			case 3:for (int i = 0; i < fatura.length; i++) {
				if(fatura[i]>faturaOrt) {
					System.out.println("Ad : " + ad[i]);
					System.out.println("Fatura : " + fatura[i]);
				}
			}
			default:
				System.out.println("Yanlış menü değeri");
			}// switch sonu
		} // menu sonu
	}
}
