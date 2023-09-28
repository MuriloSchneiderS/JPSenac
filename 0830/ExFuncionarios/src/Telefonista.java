public class Telefonista extends Funcionario{
    private String codigo;
    //C
    public Telefonista(){}
    public Telefonista(String codigo) {
        this.codigo = codigo;
    }
    public Telefonista(String nome, double salario, String codigo) {
        super(nome, salario);
        this.codigo = codigo;
    }
    //G&S
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
