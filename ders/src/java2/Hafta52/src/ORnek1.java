import java.util.Scanner;

public class ORnek1 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int s1, s2, sonuc, menu;
		System.out.println("Birinci sayıyı giriniz : ");
		s1 = giris.nextInt();
		System.out.println("İkinci sayıyı giriniz : ");
		s2 = giris.nextInt();
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod alma\nSeçiminiz");
		menu = giris.nextInt(); 
		switch (menu) {
		case 1:
			sonuc = s1 + s2;
			System.out.println(s1 + " + " + s2 + " = " + sonuc);
			break;
		case 2:
			sonuc = s1 - s2;
			System.out.println(s1 + " - " + s2 + " = " + sonuc);
			break;
		case 3: 
			sonuc = s1 * s2;
			System.out.println(s1 + " * " + s2 + " = " + sonuc);
			break;
		case 4:
			sonuc = s1 / s2;
			System.out.println(s1 + " / " + s2 + " = " + sonuc);
			break;
		case 5:
			sonuc = s1 % s2;
			System.out.println(s1 + " % " + s2 + " = " + sonuc);
			break;
		default:System.out.println("Yanlış menü değeri");
			break;
		}
	}
}
