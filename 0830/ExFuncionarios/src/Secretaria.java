public class Secretaria extends Funcionario{
    private int ramal;
    //C
    public Secretaria(){}
    public Secretaria(int ramal) {
        this.ramal = ramal;
    }
    public Secretaria(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }
    //G&S
    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}