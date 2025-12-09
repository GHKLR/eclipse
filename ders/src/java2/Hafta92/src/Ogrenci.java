import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Kaç öğrenci gireceksiniz : ");
		byte os = giris.nextByte();
		String ad[] = new String[os];
		byte vn[] = new byte[os];
		byte fn[] = new byte[os];
		byte bn[] = new byte[os];
		// veri giriş
		for (int i = 0; i < os; i++) {
			System.out.println((i + 1) + ". ismi giriniz : ");
			ad[i] = giris.next();
			System.out.println("Vize notu giriniz : ");
			vn[i] = giris.nextByte();
			System.out.println("Final notu giriniz : ");
			fn[i] = giris.nextByte();
			bn[i] = (byte) (vn[i] * 0.4 + fn[i] * 0.6);
		}
		// listeleme
		for (int i = 0; i < os; i++) {
			System.out.println("İsim : " + ad[i]);
			System.out.println("Vize Notu : " + vn[i]);
			System.out.println("Final Notu : " + fn[i]);
			System.out.println("Başarı Notu : " + bn[i]);
			System.out.println("------------------------------");
		}
		// vize ortalama
		int vntoplam = 0;
		for (int i = 0; i < os; i++) {
			vntoplam += vn[i];
		}
		System.out.println(os + " vize not ortalaması : " + vntoplam / os);
		// en büyük başarı notu
		int enbBn = bn[0];
		for (int i = 1; i < os; i++) {
			if (bn[i] > enbBn)
				enbBn = bn[i];
		}
		System.out.println("Başarı notunun en büyük elemanı : " + enbBn);
	}
}
