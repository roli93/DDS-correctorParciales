package correctorParciales;
import java.util.Collection;
import java.util.stream.Stream;


public final class PromedioCriterios extends ConjuntoCriterios {

	public double notaParaExamen(Examen unExamen) {
	return	this,promedioPara(super.notasDeCriteriosParaExamen(unExamen));
	}
 double promedio(Collection<double> notas){
	 return notas.stream().sum() / notas.stream().count();
 }