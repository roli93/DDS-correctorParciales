package correctorParciales;

public abstract class ConjuntoCriterios {
	
	MetodoCorreccion criterios;
	
	public MetodoCorreccion getCriterios() {
		return criterios;
	}

	public void setCriterios(MetodoCorreccion criterios) {
		this.criterios = criterios;
	}

	Collection<Double> notasDeCriteriosParaExamen(Examen unExamen){
		
		return this.getCriterios().map(unCriterio -> unCriterio.notaParaExamen(unExamen));
		
	}

}
