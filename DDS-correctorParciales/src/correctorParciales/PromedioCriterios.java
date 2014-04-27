package correctorParciales;

import java.util.List;

public class PromedioCriterios extends ConjuntoCriterios {

	public Double notaParaExamen(Examen unExamen) {
		return this.promedio(super.notasDeCriteriosParaExamen(unExamen));
	}
	
	Double promedio(List<Double> notas){
		 return (notas.stream().mapToDouble(unaNota -> unaNota)).sum() / notas.stream().count();
	}

}