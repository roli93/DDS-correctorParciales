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

	public float puntajeTotal(){
		
		return this.getRespuestasDadas().stream()
		.map(unaRespuesta->unaRespuesta.puntajeEfectivo())
		.sum();
				
	}
	
	public float nota(){
		
		return this.getMetodoCorreccion().notaParaExamen(this);	
		
	}
	
}
