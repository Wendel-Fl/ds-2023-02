import org.example.CalculadoraRaizQuadrada;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraRaizQuadradaTest {

    @Test
    public void testCalcularRaizQuadradaPositiva() {
        double x = 25;
        int iteracoes = 100;
        double tolerancia = 1e-6;
        double resultadoEsperado = 5.0;

        double resultadoCalculado = CalculadoraRaizQuadrada.calcularRaizQuadrada(x, iteracoes, tolerancia);

        assertEquals(resultadoEsperado, resultadoCalculado, tolerancia);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularRaizQuadradaNegativa() {
        double x = -25;

        CalculadoraRaizQuadrada.calcularRaizQuadrada(x, 100, 1e-6);
    }

    @Test
    public void testCalcularRaizQuadradaZero() {
        double x = 0;
        int iteracoes = 100;
        double tolerancia = 1e-6;

        double resultadoCalculado = CalculadoraRaizQuadrada.calcularRaizQuadrada(x, iteracoes, tolerancia);

        assertTrue(Double.isNaN(resultadoCalculado));
    }

    @Test
    public void testCalcularRaizQuadradaPequenaTolerancia() {
        double x = 10;
        int iteracoes = 100;
        double tolerancia = 1e-10;
        double resultadoEsperado = Math.sqrt(x);

        double resultadoCalculado = CalculadoraRaizQuadrada.calcularRaizQuadrada(x, iteracoes, tolerancia);

        assertEquals(resultadoEsperado, resultadoCalculado, tolerancia);
    }
}
