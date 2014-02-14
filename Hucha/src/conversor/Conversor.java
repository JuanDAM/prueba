package conversor;

public class Conversor {

	private double grados;
	
	public Conversor(double grados){
		this.grados = grados;
	}
	
	public void setGrados(double grados){
		this.grados = grados;
		System.out.println("Modificación");
	}
	
	public double getGrados(){
		return grados;
	}
	
	public double getCentigrados(){
		return (grados - 32)* (5/9.0);
	}
	
	public double getFarenheit(){
		return ((9/5.0) * grados) + 32;
	}
	

}
