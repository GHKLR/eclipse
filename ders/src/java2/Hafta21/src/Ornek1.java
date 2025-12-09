
public class Ornek1 {

	public static void main(String[] args) {
		String ad="Ali";
		/*byte vizeNot=55;
		byte finalNot=80;*/
		byte vizeNot=55,finalNot=70;
		//System.out.println(ad);
		System.out.println("Adınız : "+ad);
		//System.out.println(vizeNot);
		System.out.println("Vize Notunuz : "+vizeNot);
		//System.out.println(finalNot);
		System.out.println("Final Notunuz : "+finalNot);
		byte basariNot=(byte) (vizeNot*0.4+finalNot*0.6);
		System.out.println("Başarı Notunuz : "+basariNot);
		System.out.println("Program bitti");
	}

}
