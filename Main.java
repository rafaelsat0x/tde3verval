public class Main {
    public static void main(String[] args) {
        Cliente comum = new Cliente("Ana", false);
        Cliente vip = new Cliente("Bruno", true);

        System.out.println("Comum, R$ 600:  " + new CalculadoraDescontoTradicional(600, comum).pedidoFinal());
        System.out.println("VIP,   R$ 600:  " + new CalculadoraDescontoTradicional(600, vip).pedidoFinal());
        System.out.println("VIP,   R$ 1200: " + new CalculadoraDescontoTradicional(1200, vip).pedidoFinal());
    }
}
