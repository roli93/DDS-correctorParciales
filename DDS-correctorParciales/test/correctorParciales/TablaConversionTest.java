package correctorParciales;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TablaConversionTest {

	@Test
	public void test() {
		Pregunta unaDificil = new Pregunta();
		unaDificil.setPesoEspecifico(5);
		unaDificil.setRespuestaCorrecta("UML");
		Pregunta unaFacil = new Pregunta();
		unaFacil.setPesoEspecifico(1);
		unaFacil.setRespuestaCorrecta("Ese c�digo carece de cohesi�n.");
		
		RespuestaDada primerRespuesta = new RespuestaDada();
		primerRespuesta.setvalor("UML");
		primerRespuesta.setPreguntaQueContesta(unaDificil);
		RespuestaDada segundaRespuesta = new RespuestaDada();
		segundaRespuesta.setvalor("Me huele mal.");
		segundaRespuesta.setPreguntaQueContesta(unaFacil);
		ArrayList<RespuestaDada> respuestas= new ArrayList<RespuestaDada>();
		respuestas.add(primerRespuesta);
		respuestas.add(segundaRespuesta);
		
		Examen examen = new Examen();

		TablaConversion tablita = new TablaConversion();
		
		examen.setMetodoCorreccion(tablita);
		examen.setRespuestasDadas(respuestas);
		
		tablita.setNuevoParConversion(10,5);
		
		assertTrue(tablita.notaParaExamen(examen)==5);
		
	}
}