package correctorParciales;


import java.util.List;
import java.util.stream.Collectors;

public abstract class ConjuntoCriterios implements MetodoCorreccion {
	
	private List<MetodoCorreccion> criterios;
	
	public List<MetodoCorreccion> getCriterios() {
		return criterios;
	}

	public void setCriterios(List<MetodoCorreccion> criterios) {
		this.criterios = criterios;
	}

	protected List<Double> notasDeCriteriosParaExamen(Examen unExamen){	
			
	     return this.getCriterios().stream().map(unCriterio->unCriterio.notaParaExamen(unExamen)).collect(Collectors.toList());
		

	}	
	
}
