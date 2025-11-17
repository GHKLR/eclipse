package ders;

import java.util.Scanner;

public class whilesinav {

	public static void main(String[] args) {
		    Scanner giris=new Scanner(System.in);
		    int devam=1;
		    byte vn,fn,bn;
		    do {
		    System.out.println("vize notu giriniz");
		    vn=giris.nextByte();
		    System.err.println("final notu giriniz");
		    fn=giris.nextByte();
		    bn=(byte) ((vn + fn) / 2);
		    System.out.println("basarı notunuz : " + bn);
		    System.out.println("devam edecekmisiniz (0/1)");
		    devam = giris.nextByte();		
            	
            }while(devam == 1);
		}
	}