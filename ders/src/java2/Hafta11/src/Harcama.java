import java.util.Iterator;
import java.util.Scanner;

public class Harcama {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Kaç kişi girilecek");
		byte ks = giris.nextByte();
		String ad[] = new String[ks];
		int maas[] = new int[ks];
		int harcama[] = new int[ks];
		for (int i = 0; i < ks; i++) {
			System.out.println((i+1)+". kişinin adı : ");
			ad[i]=giris.next();
			System.out.println("Maaşı : ");
			maas[i]=giris.nextInt();
			System.out.println("Harcaması : ");
			harcama[i]=giris.nextInt();
		}
		byte menu;
		while (true) {
			System.out.println("1-Listeleme\n2-Borçlu olanlar listesi\n3-Maaş ort, en büyük, en küçük");
			System.out.println("4-harcama ortalaması\n5-İsim arama\n6-Çıkış");
			menu = giris.nextByte();
			switch (menu) {
			case 1:for (int i = 0; i < ks; i++) {
				System.out.println("Ad : "+ad[i]);
				System.out.println("Maaş : "+maas[i]);
				System.out.println("Harcama : "+harcama[i]);
			}
				break;
			case 2:for (int i = 0; i < ks; i++) {
				if(maas[i]-harcama[i]<0) {
					System.out.println("Ad : "+ad[i]);
					System.out.println("Maaş : "+maas[i]);
					System.out.println("Harcama : "+harcama[i]);
				}
			}
				break;
			case 3:int maasTop=0;
				for (int i = 0; i < ks; i++) {
					maasTop+=maas[i];
				}
				System.out.println("Maaş Ortalaması : "+maasTop/ks);
				int enk = maas[0];
				for (int i = 1; i < ks; i++) {
					if (maas[i] < enk)
						enk = maas[i];
				}
				System.out.println("Maaşın en küçüğü : "+enk);
				int enb = maas[0];
				for (int i = 1; i < ks; i++) {
					if (maas[i] > enb)
						enb = maas[i];
				}
				System.out.println("Maaşın en büyüğü : "+enb);
				break;
			case 4:
				int harcamaTop=0;
				for (int i = 0; i < ks; i++) {
					harcamaTop+=harcama[i];
				}
				System.out.println("Harcama Ortalaması : "+harcamaTop/ks);
				 enk = harcama[0];
				for (int i = 1; i < ks; i++) {
					if (harcama[i] < enk)
						enk = harcama[i];
				}
				System.out.println("harcamanın en küçüğü : "+enk);
				enb = harcama[0];
				for (int i = 1; i < ks; i++) {
					if (harcama[i] > enb)
						enb = harcama[i];
				}
				System.out.println("harcamanın en büyüğü : "+enb);
				break;
			case 5:System.out.println("Aranacak ismi giriniz : ");
			String arananAd=giris.next();
			for (int i = 0; i < ks; i++) {
				if(arananAd.equalsIgnoreCase(ad[i])) {
					System.out.println("Ad : "+ad[i]);
					System.out.println("Maaş : "+maas[i]);
					System.out.println("Harcama : "+harcama[i]);
				}
			}
				break;
			case 6:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			default:
				System.out.println("Yanlış menü değeri");
				break;
			}
		}
	}

}
