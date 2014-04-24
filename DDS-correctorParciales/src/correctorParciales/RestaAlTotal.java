package correctorParciales;
import Examen;


public class RestaAlTotal implements MetodoCorreccion {
	
	private float valorARestar;
	
	public void setValorARestar(float unValor) {
		this.valorARestar=unValor;		
	}
	
	public float getValorARestar() {
		return this.valorARestar;
	}
	
	public float notaParaExamen(Examen unExamen){
		return ((unExamen.puntajeTotal()) - (this.getValorARestar()));
	}

}
