package correctorParciales;

public class NotaMaximaCriterios extends ConjuntoCriterios {

	public Double notaParaExamen(Examen unExamen) {
		return super.notasDeCriteriosParaExamen(unExamen).stream().mapToDouble(unaNota->unaNota).max().getAsDouble();
	}
}