import java.util.Scanner;

public class DonguOgrenci {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int devam = 1, os = 0;
		byte yas, maas;
		short yastop = 0, maastop = 0;
		while (devam == 1) {
			System.out.println("yaş  giriniz : ");
			yas = giris.nextByte();
			System.out.println("maaş  giriniz : ");
			maas = giris.nextByte();
			System.out.println("Devam edecekmisiniz (0/1)");
			devam = giris.nextInt();
			yastop += yas;
			maastop += maas;
			os++;
		}
		System.out.println("yas toplamı : " + yastop);
		System.out.println("Yaş ortalaması : " + yastop / os);
		System.out.println("Maas toplamı : " + maastop);
		System.out.println("Maas ortalaması : " + maastop / os);
	}

}
