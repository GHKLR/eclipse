package odev;

import java.util.Scanner;

public class silindir {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("silindirin taban yarıçapını giriniz :");
		short yarıçap=klavye.nextShort();
		System.out.println("silindirin yüksekliğini giriniz :");
		short yükseklik=klavye.nextShort();
		double alan=2*Math.PI*yarıçap*yarıçap+2*Math.PI*yarıçap*yükseklik;
		double hacim=Math.PI*yarıçap*yarıçap*yükseklik;
		System.out.println("yarıçapı "+yarıçap+" ve yüksekliği "+yükseklik+" olan silindirin alanı :"+alan);
		System.out.println("yarıçapı "+yarıçap+" ve yüksekliği "+yükseklik+" olan silindirin hacimi :"+hacim);
	}

}
