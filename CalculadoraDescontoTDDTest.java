import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraDescontoTDDTest {

    @Test
    void compraAcimaDe500Recebe10PorCento() {
        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();
        assertEquals(540.0, calc.calcularValorFinal(600), 0.01);
    }

    @Test
    void compraAte500NaoTemDesconto() {
        CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();
        assertEquals(500.0, calc.calcularValorFinal(500), 0.01);
    }
}
