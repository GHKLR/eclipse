package odev;

import java.util.Scanner;

public class birimdonusturme {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("metre cinsinden değer giriniz :");
		short metre=klavye.nextShort();
		int milimetre=metre*1000;
		int santimetre=metre*100;
		int desimetre=metre*10;
		double dekametre=(float) metre/10;
		double hektometre=(float) metre/100;
		double kilometre=(float) metre/1000;
		System.out.println(metre+" metre olan uzunluk "+milimetre+" milimetredir");
		System.out.println(metre+" metre olan uzunluk "+santimetre+" santimetredir");
		System.out.println(metre+" metre olan uzunluk "+desimetre+" desimetredir");
		System.out.println(metre+" metre olan uzunluk "+dekametre+" dekametredir");
		System.out.println(metre+" metre olan uzunluk "+hektometre+" hektometredir");
		System.out.println(metre+" metre olan uzunluk "+kilometre+" kilometredir");
	}

}
