import java.util.ArrayList;
import java.util.Iterator;

public class Dongu1 {

	public static void main(String[] args) {
		String adlar[]= {"Ali","Veli","Ayşe"};
		for (String ad : adlar) {
			System.out.println(ad);
		}
		System.out.println("-----------------------------");
		ArrayList<String> isimler=new ArrayList<String>();
		isimler.add("Zeynep");
		isimler.add("Aykut");
		isimler.add("Berkay");
		isimler.add("Uygar");
		for (String isim : isimler) {
			System.out.println(isim);
		}
		System.out.println("-----------------------------");
		for (Iterator iterator = isimler.iterator();iterator.hasNext();) {
			String isim=(String) iterator.next();
			System.out.println(isim);
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < adlar.length; i++) {
			System.out.println(adlar[i]);
		}
		
		System.out.println("-----------------------------");
		System.out.println(adlar[0]);
		String isim = isimler.get(0);
		System.out.println(isim);
		System.out.println("-----------------------------");
		isimler.forEach(veri->{
			System.out.println(veri);
		});
		System.out.println("______________________________________");
		isimler.forEach(System.out::println);
	}

}
