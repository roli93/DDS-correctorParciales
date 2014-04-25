package correctorParciales;

import java.util.Collection;
import java.util.stream.DoubleStream;

public abstract class ConjuntoCriterios {
	
	private Collection<MetodoCorreccion> criterios;
	
	public Collection<MetodoCorreccion> getCriterios() {
		return criterios;
	}

	public void setCriterios(Collection<MetodoCorreccion> criterios) {
		this.criterios = criterios;
	}

	protected DoubleStream notasDeCriteriosParaExamen(Examen unExamen){		
		 return this.getCriterios().stream().mapToDouble(unCriterio -> unCriterio.notaParaExamen(unExamen));
	}	
}
