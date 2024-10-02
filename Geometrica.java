package strategy;

public class Geometrica implements calcmedia {
	
	@Override
	 public String caso(double media) {
		 
	 return media <= 7.0 ? "Reprovado":"Aprovado";
	 
	 }
	
	 @Override
	 public double Media(double a, double b) {
		 
		 double med = Math.sqrt(a * b);
		 return med;
	 }
	 
	}
