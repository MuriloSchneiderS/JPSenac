public class Funcionario {
    private String nome;
    private double salario;
    //C
    public Funcionario(){}
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    //
    public void calcularSalario(double vh, int ch){
        double s = ch*vh;
        this.setSalario(s);
    }
    //G&S
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}