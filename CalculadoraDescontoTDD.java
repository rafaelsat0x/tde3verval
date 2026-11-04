public class CalculadoraDescontoTDD {

    public double calcularValorFinal(double valorCompra) {
        if (valorCompra > 1000) {
            return valorCompra * 0.8;
        }
        if (valorCompra > 500) {
            return valorCompra * 0.9;
        }
        return valorCompra;
    }
}
