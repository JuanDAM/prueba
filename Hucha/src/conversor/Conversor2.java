package conversor;

public class Conversor2 {
	
	public static double getCentigrados(double f) {
		return (f - 32)* (5/9.0);
	}
	
	public static double getFarenheit (double c) {
		return ((9/5.0) * c) + 32;
	}

}
