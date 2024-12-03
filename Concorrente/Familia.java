public class Familia {
    public static void main (String args[]) {
        // Cria conta conjunta da família com saldo inicial de 1000
        final Conta conta = new Conta(1000);  // Passando o saldo inicial
        
        // Cria familiares e lhes informa a conta conjunta
        Cliente pai = new Cliente("Pai ", conta);
        Cliente mae = new Cliente("Mãe ", conta);
        Cliente filho = new Cliente("Filho ", conta);
        
        // Inicia as threads
        pai.start();
        mae.start();
        filho.start();
    }
}
