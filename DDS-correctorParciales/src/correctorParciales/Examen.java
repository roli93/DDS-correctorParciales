package correctorParciales;

import java.util.Collection;
import java.util.stream.Stream;

public class Examen {
	
	private Collection<RespuestaDada> respuestasDadas;
	MetodoCorreccion metodoCorreccion;
	
	public Collection<RespuestaDada> getRespuestasDadas() {
		return respuestasDadas;
	}

	public void setRespuestasDadas(Collection<RespuestaDada> respuestasDadas) {
		this.respuestasDadas = respuestasDadas;
	}

	public MetodoCorreccion getMetodoCorreccion() {
		return metodoCorreccion;
	}

	public void setMetodoCorreccion(MetodoCorreccion metodoCorreccion) {
		this.metodoCorreccion = metodoCorreccion;
	}

	public double puntajeTotal(){
		
		return this.getRespuestasDadas().stream().map(unaRespuesta->unaRespuesta.puntajeEfectivo()).reduce(0.0, (a, b) -> a+b);
				
	}
	
	public double nota(){
		
		return this.getMetodoCorreccion().notaParaExamen(this);	
		
	}
	
}
