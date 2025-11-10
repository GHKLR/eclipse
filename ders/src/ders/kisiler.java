package ders;

import java.util.Scanner;

public class kisiler {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		String ad;
		byte yas,ks;
		short dt;
		int maas, maasTop=0, yasTop=0,dtTop=0;
		System.out.println("program kaç kişi için çalışacak");
		ks=giris.nextByte();
		for (int i = 1; i <=ks; i++) {
			System.out.println(i+". kişinin adı : ");
			ad=giris.next();
			System.out.println(i+". kişinin maaşı : ");
			maas=giris.nextInt();
			System.out.println(i+". kişinin doğum tarihi : ");
			dt=giris.nextShort();
			yas=(byte) (2025-dt);
			System.out.println(ad+" yaşın "+yas);
			maasTop+=maas; yasTop+=yas; dtTop+=dt;
			System.out.println("Maasş ortalaması : "+(maasTop/ks));
			System.out.println("yas  ortalaması : "+(yasTop/ks));
			System.out.println("Doğum tarihi ortalaması : "+(dtTop/ks));
			
		}

	}

}
