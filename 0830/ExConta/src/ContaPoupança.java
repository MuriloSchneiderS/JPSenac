public class ContaPoupança extends Conta{
    private double taxaRendimento;
    //C
    public ContaPoupança(){}
    public ContaPoupança(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public ContaPoupança(String cliente, int numConta, double saldo, int taxaRendimento) {
        super(cliente, numConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    //
    public void calcularSaldo(int dia){
        double total = (taxaRendimento/100) * this.getSaldo() * dia / 365;
        System.out.printf("Total somado ao saldo em %d dias: R$%.2f%n",dia, total);
        this.setSaldo(this.getSaldo()+total);
    }
    //G&S
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}