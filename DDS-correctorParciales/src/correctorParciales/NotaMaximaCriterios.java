package correctorParciales;
import java.util.stream.Stream;

public final class NotaMaximaCriterios extends ConjuntoCriterios {
	

	public double notaParaExamen(Examen unExamen) {
	super.notasDeCriteriosParaExamen(unExamen).max((unaNota,otraNota)->unaNota > otraNota).get();

     }
}