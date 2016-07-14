package com.rachel.junitTDD;

import java.math.BigDecimal;

public class CalculaTaxa {
	
	
    public static BigDecimal calcular(BigDecimal valorTotal){
    	BigDecimal taxa = new BigDecimal(0);
    	
    	if (isFaixa2(valorTotal)) {
    		taxa = valorTotal.multiply(Constantes.TAXA2.getValor());
    	}else if (isFaixa1(valorTotal)){		
    		taxa = valorTotal.multiply(Constantes.TAXA1.getValor());
    	}
    	
    	return taxa.setScale(2, BigDecimal.ROUND_UP);
    }

	private static boolean isFaixa2(BigDecimal valorTotal) {
		return valorTotal.compareTo(Constantes.SUPERIOR_FAIXA1.getValor())==1 && valorTotal.signum()==1;
	}
	
	private static boolean isFaixa1(BigDecimal valorTotal) {
		return valorTotal.compareTo(Constantes.SUPERIOR_FAIXA1.getValor())<1 && valorTotal.signum()==1;
	}
}
