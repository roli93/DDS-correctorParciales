package correctorParciales;

import java.util.Collection;
import java.util.stream.Stream;

public abstract class ConjuntoCriterios {
	
	private Collection<MetodoCorreccion> criterios;
	
	public Collection<MetodoCorreccion> getCriterios() {
		return criterios;
	}

	public void setCriterios(Collection<MetodoCorreccion> criterios) {
		this.criterios = criterios;
	}

	public Stream<Double> notasDeCriteriosParaExamen(Examen unExamen){		
		 return this.getCriterios().stream().map(unCriterio -> unCriterio.notaParaExamen(unExamen));
	}	
}
