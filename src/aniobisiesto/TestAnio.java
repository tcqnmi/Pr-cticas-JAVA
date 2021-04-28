package aniobisiesto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestAnio {

	@Test
	void testAnioInt() throws Exception {
		Anio y1 = new Anio(2020);
		assertEquals(2020,y1.getYear());
	}

	@Test
	void testAnio() {
		Anio y1 = new Anio();
		assertEquals(1900,y1.getYear());
	}

	@Test
	void testAnioAnio() throws Exception {
		Anio y1 = new Anio(2020);
		Anio y2 = new Anio(y1);
		assertEquals(y2.getYear(),y1.getYear());
	}

	@Test
	void testSetYearOk1() throws Exception {
		Anio y1 = new Anio(2020);
		assertEquals(2020,y1.getYear());
	}
	@Test
	void testSetYearInf1900() throws Exception {
		
		Assert.assertThrows(Exception.class, () -> {
			Anio y1 = new Anio();
			y1.setYear(1800);
		});
	}
	
	@Test
	void testSetYearSup2100() throws Exception {
		
		Assert.assertThrows(Exception.class, () -> {
			Anio y1 = new Anio();
			y1.setYear(2800);
		});
	}
	@Test
	void testEsBisiesto() throws Exception {
		Anio y1 = new Anio(2020);
		assertTrue(y1.esBisiesto());
	}

}
