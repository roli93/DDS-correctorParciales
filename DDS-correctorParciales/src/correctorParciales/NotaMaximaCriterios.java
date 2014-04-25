package correctorParciales;

import java.util.OptionalDouble;

public class NotaMaximaCriterios extends ConjuntoCriterios {

	public OptionalDouble notaParaExamen(Examen unExamen) {
		return super.notasDeCriteriosParaExamen(unExamen).max();
	}
}