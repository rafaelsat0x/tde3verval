public class CalculadoraDescontoTDD {

    public double calcularValorFinal(double valorCompra, Cliente cliente) {
        double valorFinal = aplicarDescontoPorFaixa(valorCompra);
        if (cliente.isVip()) {
            valorFinal = aplicarDescontoVip(valorFinal);
        }
        return valorFinal;
    }

    private double aplicarDescontoPorFaixa(double valorCompra) {
        if (valorCompra > 1000) {
            return valorCompra * 0.8;
        }
        if (valorCompra > 500) {
            return valorCompra * 0.9;
        }
        return valorCompra;
    }

    private double aplicarDescontoVip(double valor) {
        return valor * 0.95;
    }
}
