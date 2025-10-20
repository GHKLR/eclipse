package odev;

import java.util.Scanner;

public class notpuanlandirmasi {

	public static void main(String[] args) {
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
		byte basarıNotbyte=(byte) (vizeNot*0.4+finalNot*0.6);
		System.out.println("Başarı Notu : "+basarıNotbyte);
		if (basarıNotbyte <=30) System.out.println("FF");
		if (basarıNotbyte >30 && basarıNotbyte <=40) System.out.println("DD");
		if (basarıNotbyte >40 && basarıNotbyte <=50) System.out.println("DC");
		if (basarıNotbyte >50 && basarıNotbyte <=60) System.out.println("CC");
		if (basarıNotbyte >60 && basarıNotbyte <=70) System.out.println("CB");
		if (basarıNotbyte >70 && basarıNotbyte <=80) System.out.println("BB");
		if (basarıNotbyte >80 && basarıNotbyte <=90) System.out.println("BA");
		if (basarıNotbyte >90 && basarıNotbyte <=100) System.out.println("AA");
	}

}
