import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraDescontoTDDTest {

    CalculadoraDescontoTDD calc = new CalculadoraDescontoTDD();
    Cliente comum = new Cliente("Ana", false);
    Cliente vip = new Cliente("Bruno", true);

    @Test
    void compraAcimaDe500Recebe10PorCento() {
        assertEquals(540.0, calc.calcularValorFinal(600, comum), 0.01);
    }

    @Test
    void compraAte500NaoTemDesconto() {
        assertEquals(500.0, calc.calcularValorFinal(500, comum), 0.01);
    }

    @Test
    void compraAcimaDe1000Recebe20PorCento() {
        assertEquals(960.0, calc.calcularValorFinal(1200, comum), 0.01);
    }

    @Test
    void clienteVipRecebe5PorCentoSobreValorComDesconto() {
        assertEquals(513.0, calc.calcularValorFinal(600, vip), 0.01);
    }

    @Test
    void compraAbaixoDe100PagaFrete() {
        assertEquals(65.0, calc.calcularValorFinal(50, comum), 0.01);
    }
}
