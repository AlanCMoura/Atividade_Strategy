package strategy;

public class Disciplina {
	
	 private calcmedia calcmedia;
	 private double media;
	 private String nome;
	 private double p1;
	 private double p2;
	 
	 public Disciplina(calcmedia Media) {
	 this.calcmedia = Media;
	 }
	 
	 public void calcularMedia() {
	 this.media = calcmedia.Media(p1, p2);
	 }

	 public double getMedia() {
	 return media;
	 }
	 
	 public String getNome() {
	 return nome;
	 }
	 
	 public void setNome(String nome) {
	 this.nome = nome;
	 }
	 
	 public double getP1() {
	 return p1;
	 }
	 
	 public void setP1(double p1) {
	 this.p1 = p1;
	 }
	 
	 public double getP2() {
	 return p2;
	 }
	 
	 public void setP2(double p2) {
	 this.p2 = p2;
	 }
	 
	 public String getSituacao() {
	 return calcmedia.caso(media);
	 }
	 
	}
