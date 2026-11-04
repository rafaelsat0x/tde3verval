import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraDescontoTradicionalTest {

    Cliente comum = new Cliente("Ana", false);
    Cliente vip = new Cliente("Bruno", true);

    @Test
    void compraAte500NaoTemDesconto() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(300, comum);
        assertEquals(300.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void compraDeExatamente500NaoTemDesconto() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(500, comum);
        assertEquals(500.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void compraAcimaDe500Recebe10PorCento() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(600, comum);
        assertEquals(540.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void compraDeExatamente1000Recebe10PorCento() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(1000, comum);
        assertEquals(900.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void compraAcimaDe1000Recebe20PorCento() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(1200, comum);
        assertEquals(960.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void vipSemDescontoDeFaixaRecebeApenas5PorCento() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(200, vip);
        assertEquals(190.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void vipAcimaDe500Recebe5PorCentoSobreValorComDesconto() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(600, vip);
        assertEquals(513.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void vipAcimaDe1000Recebe5PorCentoSobreValorComDesconto() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(1200, vip);
        assertEquals(912.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void compraAbaixoDe100PagaFrete() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(50, comum);
        assertEquals(65.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void freteConsideraValorAposDescontoVip() {
        CalculadoraDescontoTradicional calc = new CalculadoraDescontoTradicional(100, vip);
        assertEquals(110.0, calc.pedidoFinal(), 0.01);
    }

    @Test
    void valorZeradoLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CalculadoraDescontoTradicional(0, comum).pedidoFinal();
        });
    }

    @Test
    void valorNegativoLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CalculadoraDescontoTradicional(-50, comum).pedidoFinal();
        });
    }
}
