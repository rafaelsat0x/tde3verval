public class CalculadoraDescontoTDD {

    public double calcularValorFinal(double valorCompra) {
        if (valorCompra > 500) {
            return valorCompra * 0.9;
        }
        return valorCompra;
    }
}
