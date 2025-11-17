package ders;

import java.util.Scanner;

public class whileyas {

	public static void main(String[] args) {
		    Scanner giris=new Scanner(System.in);
		    int devam=1,os=0;
		    byte yas,maas;
		    short yastop = 0,maastop = 0;
		    while (devam == 1); {
		    System.out.println("yas giriniz");
		    yas=giris.nextByte();
		    System.out.println("maas giriniz");
		    maas=giris.nextByte();
		    System.out.println("devam edecekmisiniz (0/1)");
		    devam = giris.nextByte();
		    yastop += yas;
		    maastop += maas;
		    os++;
		    }
		    System.out.println("yas toplamı : "+yastop);
		    System.out.println("yas ortalamsı : "+yastop/os);
		    System.out.println("maas toplamı : "+maastop);
		    System.out.println("maas ortalaması : "+maastop/os);
		}
}