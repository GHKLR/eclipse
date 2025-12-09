import java.util.Scanner;

public class Ogrenci {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int yas, maas, bn, ks = 0;
		int yasTop = 0, maasTop = 0;
		byte devam=1;
		while (devam == 1) {
			System.out.println("yaş giriniz : ");
			yas = giris.nextByte();
			System.out.println("maaş giriniz : ");
			maas = giris.nextByte();
			System.out.println("Devam edecekmisiniz (0/1)");
			devam = giris.nextByte();
			yasTop =  (yasTop + yas);
			maasTop += maas;
			
			ks++;
		} 
		System.out.println("yaş Toplamı : " + yasTop);
		System.out.println("yaş Ortalaması : " + yasTop / ks);
		System.out.println("maaş Toplamı : " + maasTop);
		System.out.println("maaş Ortalaması : " + maasTop / ks);
	}
}
