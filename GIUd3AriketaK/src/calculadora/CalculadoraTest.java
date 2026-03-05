package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private static Calculadora calculadora = null;
	static int numero1 = -1;
	
	@BeforeEach
	void incrementarNumero1() {
		numero1++;
		calculadora = new Calculadora (numero1, 2);
	}
		
	@Test
	void testSuma1() {
		int result = calculadora.suma();
		assertEquals (2, result);
	}
	
	@Test
	void testSuma2() {
		int result = calculadora.suma();
		assertEquals (3, result);
	}
	
	@Test
	void testSuma3() {
		int result = calculadora.suma();
		assertEquals (4, result);
	}
}