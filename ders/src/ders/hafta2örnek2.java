package ders;

import java.util.Scanner;

public class hafta2örnek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavye=new Scanner(System.in);
		System.out.println("isim giriniz : ");
		String ad=klavye.next();
		System.out.println("Vize Notu giriniz : ");
		byte vizeNot=klavye.nextByte();
		System.out.println("Final Notu giriniz : ");
		byte finalNot=klavye.nextByte();
		System.out.println("ad : "+ad);
		System.out.println("Vize notu : "+vizeNot);
		System.out.println("Final notu : "+finalNot);
		byte basarıNotByte=(byte) (vizeNot*0.4+finalNot*0.6);
		System.out.println("Başarı Notu : "+basarıNotByte);
	}

}
