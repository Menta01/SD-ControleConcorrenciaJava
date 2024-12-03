public class Banco {
    public boolean saque(Conta conta, double valor) {
        double novoSaldo = conta.debitarValor(valor);
        if (novoSaldo == -1) {
            return false; // Corrigido o erro de sintaxe aqui
        }
        System.out.println(Thread.currentThread().getName() + " sacou R$" + valor + ". Saldo após o saque: R$" + novoSaldo);
        return true;
    }
}
