package br.api.rest.service;

import java.util.Comparator;

import br.api.rest.model.Resultado;

public class ComparatorService  implements Comparator<Resultado>{
	
	@Override
	public int compare(Resultado o1, Resultado o2) {
		
		final int value1 = Integer.compare(o1.getNumeroChutes(), o2.getNumeroChutes());
		
		if(value1 != 0) {
			return value1;
		} else {
			return o1.getTempoVitoria().compareTo(o2.getTempoVitoria());
		}
		
	}

}
