package correctorParciales;

import java.util.ArrayList;
import java.util.Collection;

public class TablaConversion implements MetodoCorreccion {

	private ArrayList<ParDeConversion> paresConversion = new ArrayList<ParDeConversion>();

	public Collection<ParDeConversion> getParesConversion() {
		return this.paresConversion;
	}

	public void setNuevoParConversion(double unPuntaje,
			double unaNotaCorrespondiente) {
		ParDeConversion unPar = new ParDeConversion(unPuntaje,
				unaNotaCorrespondiente);
		this.getParesConversion().add(unPar);

	}

	public Double notaParaExamen(Examen unExamen) {
		return this.getParesConversion().stream()
				.filter(par -> par.coincideCon(unExamen.puntajeTotal()))
				.findFirst().get().getNotaCorrespondiente();
	}

}
