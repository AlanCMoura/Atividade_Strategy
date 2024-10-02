package strategy;

public class Main {
	 public static void main(String[] args) {
	 
		 Disciplina disciplinaAritmetica = new Disciplina(new Aritmetica());
		 
		 disciplinaAritmetica.setP1(10.0);
		 disciplinaAritmetica.setP2(2.0);
		 disciplinaAritmetica.calcularMedia();
		 
		 System.out.println("Média: " + disciplinaAritmetica.getMedia());
		 System.out.println("Situação: " + disciplinaAritmetica.getSituacao());
		 Disciplina disciplinaGeometrica = new Disciplina(new Geometrica());
		
		 disciplinaGeometrica.setP1(5.0);
		 disciplinaGeometrica.setP2(9.0);
		 disciplinaGeometrica.calcularMedia();
		 
		 System.out.println("Média: " + disciplinaGeometrica.getMedia());
		 System.out.println("Situação: " + disciplinaGeometrica.getSituacao());
	 }
	}