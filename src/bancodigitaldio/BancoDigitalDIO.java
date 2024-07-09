package bancodigitaldio;


public class BancoDigitalDIO {
    public static void main(String[] args) {
        Cliente anderson = new Cliente("Anderson da Silva");
        Cliente marisa = new Cliente("Marisa Soares");
        Conta conta1 = new Conta(1, 0, anderson);
        Conta conta2 = new Conta(1, 0, marisa);
        
        
        conta1.depositar(150);
        conta2.depositar(350);
        conta2.sacar(20);
        conta1.extrato();
        conta2.extrato();
        
        conta2.transferir(100, conta1);
        conta1.extrato();
    }
}