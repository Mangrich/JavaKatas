package TDDLesson;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PessoaTest {

	@ParameterizedTest
	@ValueSource(strings = {"Eduardo", "Eduardo"})
	public void test(String nome) {
		Pessoa pessoa = new Pessoa();
		pessoa.setName("Eduardo");
		assertEquals(nome, pessoa.getName());
	}
	
	
	
	

}
