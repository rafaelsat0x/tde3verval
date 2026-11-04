import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraDescontoTDDTest {

    CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();

    @Test
    void compraAcimaDe500Recebe10PorCento() {
        assertEquals(540.0, calc.calcularValorFinal(600), 0.01);
    }

    @Test
    void compraAte500NaoTemDesconto() {
        assertEquals(500.0, calc.calcularValorFinal(500), 0.01);
    }
}
