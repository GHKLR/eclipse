package hafta1;

import java.util.Iterator;
import java.util.Scanner;

public class Sirket {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String il[] = { "Edirne   ", "İstanbul ", "Ankara   " };
		String ay[] = { "Ocak", "Şubat"};
		int sa = il.length;
		int su = ay.length;
		int satis[][] = new int[sa][su];
		int toplam[] = new int[sa];
		int sutoplam[] = new int[su];
		int enb[] = new int[sa];
		int enk[] = new int[sa];
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				System.out.println(il[i] + " ilinin " + ay[j] + " ay satışı gir : ");
				satis[i][j] = giris.nextInt();
			}
		}
		// hesaplama işlemleri
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				toplam[i] += satis[i][j];
			}
		}

		for (int i = 0; i < sa; i++) {
			enb[i] = satis[0][0];
			for (int j = 0; j < su; j++) {
				if (satis[i][j] > enb[i])
					enb[i] = satis[i][j];
			}
		}

		for (int i = 0; i < sa; i++) {
			enk[i] = satis[0][0];
			for (int j = 0; j < su; j++) {
				if (satis[i][j] < enk[i])
					enk[i] = satis[i][j];
			}

		}
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				sutoplam[j]+=satis[i][j];
			}
		}
		// yazdırma işlemleri
		System.out.println("\n");
		System.out.print("İller    ");
		for (int i = 0; i < ay.length; i++) {
			System.out.print(ay[i] + "\t");
		}
		System.out.println("Toplam\tOrt\tEnb\tEnk");
		for (int i = 0; i < sa; i++) {
			System.out.print(il[i]);
			for (int j = 0; j < su; j++) {
				System.out.print(satis[i][j] + "\t");
			}
			System.out.println(toplam[i] + "\t" + toplam[i] / su + "\t" + enb[i] + "\t" + enk[i]);
		}
		System.out.print("Toplam\t");
		for (int j = 0; j < su; j++) {
			System.out.print(sutoplam[j]+"\t");
		}
		int geneltoplam=0;
		for (int i = 0; i < sa; i++) {
			geneltoplam+=toplam[i];
		}
		System.out.println(geneltoplam);
	}
}
