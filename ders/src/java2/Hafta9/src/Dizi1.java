
public class Dizi1 {

	public static void main(String[] args) {
		int sayi[]=new int[5];
		sayi[1]=20;
		sayi[3]=40;
		sayi[0]=50;
		System.out.println("Dizi uzunluğu : "+sayi.length);
		System.out.println("dizi :"+sayi);
		for (int i = 0; i < sayi.length; i++) {
			System.out.println("sayi["+i+"]="+sayi[i]);
		}

	}
}
