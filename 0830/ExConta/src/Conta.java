public class Conta {
    private String cliente;
    private int numConta;
    private double saldo;
    //C
    public Conta(){}
    public Conta(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    //
    public void sacar(double saque){
        this.setSaldo(this.getSaldo()-saque);
        System.out.println("Saque de R$"+saque+" realizado com sucesso!");
    }
    public void depositar(double deposito){
        this.setSaldo(this.getSaldo()+deposito);
        System.out.println("Depósito de R$"+deposito+" realizado com sucesso!");
    }
    //G&S
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
}