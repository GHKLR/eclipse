
public class FormatlıGosterim {
	public static void main(String[] args) {
		String ad="Nurşen";
		int sInt=25;
		byte vNot=67;
		float sFloat=(float) 2.45;
		double sDouble=3.4567;
		System.out.printf("%-20s'nin numarası %d %nVize Notu %d%n",ad,sInt,vNot);
		System.out.printf("Float sayı : %-20.2fDouble sayı : %-15.2f",sFloat,sDouble);
	}
}
