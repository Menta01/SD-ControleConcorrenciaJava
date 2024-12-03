public class Cliente extends Thread {
    private static Banco banco = new Banco();
    private Conta conta;
    private double valor = 100;

    // Construtor da classe
    public Cliente(String nome, Conta conta) {
        super(nome);
        this.conta = conta;
    }

    // Método que define o comportamento da thread
    public void run() {
        double total = 0;
        System.out.println("Cliente " + getName() + " ativo.");
        
        // Loop de saque enquanto o banco permitir
        while (banco.saque(conta, valor)) {            
            total += valor;
        }

        System.out.println(getName() + " sacou um total de R$" + total);
    }
}
