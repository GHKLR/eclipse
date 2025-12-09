package devran;

import java.util.Scanner;

public class harcamalar {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
	System.out.println("kaç kişi girceksiniz");
	byte ks=giris.nextByte();
	//ks=kisi sayısı
	String[] isimler=new String[ks];
	int[] maaslar=new int[ks];
	int[] harcamalar=new int[ks];
	for (int i=0; i<ks; i++) {
		System.out.println("isim: ");
		isimler[i]=giris.next();
		System.out.println("maas: ");
		maaslar[i]=giris.nextInt();
		System.out.println("harcama: ");
		harcamalar[i]=giris.nextInt();
	}
		

	}

}
