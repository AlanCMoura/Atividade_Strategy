package strategy;

public class Aritmetica implements calcmedia {
	
	@Override
	 public String caso(double media) {
		 
	 return media <= 5.0 ? "Reprovado" : "Aprovado";
	
	 }
	
	 @Override
	 public double Media(double a, double b) {
		 double med = (a + b)/2;
		 return med;
	 }
	 
	}
