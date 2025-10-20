package odev;

import java.util.Scanner;

public class VKEolcumu {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("Boyunuzu girin :");
		double boy=klavye.nextDouble();
		System.out.println("Kilonuzu girin :");
		short kilo=klavye.nextShort();
		double boymetre=boy/100;
		double vke=kilo/(boymetre*boymetre);
		System.out.println("vke değeriniz" + vke + "dir");
		if (vke <18.5) System.out.println("zayıf");
		if (vke >=18.5 && vke <25) System.out.println("sağlıklı");
		if (vke >=25 && vke <30) System.out.println("şişman");
		if (vke >=30 && vke <40) System.out.println("obez");
		if (vke >=40) System.out.println("aşırı obez");
	}

}
