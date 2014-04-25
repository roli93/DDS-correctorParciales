package correctorParciales;

import java.util.stream.DoubleStream;

public class PromedioCriterios extends ConjuntoCriterios {

	public double notaParaExamen(Examen unExamen) {
		return this.promedio(super.notasDeCriteriosParaExamen(unExamen));
	}
	
	double promedio(DoubleStream notas){
		 return notas.sum() / notas.count();
	}

}