package klasa7;

public class KonstruktorPrikaz {

	public static void main(String[] args) {
		
		
		Circle c1 = new Circle (20);
		
		calcArea(c1);
		
		
	}
	
	public static void calcArea (Circle c) {
		System.out.println("Povrsina kruga je "+c.area());
	}

}
