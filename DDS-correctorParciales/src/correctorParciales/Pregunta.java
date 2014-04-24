package correctorParciales;

public class Pregunta {
	T respuestaCorrecta;
	int pesoEspecifico;
	
	public T getRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void setRespuestaCorrecta(T respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	public int getPesoEspecifico() {
		return pesoEspecifico;
	}
	public void setPesoEspecifico(int pesoEspecifico) {
		this.pesoEspecifico = pesoEspecifico;
	}
	
	public boolean suRespuestaEs(T valorDado){
		return valorDado.equals(this.getRespuestaCorrecta());
	}

}
