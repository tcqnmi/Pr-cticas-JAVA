package personaExc;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestPersona {

	@Test
	void testPersonaInt() throws Exception {
		Persona p1 = new Persona(22);
		assertEquals(22,p1.getEdad());
	}

	@Test
	void testPersona() {
		Persona p1 = new Persona();
		assertEquals(18,p1.getEdad());
	}

	@Test
	void testPersonaPersona() throws Exception {
		Persona p1 = new Persona(11);
		Persona p2 = new Persona(p1);
		assertEquals(p2.getEdad(),p1.getEdad());
	}

	@Test
	void testSetEdadOk() throws Exception {
		Persona p1 = new Persona();
		p1.setEdad(15);
		assertEquals(15,p1.getEdad());
	}
	@Test
	void testSetEdadInf0() throws Exception {
		//Assertions.assertThrows
		Assert.assertThrows(Exception.class, ()->{
			Persona p1 = new Persona();
			p1.setEdad(-15);
		});
	}
	@Test
	void testSetEdadSup122() throws Exception {
		Assert.assertThrows(Exception.class, ()->{
			Persona p1 = new Persona();
			p1.setEdad(155);
		});
	}

	@Test
	void testEsMayorEdad() throws Exception {
		Persona p1 = new Persona(16);
		assertFalse(p1.esMayorEdad());
	}
	
	
	@ParameterizedTest
	@CsvSource({
		"15, 'Escolar'",
		"29,'Laboral'",
		"90,'Jubilación'"
		
	})
	void testClasificar(int valor, String res) {
		Persona p1 = new Persona();
		assertEquals(res.toLowerCase(), p1.clasificar().toLowerCase());
	}

}
