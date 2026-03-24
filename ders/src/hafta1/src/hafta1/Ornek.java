package hafta1;

public class Ornek {

	public static void main(String[] args) {
		int sayi[][]=new int[3][2];
		System.out.println("satır sayısı"+sayi.length);
		System.out.println("sütun sayısı : "+sayi[1].length);
		System.out.println("başlangıç değerli yazdırma");
		yazdir(sayi);
		for (int i = 0; i < sayi.length; i++) {
			for (int j = 0; j < sayi[0].length; j++) {
				sayi[i][j]=i+j;
			}
		}
		System.out.println("Atamaden sonraki");
		yazdir(sayi);
		System.out.println("------------------------");
		for (int i = 0; i < sayi.length; i++) {
			for (int j = 0; j < sayi[0].length; j++) {
				System.out.print(sayi[i][j]+"\t");
			}//sütun döngüsü
			System.out.println();
		}//satır döngüsü
		Toplam(sayi);

	}

	private static void Toplam(int[][] sayi) {
		int toplam=0;
		for (int i = 0; i < sayi.length; i++) {
			for (int j = 0; j < sayi[0].length; j++) {
				toplam+=sayi[i][j];
			}//sütun döngüsü
			
		}//satır döngüsü
		System.out.println("MAtris toplamı : "+toplam);
	}

	private static void yazdir(int[][] sayi) {
		for (int i = 0; i < sayi.length; i++) {
			for (int j = 0; j < sayi[0].length; j++) {
				System.out.println("i "+i+" j "+j+" : "+sayi[i][j]);
			}//sütun döngüsü
		}//satır döngüsü

	}

}
