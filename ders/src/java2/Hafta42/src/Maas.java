import java.nio.Buffer;
import java.util.Scanner;

public class Maas {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int brutMaas, gv, dv, netMaas;
		System.out.println("Brüt maaş:");
		brutMaas = giris.nextInt();
		dv = (int) (brutMaas * 0.004);
		if (brutMaas <= 30000)
			gv = (int) (brutMaas * 0.15);
		else if (brutMaas <= 50000)
			gv = (int) (brutMaas * 0.20);
		else
			gv = (int) (brutMaas * 0.25);
		netMaas = brutMaas - (gv + dv);
		System.out.println("Vergiler toplamı : "+(gv+dv));
		System.out.println("Net maaş : "+netMaas);
	}

}
