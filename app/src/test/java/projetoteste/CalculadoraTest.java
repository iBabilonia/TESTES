package projetoteste;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import projetoteste.Calculadora;

public class CalculadoraTest {
   
	private Calculadora calculadora;
	
	@Before
	public void setUp()throws Exception {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testarSomaPositivo() {
		assertEquals("", 5, calculadora.soma(2, 3));
	}
	
	@Test
	public void testarSomaNegativos() {
		assertEquals("", -5, calculadora.soma(-10, 5));
	}
	
	@Test
	public void testarsubtracaoPositivo() {
		assertEquals("", 1, calculadora.subtracao(6, 5));
	}
	
	@Test
	public void testarsubtracaoNegativo() {
		assertEquals("", -5, calculadora.subtracao(5, 10));
	}
	
	@Test
	public void testarmultiplicacaoPositivo() {
		assertEquals("", 10, calculadora.multiplicacao(5, 2));
	}
	
	@Test
	public void testarmultiplicacaoNegativo() {
		assertEquals("", 6, calculadora.multiplicacao(-3, -2));
	}
	
	@Test
	public void testardivisaopositivo() {
		assertEquals("", 5, calculadora.divisao(10, 2));
	}
	
	@Test
	public void testardivisaoNegativo() {
		assertEquals("", -5, calculadora.divisao(-10, 2));
	}
	
	
	
}
