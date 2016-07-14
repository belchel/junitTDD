package com.rachel.junitTDD;

import java.math.BigDecimal;

public class CalculaRoyalties {

	public static BigDecimal calcular(BigDecimal faturamento, BigDecimal taxa) {
		BigDecimal royalties = new BigDecimal("0.00");
		
		if (faturamento.signum()==1){
			royalties = insertTaxaRoyalties(faturamento,taxa);
		}
		
		return royalties.setScale(2, BigDecimal.ROUND_UP);
	}

	public static BigDecimal insertTaxaRoyalties(BigDecimal faturamento, BigDecimal taxa){
		return faturamento.subtract(taxa).multiply(Constantes.TAXA_ROYALTIES.getValor());
		
	}
}
