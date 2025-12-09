import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		int toplam = 0;
		for (int i = 10; i > 0; i /= 2) {
			toplam += i;
			System.out.println("toplam : "+toplam+" i "+i);
		}
		System.out.println(toplam);

	}

}
