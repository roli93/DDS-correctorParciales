package correctorParciales;

public class ParDeConversion {
	
	private float puntaje;
	private float notaCorrespondiente;
	
	public void setPuntaje(float unPuntaje){
		this.puntaje=unPuntaje;
	}
	
	public float getPuntaje(){
		return this.puntaje;
	}
	
	public void setNotaCorrespondiente(float unaNota){
		this.notaCorrespondiente=unaNota;
	}
	
	public float getNotaCorrespondiente(){
		return this.notaCorrespondiente;
	}
	
	public boolean coincideCon(float unPuntaje){
		return (this.getPuntaje() == unPuntaje);
	}
	
	public ParDeConversion(float unPuntaje, float unaNota){
		this.puntaje=unPuntaje;
		this.notaCorrespondiente=unaNota;
	}
	
}
