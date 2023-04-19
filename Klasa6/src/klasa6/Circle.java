package klasa6;

public class Circle {
	
	// this
	
	private double poluprecnik;
	
	Circle()
	{
		poluprecnik = 0.0;
	}
	
	Circle(double radius)
	{
		this.poluprecnik = radius;
	}
	
	public double area()
	{
		return 3.14 * poluprecnik * poluprecnik;
	}
	
	/* This  * Kljucna rec this ili referenca this pruza nacin da metoda zna koji tacno objekat je pozvao metodu,
	 *  tj sa cijim podacima radi. 
	 * Takodje, moze se koristiti za pristup podacima objekta koji su sakriveni lokalnim promenljivama 
	 *  ili parametrima metode. 
	 *  Takodje, odnosi se na trenutni objekat u metodi ili konstruktoru.*/
	
}
