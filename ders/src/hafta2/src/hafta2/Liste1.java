package hafta2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Liste1 {

	public static void main(String[] args) {
		ArrayList<String> ad=new ArrayList<String>();
		System.out.println(ad);
		ad.add("Ali");
		System.out.println(ad);
		ad.add("Ayşe");//listenin sonuna eleman ekler
		System.out.println(ad);
		ad.set(1, "Mehmet");//belirtilen indisteki kaydı günceller
		System.out.println(ad);
		/*
		 * ad.set(2, "nur"); System.out.println(ad);
		 */
		ad.addFirst("Nuray");//listenin ilk indisine verilen ismi ekler
		System.out.println(ad);
		ad.addLast("Berkay");//listenin son indisine verilen ismi ekler
		System.out.println(ad);
		Object[] veri=ad.toArray();//listeyi diziye çevirir
		System.out.println("veri : "+veri);
		System.out.println("veri[0] : "+veri[0]);
		System.out.println("ad : "+ad);
		String silinenAd =ad.remove(0);//indisi verilen kaydı siler
		System.out.println("ad : "+ad);
		System.out.println("Silinen ad : "+silinenAd);
		//ad.clear();//tüm listeyi siler
		System.out.println("ad : "+ad);
		System.out.println(ad.contains("Ali"));
		System.out.println(ad.contains("Nurten"));
		System.out.println(ad.size());
		//System.out.println(ad.get(0));
		System.out.println(ad.indexOf("Mehmet"));
		System.out.println(ad.isEmpty());
		Collections.sort(ad,Collections.reverseOrder());
		System.out.println(ad);
	}

}
