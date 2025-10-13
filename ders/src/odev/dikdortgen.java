package odev;

import java.util.Scanner;

public class dikdortgen {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("dikdörtgenin 1. kenarını giriniz : ");
		short kenar1=klavye.nextShort();
		System.out.println("dikdörtgen 2. kenarını giriniz : ");
		short kenar2=klavye.nextShort();
		int çevre=kenar1*2+kenar2*2;
		int alan=kenar1*kenar2;
		System.out.println("kenarı "+kenar1+" ve "+kenar2+" olan dikdörtgenin çevresi : "+çevre);
		System.out.println("kenarı "+kenar1+" ve "+kenar2+" olan dikdörtgenin alanı : "+alan);
	}

}
