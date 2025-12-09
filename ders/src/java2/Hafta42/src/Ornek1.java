import java.util.Scanner;

public class Ornek1 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String ad, durum, harfNotu;
		byte vn, fn, bn;
		System.out.println("İsim giriniz : ");
		ad = klavye.next();
		System.out.println("Vize Notu girin : ");
		vn = klavye.nextByte();
		System.out.println("Final Notu girin : ");
		fn = klavye.nextByte();
		bn = (byte) ((vn + fn) / 2);
		if (bn >= 50)
			durum = "Geçtin";
		else
			durum = "Kaldın";
		if (bn >= 0 && bn <= 30)
			harfNotu = "FF";
		// else if(bn>30 &&bn<=40) harfNotu="DD";
		else if (bn <= 40)
			harfNotu = "DD";
		else if (bn <= 50)
			harfNotu = "DC";
		else if (bn <= 60)
			harfNotu = "CC";
		else if (bn <= 70)
			harfNotu = "CB";
		else if (bn <= 80)
			harfNotu = "BB";
		else if (bn <= 90)
			harfNotu = "BA";
		else
			harfNotu = "AA";
		System.out.println(ad + " başarı notun : " + bn + " " 
			+ durum+" harf notun "+harfNotu);

		System.out.println("Program bitti");
	}
}
