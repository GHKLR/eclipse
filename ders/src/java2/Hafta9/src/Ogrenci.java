import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.println("Kaç öğrenci girilecek");
		int os=giris.nextInt();
		String ad[]=new String[os];
		byte vn[]=new byte[os];
		byte fn[]=new byte[os];
		byte bn[]=new byte[os];
		//veri giriş
		for (int i = 0; i < os; i++) {
			System.out.println((i+1)+" Kişinin adını gir : ");
			ad[i]=giris.next();
			System.out.println("Vize notunu gir : ");
			vn[i]=giris.nextByte();
			System.out.println("Final notunu gir : ");
			fn[i]=giris.nextByte();
			bn[i]=(byte) (vn[i]*0.4+fn[i]*0.6);
		}
		//listeleme
		for (int i = 0; i < os; i++) {
			System.out.println("Ad : "+ad[i]);
			System.out.println("Vize notu : "+vn[i]);
			System.out.println("Final notu : "+fn[i]);
			System.out.println("Başarı notu : "+bn[i]);
			System.out.println("--------------------");
		}
		int vntoplam = 0;
		for (int i = 0; i < os; i++) {
			vntoplam += vn[i];
		}
		System.out.println("Vize Not ortalaması : "+vntoplam/os);
		int fntoplam = 0;
		for (int i = 0; i < os; i++) {
			fntoplam += fn[i];
		}
		System.out.println("Final Not ortalaması : "+fntoplam/os);
		int bntoplam = 0;
		for (int i = 0; i < os; i++) {
			bntoplam += bn[i];
		}
		System.out.println("Başari Not ortalaması : "+bntoplam/os);
	}

}

















