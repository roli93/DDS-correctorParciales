package correctorParciales;

public class RespuestaDada {
	Object valor;
	Pregunta preguntaQueContesta;
	
	public double puntajeEfectivo(){
		return this.esCorrecta()?this.getPreguntaQueContesta().getPesoEspecifico():0;
	}
	
	public boolean esCorrecta(){
		return this.getPreguntaQueContesta().suRespuestaEs(this.getvalor());
	}

	public Object getvalor() {
		return valor;
	}

	public void setvalor(Object valor) {
		this.valor = valor;
	}

	public Pregunta getPreguntaQueContesta() {
		return preguntaQueContesta;
	}

	public void setPreguntaQueContesta(Pregunta preguntaQueContesta) {
		this.preguntaQueContesta = preguntaQueContesta;
	}

}
