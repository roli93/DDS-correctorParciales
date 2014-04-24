package correctorParciales;

public class ReglaDeTres implements MetodoCorreccion {
	
	public double notaParaExamen(Examen unExamen) {
		return (unExamen.puntajeTotal())*10/(unExamen.getRespuestasDadas().size());
	}

}
