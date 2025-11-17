package ders;

import java.util.Scanner;

public class whilesinav2 {

	public static void main(String[] args) {
		    Scanner giris=new Scanner(System.in);
		    int devam=1,os=0;
		    byte vn,fn,bn;
		    short vntop = 0,fntop = 0,bntop = 0;
		    do {
		    System.out.println("vize notu giriniz");
		    vn=giris.nextByte();
		    System.out.println("final notu giriniz");
		    fn=giris.nextByte();
		    bn=(byte) ((vn + fn) / 2);
		    System.out.println("basarı notunuz : " + bn);
		    System.out.println("devam edecekmisiniz (0/1)");
		    devam = giris.nextByte();
		    vntop+=vn;
		    fntop+=fn;
		    bntop+=bn;
		    os++;
            }while (devam == 1);
		    System.out.println("vize not toplamı : "+vntop);
		    System.out.println("vize not ortalamsı : "+vntop/os);
		    System.out.println("final not toplamı : "+fntop);
		    System.out.println("final not ortalaması : "+fntop/os);
		    System.out.println("basarı not toplamı : "+bntop);
		    System.out.println("basarı not ortalaması : "+bntop/os);
		}
	}