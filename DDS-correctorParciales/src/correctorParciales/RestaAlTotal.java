package correctorParciales;

public class RestaAlTotal implements MetodoCorreccion {
	
	private double valorARestar;
	
	public void setValorARestar(double unValor) {
		this.valorARestar=unValor;		
	}
	
	public double getValorARestar() {
		return this.valorARestar;
	}
	
	public Double notaParaExamen(Examen unExamen){
		return ((unExamen.puntajeTotal()) - (this.getValorARestar()));
	}

}
