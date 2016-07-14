package com.rachel.junitTDD;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class CalculaRoyaltiesTest {

	@Test
	public void faturamentoInteiro(){
		BigDecimal faturamento = new BigDecimal("2000.00");
		BigDecimal taxa = new BigDecimal("100.00");
		BigDecimal valorEsperado = new BigDecimal("380.00");
		BigDecimal resultadoCalculo= CalculaRoyalties.calcular(faturamento,taxa);
        
		assertEquals(valorEsperado,resultadoCalculo);
	}
}
