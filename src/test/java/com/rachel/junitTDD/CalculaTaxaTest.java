package com.rachel.junitTDD;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class CalculaTaxaTest{

	@Test
    public void valorTotalInteiroFaixa1()
    {
		BigDecimal valorTotal = new BigDecimal("2000.00");
		BigDecimal valorEsperado = new BigDecimal("100.00");
		BigDecimal resultadoCalculo= CalculaTaxa.calcular(valorTotal);
        
		assertEquals(valorEsperado,resultadoCalculo);
    }
	
	@Test
    public void valorTotalInteiroFaixa2()
    {
		BigDecimal valorTotal = new BigDecimal("2001.00");
		BigDecimal valorEsperado = new BigDecimal("160.08");
		BigDecimal resultadoCalculo= CalculaTaxa.calcular(valorTotal);
        
		assertEquals(valorEsperado,resultadoCalculo);
    }
	
	@Test
    public void valorTotalZero()
    {
		BigDecimal valorTotal = new BigDecimal("0.00");
		BigDecimal valorEsperado = new BigDecimal("0.00");
		BigDecimal resultadoCalculo= CalculaTaxa.calcular(valorTotal);
        
		assertEquals(valorEsperado,resultadoCalculo);
    }
	
	@Test
    public void valorTotalNegativo()
    {
		BigDecimal valorTotal = new BigDecimal("-100.00");
		BigDecimal valorEsperado = new BigDecimal("0.00");
		BigDecimal resultadoCalculo= CalculaTaxa.calcular(valorTotal);
        
		assertEquals(valorEsperado,resultadoCalculo);
    }
	
}
