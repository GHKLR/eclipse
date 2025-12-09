import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		byte vn, fn,bn;
		short vntop = 0,fntop = 0,bntop = 0;
		System.out.println("Öğrenci sayısı gir");
		byte os=giris.nextByte();
		for (int i = 1; i <=os; i++) {
			System.out.println(i+". öğrencinin vize notunu gir : ");
			vn=giris.nextByte();
			System.out.println(i+". öğrencinin final notunu gir : ");
			fn=giris.nextByte();
			bn=(byte) ((vn+fn)/2);
			System.out.println(i+". öğrencinin başarı notu  :"+bn);
			vntop=(short) (vntop+vn);
			fntop+=fn;
			bntop+=bn;
		}
		System.out.println("Vize Not toplamı : "+vntop);
		System.out.println("Vize Not ortalaması : "+vntop/os);
		System.out.println("Final Not toplamı : "+fntop);
		System.out.println("Final Not ortalaması : "+fntop/os);

		System.out.println("Başarı Not toplamı : "+bntop);
		System.out.println("Başarı Not ortalaması : "+bntop/os);
	}
}
