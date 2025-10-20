package odev;

import java.util.Scanner;

public class sayikarsilastirmasi {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("3 tane birbirinden farklı sayıyı sıralama");
		System.out.println("1. sayıyı giriniz :");
		int birincisayı=klavye.nextInt();
		System.out.println("2. sayıyı giriniz :");
		int ikincisayı=klavye.nextInt();
		System.out.println("3. sayıyı giriniz :");
		int üçüncüsayı=klavye.nextInt();
		// birinci sayı en küçük mü diye bakıyoruz
		if (birincisayı <= ikincisayı && birincisayı <= üçüncüsayı)
			if (ikincisayı <= üçüncüsayı) System.out.println(birincisayı + "<" + ikincisayı + "<" + üçüncüsayı);
			  else System.out.println(birincisayı + "<" + üçüncüsayı + "<" + ikincisayı);
		// ikinci sayı en küçük mü diye bakıyoruz
		else if (ikincisayı <= birincisayı && ikincisayı <= üçüncüsayı)
		  if (birincisayı <= üçüncüsayı) System.out.println(ikincisayı + "<" + birincisayı + "<" + üçüncüsayı);
		     else System.out.println(ikincisayı + "<" + üçüncüsayı + "<" + birincisayı);
		// yukardakilerin hiçbiri olmadıysa üçüncü sayı en küçüktür
		else
			if (birincisayı <= ikincisayı) System.out.println(üçüncüsayı + "<" + birincisayı + "<" + ikincisayı);
			  else System.out.println(üçüncüsayı + "<" + ikincisayı + "<" + birincisayı);
	}

}
