package ders;

public class hafta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ad="veli";
		byte vizeNot=37;
		byte finalNot=84;
		//System.out.println(ad);
		//System.out.println(vizeNot);
		//System.out.println(finalNot);
		//System.out.println(vizeNot*0.4+finalNot*0.6);
		System.out.println("ad : "+ad);
		System.out.println("Vize notu : "+vizeNot);
		System.out.println("Final notu : "+finalNot);
		//System.out.println("Başarı Notu : "+(vizeNot*0.4+finalNot*0.6));
		double basarıNotDouble=vizeNot*0.4+finalNot*0.6;
		float basarıNotFloat=(float) (vizeNot*0.4+finalNot*0.6);
		byte basarıNotByte=(byte) (vizeNot*0.4+finalNot*0.6);
		System.out.println("Başarı Not byte : "+basarıNotByte);
		System.out.println("Başarı not Float : "+basarıNotFloat);
		System.out.println("Başarı not double : "+basarıNotDouble);
		float s1=(float) 3.3489234904503554;
		double s2=3.3489234904503554;
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
	}

}
