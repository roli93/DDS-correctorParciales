package correctorParciales;

import static org.junit.Assert.*;
import org.junit.Test;

public class RespuestaDadaTest {

	@Test
	public void test() {
		Pregunta preguntaDeCualidades = new Pregunta();
		preguntaDeCualidades.setPesoEspecifico(1);
		preguntaDeCualidades.setRespuestaCorrecta('B');
		
		RespuestaDada deUnAlumnoAtento = new RespuestaDada();
		deUnAlumnoAtento.setPreguntaQueContesta(preguntaDeCualidades);
		deUnAlumnoAtento.setvalor('B');
		
		assertTrue(deUnAlumnoAtento.puntajeEfectivo()==1);
	}

}