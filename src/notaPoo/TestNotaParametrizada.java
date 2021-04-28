package notaPoo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestNotaParametrizada {

	@ParameterizedTest
	@CsvSource({ 
		"4, 'Suspenso'",
		"6,'Notable'",
		"9,'Sobresaliente'"
		})
	void testEnLetra(int valor, String res) throws Exception {
		Nota n = new Nota(valor);
		assertEquals(res,n.enLetra());
	}

}
