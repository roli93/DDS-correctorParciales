package correctorParciales;

import static org.junit.Assert.*;
import org.junit.Test;

public class PreguntaTest {

	@Test
	public void test() {
		Pregunta laQueEsSobreTesting=new Pregunta();
		laQueEsSobreTesting.setPesoEspecifico(1);
		laQueEsSobreTesting.setRespuestaCorrecta("Debuggear puede llevar mucho tiempo.");
		
		RespuestaDada laDeUnAlumnoColgado= new RespuestaDada();
		laDeUnAlumnoColgado.setPreguntaQueContesta(laQueEsSobreTesting);
		laDeUnAlumnoColgado.setvalor("Debuggear suma mucha emocion al dia.");
		
		assertFalse(laQueEsSobreTesting.suRespuestaEs(laDeUnAlumnoColgado.getvalor()));
	}

}