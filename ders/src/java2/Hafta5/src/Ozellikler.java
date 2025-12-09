
public class Ozellikler {

	public static void main(String[] args) {
		int sayi = 1;
		switch (sayi) {
		case 1:
			System.out.println(" bir girdin");
		case 3:
			System.out.println(" üç girdin");
			break;
		case 5:
			System.out.println(" beş girdin");break;
		case 7:
			System.out.println(" yedi girdin");
			break;
		default:
			System.out.println("1-3-5-7- dışında girdin");
			break;
		}
	}

}
