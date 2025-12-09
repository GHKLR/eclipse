import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		String ad;
		byte vn, fn, bn;
		System.out.println("İsim giriniz : ");
		ad=klavye.next();
		System.out.println("Vize Notu girin : ");
		vn=klavye.nextByte();
		System.out.println("Final Notu girin : ");
		fn=klavye.nextByte();
		bn=(byte) ((vn+fn)/2);
		System.out.println("Başarı Notunuz : "+bn);
	}

}
