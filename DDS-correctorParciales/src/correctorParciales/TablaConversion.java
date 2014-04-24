package correctorParciales;

import java.util.Collection;
import java.util.stream.Stream;

public class TablaConversion implements MetodoCorreccion {
	
	private Collection<ParDeConversion> paresConversion;
	
	public Collection<ParDeConversion> getParesConversion(){
		return this.paresConversion;
	}
	
	public Stream<ParDeConversion> getStreamDePares() {
		return this.getParesConversion().stream();
	}
	
	public void setNuevoParConversion(double unPuntaje, double unaNotaCorrespondiente) {
		ParDeConversion unPar = new ParDeConversion(unPuntaje, unaNotaCorrespondiente);
		this.getParesConversion().add(unPar);
				
	}

	public double notaParaExamen(Examen unExamen){
		return this.getStreamDePares().filter(par-> par.coincideCon(unExamen.puntajeTotal())).findAny().get().getNotaCorrespondiente();
		}
	
}
