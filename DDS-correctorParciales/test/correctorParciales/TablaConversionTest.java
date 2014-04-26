package correctorParciales;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TablaConversionTest {

	@Test
	public void testDeQueLaTablaDevuelvaElValorConvertido() {
		Pregunta unaDificil = new Pregunta();
		unaDificil.setPesoEspecifico(5);
		unaDificil.setRespuestaCorrecta("UML");
		Pregunta unaFacil = new Pregunta();
		unaFacil.setPesoEspecifico(8);
		unaFacil.setRespuestaCorrecta("Ese código carece de cohesión.");
		
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
		
		for(int i =0;i<20;i++){
			tablita.setNuevoParConversion(i,i-1);
		}
		
		
		assertFalse(tablita.notaParaExamen(examen)==5);
		
	}
}
