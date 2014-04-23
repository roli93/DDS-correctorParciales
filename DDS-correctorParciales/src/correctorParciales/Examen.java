package correctorParciales;

public class Examen {
	
	Collection<RespuestaDada> respuestasDadas;
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

	int puntajeTotal(){
		
		return this.getRespuestasDadas().stream()
		.map(unaRespuesta->unaRespuesta.puntajeEfectivo())
		.sum();
				
	}
	
	int nota(){
		
		return this.getMetodoCorreccion().notaParaExamen(this);	
		
	}
	
}
