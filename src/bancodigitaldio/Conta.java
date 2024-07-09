package bancodigitaldio;

public class Conta {
    private int agencia;
    private int conta;
    private double saldo;
    private Cliente cliente;
    
    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;

    public Conta(int agencia, double saldo, Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = sequencial++;
        this.saldo = 0.0;
        this.cliente = cliente;
    } 
    
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Sacado da conta " + this.conta + " o valor: R$" + valor);
            System.out.println("Novo saldo: R$" + saldo);
        }else {
            System.out.println("Indisponível sacar um valor maior que o seu saldo.");
        }
    }
    
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depositado na conta " + this.conta + " o valor de: R$" + valor);
        }else {
            System.out.println("Valor de depósito inválido.");
        }
        
    }
    
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Tranferido com sucesso da conta " + this.conta + " para a conta destino " + contaDestino.conta);
    }
    
    public void extrato(){
        System.out.println("Dados do cliente: " + cliente.getNome());
        System.out.println("Saldo da conta " + this.conta + ": R$" + saldo);
    }
    
}
