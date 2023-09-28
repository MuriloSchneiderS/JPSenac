import java.util.ArrayList;
import java.util.Scanner;
public class Aluno {
    Scanner input;

    private String nome;
    private int matricula;
    private String curso;
    private ArrayList<Double> notas = new ArrayList<>();
    //Construtor
    public Aluno(Scanner scanner){
        this.input = scanner;

        System.out.println("Informe o Nome do aluno: ");
        this.setNome(input.nextLine());

        System.out.println("Informe a Matrícula do aluno:");
        this.setMatricula(input.nextInt());
        
        input.nextLine();

        System.out.println("Informe  o Curso que o aluno faz: ");
        this.setCurso(input.nextLine());

        System.out.println("Informe a quantia de notas: ");
        int q = input.nextInt();

        input.nextLine();

        for(int c = 1;c<=q;c++){
            System.out.println("Digite a "+c+"° nota: ");
            this.setNotas(input.nextDouble());
        }
    }
    //Métodos
    public double calcularMedia(){
        /*calcula a média aritmética das notas do aluno, 
        recebe como parâmetro uma lista das notas e a quantidade de notas 
        e retorna o resultado da média.*/
        double media;
        double total=0;
        for(Double nota:this.getNotas()){
            total += nota;
        }
        media = total / this.getNotas().size();
        return media;
    }
    public void mostrarDados(){//@Override toString()
        /*método onde recebe como parâmetro o objeto Aluno. 
        Pode usar apenas o System.out.println.*/
        System.out.println(this.getClass().getName()+"{"+
        "\n Nome: "+this.getNome()+
        "\n Matrícula: "+this.getMatricula()+
        "\n Curso: "+this.getCurso()+
        "\n Notas: "+this.getNotas()+
        "\n Média: "+this.calcularMedia()+
        "\n}");
    }
    //Getter & Setters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
    public void setNotas(double a) {
        this.notas.add(a);
    }
}