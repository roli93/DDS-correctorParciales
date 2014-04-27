package correctorParciales;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ExamenesTest {
	
	Pregunta unaDificil = new Pregunta();
	Pregunta unaFacil = new Pregunta();
	RespuestaDada primeraRespuesta = new RespuestaDada();
	RespuestaDada segundaRespuesta = new RespuestaDada();
	ArrayList<RespuestaDada> respuestas= new ArrayList<RespuestaDada>();
	Examen examen = new Examen();
	TablaConversion tablita = new TablaConversion();
	RestaAlTotal resta = new RestaAlTotal();
	PromedioCriterios tablaYResta= new PromedioCriterios();
	
	@Before
	public void init() throws Exception{
		
		unaDificil.setPesoEspecifico(5);
		unaDificil.setRespuestaCorrecta("UML");
		
		unaFacil.setPesoEspecifico(8);
		unaFacil.setRespuestaCorrecta("Ese codigo carece de cohesion.");
			
		primeraRespuesta.setvalor("UML");
		primeraRespuesta.setPreguntaQueContesta(unaDificil);
		
		segundaRespuesta.setvalor("Me huele mal.");
		segundaRespuesta.setPreguntaQueContesta(unaFacil);
		
		respuestas.add(primeraRespuesta);
		respuestas.add(segundaRespuesta);
		
		examen.setRespuestasDadas(respuestas);
		
		resta.setValorARestar(3);
		
		ArrayList<MetodoCorreccion> criterios = new ArrayList<>();
		
		criterios.add(tablita);
		criterios.add(resta);
		
		tablaYResta.setCriterios(criterios);
	
		for(int i =0;i<20;i++){
		tablita.setNuevoParConversion(i,i-1);
		}
	}
	
	
	
	@Test
	public void testDeQueLaTablaDevuelvaElValorConvertido() {
		assertFalse("La tabla no debería devovler 5",tablita.notaParaExamen(examen)==5);
		
	}
	
	@Test
	public void testRespondiendoBien() {		
		assertTrue("El alumno debería haber respondido bien",primeraRespuesta.puntajeEfectivo()==5);
	}
	
	@Test
	public void testEnElQueElAlumnoRespondeMal() {		
		assertFalse("El alumno debería haber respondido mal",segundaRespuesta.esCorrecta());
	}
	
	@Test
	public void testNotaBienCalculadaConTablita(){
		examen.setMetodoCorreccion(tablita);
		assertTrue("La nota debería ser 4",examen.nota()==4);
	}
	
	@Test
	public void testNotaBienCalculadaConPromedioTablaYResta(){
		examen.setMetodoCorreccion(tablaYResta);
		assertTrue("La Nota Debería Ser 3", examen.nota()==3);
		
	}
	

	

}
