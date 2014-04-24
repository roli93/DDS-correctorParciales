package correctorParciales;

public class Pregunta {
	Object respuestaCorrecta;
	int pesoEspecifico;
	
	public Object getRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void setRespuestaCorrecta(Object respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	public int getPesoEspecifico() {
		return pesoEspecifico;
	}
	public void setPesoEspecifico(int pesoEspecifico) {
		this.pesoEspecifico = pesoEspecifico;
	}
	
	public boolean suRespuestaEs(Object valorDado){
		return valorDado.equals(this.getRespuestaCorrecta());
	}

}
