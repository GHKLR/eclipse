
public class HataTespiti {

	public static void main(String[] args) {
		int sayi = 0;
		int veri[]= {3,6,2};
		try {
			sayi=10/2;
			System.out.println(veri[3]);
		}catch(ArithmeticException e){
			sayi=10/1;
			System.out.println("hata : "+e.getMessage());
			System.out.println("hata : "+e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(veri[veri.length-1]);
			System.out.println("Hata : "+e);
		}catch(Exception e) {
			System.out.println("Tahmin edilmeyen hata :"+e);
		}
		finally {
			System.out.println("Her Koşulda çalışır");
		}
		System.out.println(sayi);
		System.out.println("Program bitti");
	} 
}
