import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        /*(java tem $$var ?)
        int c=0;
        int p=1;
        do{
            Aluno ("aluno"+p) = new Aluno(input);
            alunos.add("aluno"+p);
            p++;
            System.out.println("Adicionar mais um aluno: Digite 0");
            c  = input.nextInt();
        }while(c==0);*/
        Aluno aluno1 = new Aluno(input);
        alunos.add(aluno1);
            
        for(Aluno aluno:alunos){
            aluno.mostrarDados();
        }
        input.close();
    }
}