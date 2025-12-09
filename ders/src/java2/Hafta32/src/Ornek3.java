
public class Ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 2, y = 3, z = 4;
		 int t=((x*x)*(y*y)*(z*z)+x++)/(2*y--+z)*((x+y)*(x+y));
		
		System.out.println("Sonuç: " + t);
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);

	}

}
