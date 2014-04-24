package correctorParciales;

public class ParDeConversion {
	
	private double puntaje;
	private double notaCorrespondiente;
	
	public void setPuntaje(double unPuntaje){
		this.puntaje=unPuntaje;
	}
	
	public double getPuntaje(){
		return this.puntaje;
	}
	
	public void setNotaCorrespondiente(double unaNota){
		this.notaCorrespondiente=unaNota;
	}
	
	public double getNotaCorrespondiente(){
		return this.notaCorrespondiente;
	}
	
	public boolean coincideCon(double unPuntaje){
		return (this.getPuntaje() == unPuntaje);
	}
	
	public ParDeConversion(double unPuntaje, double unaNota){
		this.puntaje=unPuntaje;
		this.notaCorrespondiente=unaNota;
	}
	
}
