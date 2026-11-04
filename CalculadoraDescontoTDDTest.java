import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraDescontoTDDTest {

    @Test
    void compraAcimaDe500Recebe10PorCento() {
        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();
        assertEquals(540.0, calc.calcularValorFinal(600), 0.01);
    }
}
