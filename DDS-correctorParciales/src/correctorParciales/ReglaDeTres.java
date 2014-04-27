package correctorParciales;

public class ReglaDeTres implements MetodoCorreccion {
	
	public Double notaParaExamen(Examen unExamen) {
		return (unExamen.puntajeTotal())*10/(unExamen.getRespuestasDadas().size());
	}

}
