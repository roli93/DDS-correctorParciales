package correctorParciales;
import Examen;


public class ReglaDeTres implements MetodoCorreccion {
	
	public float notaParaExamen(Examen unExamen) {
		return (unExamen.puntajeTotal())*10/(unExamen.getRespuestasDadas().size());
	}

}
