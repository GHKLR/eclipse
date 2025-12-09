import java.util.Iterator;

public class ForDongusu {

	public static void main(String[] args) {
		for (int i = 0; i <= 50; i++) {
			if (i%2!=0 || i%5!=0) continue;
			System.out.println(i);
			//if(i==5) break;
		}
		System.out.println("----------------------");
		for (int i = 0; i <=50; i++) {
			if(i%2==0 && i%5==0)
				System.out.println(i);
		}
	}

}
