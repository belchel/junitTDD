package com.rachel.junitTDD;

import java.math.BigDecimal;

public enum Constantes {
	
	SUPERIOR_FAIXA1(new BigDecimal("2000.00")),
	TAXA1(new BigDecimal("0.05")),
	TAXA2(new BigDecimal("0.08")),
	TAXA_ROYALTIES(new BigDecimal("0.2"));
	
	private BigDecimal valor;
		
	Constantes(BigDecimal valor) {
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
}
