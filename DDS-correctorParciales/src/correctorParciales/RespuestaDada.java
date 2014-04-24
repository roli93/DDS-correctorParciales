package correctorParciales;

public class RespuestaDada {
	T valor;
	Pregunta preguntaQueContesta;
	
	public double puntajeEfectivo(){
		return this.esCorrecta()?this.getPreguntaQueContesta().getPesoEspecifico():0;
	}
	
	public boolean esCorrecta(){
		return this.getPreguntaQueContesta().suRespuestaEs(this.getvalor());
	}

	public T getvalor() {
		return valor;
	}

	public void setvalor(T valor) {
		this.valor = valor;
	}

	public Pregunta getPreguntaQueContesta() {
		return preguntaQueContesta;
	}

	public void setPreguntaQueContesta(Pregunta preguntaQueContesta) {
		this.preguntaQueContesta = preguntaQueContesta;
	}

}
