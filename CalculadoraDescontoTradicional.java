public class CalculadoraDescontoTradicional {
    private static final int DESCONTO_VIP = 5;

    private double valorCompra;
    private Cliente cliente;

    public CalculadoraDescontoTradicional(double valorCompra, Cliente cliente) {
        this.valorCompra = valorCompra;
        this.cliente = cliente;
    }

    public int desconto() {
        if (valorCompra > 1000) {
            return 20;
        } else if (valorCompra > 500) {
            return 10;
        }
        return 0;
    }

    public double aplicarDescontoVip(double valorComDesconto) {
        return valorComDesconto * (100 - DESCONTO_VIP) / 100.0;
    }

    public double pedidoFinal() {
        double valorFinal = valorCompra * (100 - desconto()) / 100.0;

        if (cliente.isVip()) {
            valorFinal = aplicarDescontoVip(valorFinal);
        }

        return valorFinal;
    }
}
