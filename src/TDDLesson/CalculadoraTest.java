package TDDLesson;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class CalculadoraTest {
	
	
	@Test
	public void deve_retornar_soma_de_numeros_inteiros() {
		Calculadora calculadora = new Calculadora();
	
		assertEquals(9, calculadora.getSoma(5, 4));
	}
	
	@Test
	public void deve_retornar_o_proprio_argumento_caso_algum_numero_seja_nulo() {
		Calculadora calculadora = new Calculadora();
	
		assertEquals(4, calculadora.getSoma(null, 4));
		assertEquals(4, calculadora.getSoma(4, null));
	}
	
	@Test
	public void deve_retornar_subtracao_de_numeros_inteiros() {
		Calculadora calculadora = new Calculadora();
	
		assertEquals(1, calculadora.getSubtracao(5, 4));
	}
	
	@Test
	public void deve_retornar_divisao_de_numeros_inteiros() {
		Calculadora calculadora = new Calculadora();
	
		assertEquals(1, calculadora.getDivisao(5, 4));
	}
	
	@Test
	public void deve_retornar_multiplicacao_de_numeros_inteiros() {
		Calculadora calculadora = new Calculadora();
	
		assertEquals(20, calculadora.getMultiplicacao(5, 4));
	}

}
