package calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculadoraTest{

	@Test
	public void testSomarInt() {
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(2, 3);
		assertEquals(5, resultado);
	}

	@Test
	public void testSomarDouble() {
		Calculadora calc = new Calculadora();
		double resultado = calc.somar(2.5, 3.5);
		assertEquals(6.0, resultado, 0.01);
	}

	@Test
	public void testSomarFloat() {
		Calculadora calc = new Calculadora();
		float resultado = calc.somar(2.5f, 3.5f);
		assertEquals(6.0f, resultado, 0.01f);
	}

	@Test
	public void testSomarLong() {
		Calculadora calc = new Calculadora();
		long resultado = calc.somar(2000000000L, 3000000000L);
		assertEquals(5000000000L, resultado);
	}

	@Test
	public void testSubtrairInt() {
		Calculadora calc = new Calculadora();
		int resultado = calc.subtrair(5, 3);
		assertEquals(2, resultado);
	}

	@Test
	public void testSubtrairDouble() {
		Calculadora calc = new Calculadora();
		double resultado = calc.subtrair(5.5, 3.3);
		assertEquals(2.2, resultado, 0.01);
	}

	@Test
	public void testSubtrairFloat() {
		Calculadora calc = new Calculadora();
		float resultado = calc.subtrair(5.5f, 3.3f);
		assertEquals(2.2f, resultado, 0.01f);
	}

	@Test
	public void testSubtrairLong() {
		Calculadora calc = new Calculadora();
		long resultado = calc.subtrair(3000000000L, 2000000000L);
		assertEquals(1000000000L, resultado);
	}

	@Test
	public void testMultiplicarInt() {
		Calculadora calc = new Calculadora();
		int resultado = calc.multiplicar(2, 3);
		assertEquals(6, resultado);
	}

	@Test
	public void testMultiplicarDouble() {
		Calculadora calc = new Calculadora();
		double resultado = calc.multiplicar(2.5, 3.5);
		assertEquals(8.75, resultado, 0.01);
	}

	@Test
	public void testMultiplicarFloat() {
		Calculadora calc = new Calculadora();
		float resultado = calc.multiplicar(2.5f, 3.5f);
		assertEquals(8.75f, resultado, 0.01f);
	}

	@Test
	public void testMultiplicarLong() {
		Calculadora calc = new Calculadora();
		long resultado = calc.multiplicar(2000000000L, 3L);
		assertEquals(6000000000L, resultado);
	}

	@Test
    public void testDividirInteiros() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(6, 2);
        assertEquals(3, resultado);
    }

    @Test
    public void testDividirInteirosComZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(6, 0);
        });
    }

    @Test
    public void testDividirDouble() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(6.0, 2.0);
        assertEquals(3.0, resultado, 0.00001);
    }

    @Test
    public void testDividirDoubleComZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(6.0, 0.0);
        });
    }

    @Test
    public void testDividirFloat() {
        Calculadora calculadora = new Calculadora();
        float resultado = calculadora.dividir(6.0f, 2.0f);
        assertEquals(3.0f, resultado, 0.00001);
    }

    @Test
    public void testDividirFloatComZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(6.0f, 0.0f);
        });
    }

    @Test
    public void testDividirLong() {
        Calculadora calculadora = new Calculadora();
        long resultado = calculadora.dividir(6L, 2L);
        assertEquals(3L, resultado);
    }

    @Test
    public void testDividirLongComZero() {
        final Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(6L, 0L);
        });
    }

}
