package correctorParciales;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class TablaConversion implements MetodoCorreccion {

	private ArrayList<ParDeConversion> paresConversion = new ArrayList<ParDeConversion>();

	public Collection<ParDeConversion> getParesConversion() {
		return this.paresConversion;
	}

	public Stream<ParDeConversion> getStreamDePares() {
		return this.getParesConversion().stream();
	}

	public void setNuevoParConversion(double unPuntaje,
			double unaNotaCorrespondiente) {
		ParDeConversion unPar = new ParDeConversion(unPuntaje,
				unaNotaCorrespondiente);
		this.getParesConversion().add(unPar);

	}

	public double notaParaExamen(Examen unExamen) {
		return this.getStreamDePares()
				.filter(par -> par.coincideCon(unExamen.puntajeTotal()))
				.findFirst().get().getPuntaje();
	}

}
