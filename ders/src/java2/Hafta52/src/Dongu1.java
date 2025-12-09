
public class Dongu1 {

	public static void main(String[] args) {
		int i = 0;
		for (; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		/*
		 * for (;;) { System.out.println("Okan üniversitesi"); }
		 */
		for (int j = 0; j < 10; j++) {
			// if(j==5 && j==3) break;
			if (j == 5 || j == 3)
				continue;
			System.out.println(j);
		}
		System.out.println("-----------------");
		for (int j = 1; j <= 50; j++) {
			if (j % 2 == 0 && j % 5 == 0)
				System.out.println(j);
		}
	}
}
