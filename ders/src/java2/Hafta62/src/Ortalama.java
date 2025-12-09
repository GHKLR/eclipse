
public class Ortalama {

	public static void main(String[] args) {
		int us=15, sayac=1, toplam=0;
		do {
			toplam+=sayac;
			sayac++;
		}while(sayac<=us);
		System.out.println("1 den "+us+" e kadar sayıların toplamı : "+toplam);
		System.out.println("1 den "+us+" e kadar sayıların ortalaması : "+toplam/us);
	}

}
