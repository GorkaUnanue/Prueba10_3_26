package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculadora2Test {

	@Test
	void testResta2True() {
		Calculadora2 calculadora = new Calculadora2 (10, 20);
		boolean mayor = calculadora.resta2();
		assertTrue (mayor, "El número 2 es mayor que el número 1");
		// Si falla este assert, significa que mayor es false y por tanto número 2 es mayor que numero 1
	}

	@Test
	void testResta2False() {
		Calculadora2 calculadora = new Calculadora2 (10, 20);
		boolean mayor = calculadora.resta2();
		assertFalse (mayor, "El número 2 es mayor que el número 1");
		// Si falla este assert, significa que mayor es true y por tanto número 1 es mayor que numero 2
	}

	@Test
	void testDivide2Null() {
		Calculadora2 calculadora = new Calculadora2 (10, 0);
		Integer result = calculadora.divide2();
		assertNull (result, "El resultado no es null");
	}
	
	@Test
	void testDivide2NotNull() {
		Calculadora2 calculadora = new Calculadora2 (10, 0);
		Integer result = calculadora.divide2();
		assertNotNull (result, "El resultado es null");
	}

	@Test
	void testRestaEquals() {
		Calculadora2 calculadora = new Calculadora2 (10, 20);
		int result = calculadora.resta();
		assertEquals (result, 10,  "El número 2 es mayor que el número 1");
	}
}