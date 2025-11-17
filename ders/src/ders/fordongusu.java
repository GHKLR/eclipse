package ders;

public class fordongusu {

	public static void main(String[] args) {
		System.out.println("for döngüsü");
		for (int i = 0; i < 5; i++) {
            System.out.println("1");
		}
		System.out.println("while döngüsü");
		int i = 5;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		System.out.println("do döngüsü");
		i=5;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);
		System.out.println("program sonu");
		}
	}