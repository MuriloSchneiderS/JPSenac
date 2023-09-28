public class ContaEspecial extends Conta{
    private double limite;
    //C
    public ContaEspecial(){}
    public ContaEspecial(double limite) {
        this.limite = limite;
    }
    public ContaEspecial(String cliente, int numConta, double saldo, double limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }
    //
    @Override
    public void sacar(double saque){
        if(saque>this.getSaldo()+this.getLimite()){
            System.out.println("Saque impossível, valor maior que o limite máximo de saque de R$"+(this.getSaldo()+this.getLimite())+"(Saldo de R$"+this.getSaldo()+" + Limite especial de R$"+this.getLimite()+")");
        }else{
            this.setSaldo(this.getSaldo()-saque);
            if(this.getSaldo()>=0){
                System.out.println("Saque de R$"+saque+" realizado com sucesso! Saldo atual: R$"+this.getSaldo());
            }else{
                System.out.println("Saque de R$"+saque+" realizado com sucesso!\nDívida: R$"+(this.getSaldo()*-1)+" - Dívida limite: R$"+this.getLimite());
            }
        }
    }
    //G&S
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
}