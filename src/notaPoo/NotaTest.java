package notaPoo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	void testNotaInt() throws Exception {
		Nota n = new Nota(8);
		assertEquals(8,n.getNota());
		
	}

	@Test
	void testNota() {
		Nota n = new Nota();
		assertEquals(5,n.getNota());
	}

	@Test
	void testNotaNota() throws Exception {
		Nota n1 = new Nota(8);
		Nota n2 = new Nota(n1);
		assertEquals(n1.getNota(),n2.getNota());
	}

	@Test
	void testSetNotaOk() throws Exception {
		Nota n = new Nota();
		n.setNota(9);
		assertEquals(9,n.getNota());
	}
	//Ahora vamos a probar que nos de error al intentar meter una nota menor de 0
	@Test
	void testSetNotaInferiorCero(){
		Assert.assertThrows(Exception.class, () -> {
			Nota n = new Nota();
			n.setNota(-1);
		});		
		
	}
	@Test
	void testSetNotaSuperiorCero() {
		Assert.assertThrows(Exception.class, () -> {
			Nota n = new Nota();
			n.setNota(11);
		});		
	}

	@Test
	void testEsAprobado() throws Exception {
		Nota n1 = new Nota(8);
		assertTrue(n1.esAprobado());
	}

	@Test
	void testEsSuspenso() throws Exception {
		Nota n1 = new Nota(8);
		assertFalse(n1.esSuspenso());
	}

}
