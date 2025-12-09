import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int kn1, kn2, cevre, alan;
		System.out.println("Kenar 1");
		kn1 = klavye.nextInt();
		System.out.println("Kenar 2");
		kn2 = klavye.nextInt();
		if (kn1 == kn2) {
			System.out.println("Şekil karedir");
			cevre = kn1 * 4;
			alan = kn1 * kn2;
			System.out.println("Çevre: " + cevre);
			System.out.println("Alan: " + alan);

		} else {
			System.out.println("Şekil Dikdörtgendir");
			cevre = (kn1 + kn2) * 2;
			alan = kn1 * kn2;
			System.out.println("Çevre: " + cevre);
			System.out.println("Alan: " + alan);
		}

	}

}
