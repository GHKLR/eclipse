import java.util.Scanner;

public class Sayilar {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("KAç sayı gireceksiniz : ");
		byte es = giris.nextByte();
		int[] sayi = new int[es];
		for (int i = 0; i < es; i++) {
			System.out.println(i + 1 + ". sayıyı girin");
			sayi[i] = giris.nextInt();
		}
		for (int i = 0; i < sayi.length; i++) {
			System.out.println("sayi[" + i + "]=" + sayi[i]);
		}
		// ortalama bulma
		int toplam = 0;
		for (int i = 0; i < sayi.length; i++) {
			toplam += sayi[i];
		}
		System.out.println(es + " sayının toplamı : " + toplam);
		System.out.println(es + " sayının ortalaması : " + toplam / es);
		// en küçük bulma
		int enk = sayi[0];
		for (int i = 1; i < es; i++) {
			if (sayi[i] < enk)
				enk = sayi[i];
		}
		System.out.println("Dizinin en küçük elemanı : "+enk);
		int enb = sayi[0];
		for (int i = 1; i < es; i++) {
			if (sayi[i] > enb)
				enb = sayi[i];
		}
		System.out.println("Dizinin en büyük elemanı : "+enb);
		System.out.println("Program bitti");
	}

}
