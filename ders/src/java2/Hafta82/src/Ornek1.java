import java.util.Scanner;

public class Ornek1 {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.println("Kaç sayi gireceksiniz : ");
		byte ks=giris.nextByte();
		int sayi, cs=0, ct=0,ts=0,tt=0;
		for (int i = 1; i <= ks; i++) {
			System.out.println(i+". sayıyı girin");
			sayi=giris.nextInt();
			if(sayi%2==0) {
				cs++;
				ct+=sayi;
			}else {
				ts++;
				tt+=sayi;
			}
		}//döngü sonu
		System.out.println("Teklerin sayısı : "+ts);
		System.out.println("Teklerin toplamı : "+tt);
		System.out.println("Teklerin ortalaması : "+(tt/ts));
		System.out.println("Çiftlerin sayısı : "+cs);
		System.out.println("Çiftlerin toplamı : "+ct);
		System.out.println("Çiftlerin ortalaması : "+(ct/cs));
		System.out.println("Tüm sayıların toplamı : "+(tt+ct));
		System.out.println("Tüm sayıların ortalaması : "+(tt+ct)/ks);
	}
}
