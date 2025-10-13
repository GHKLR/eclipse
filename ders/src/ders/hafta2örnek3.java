package ders;

import java.util.Scanner;

public class hafta2örnek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavye=new Scanner(System.in);
		System.out.println("Kare Kenarı giriniz : ");
		Short karekenar=klavye.nextShort();
		int cevre =karekenar*4;
		int alan=karekenar*karekenar;
		System.out.println("Kenarı "+karekenar+" olan karenin çevresi : "+cevre);
		System.out.println("Kenarı "+karekenar+" olan kareninalanı : "+alan);
	}

}
