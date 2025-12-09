import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String ad;
		byte vn, fn, bn, ks;
		System.out.println("KAç kişi için çalışacak");
		ks=giris.nextByte();
		for (int i = 1; i <= ks; i++) {
			System.out.println(i+" kişinin İsmini giriniz : ");
			ad = giris.next();
			System.out.println("Vize notu giriniz : ");
			vn = giris.nextByte();
			System.out.println("Final notu giriniz : ");
			fn = giris.nextByte();
			bn = (byte) ((vn + fn) / 2);
			System.out.println(ad+" başarı notun "+bn);
		}
	}

}
