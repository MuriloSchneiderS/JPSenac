import java.util.Scanner;
public class Atv4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean validez = false;
        do{
            System.out.println("Digite sua senha(A senha precisa conter: no mínimo 8 caracteres, pelo menos uma letra maiúscula e um número!): ");
            String senha = input.nextLine();

            ValidadorSenha validacao = new ValidadorSenha();
            validez = validacao.validador(senha);
        }while(!validez);
        input.close();
    }
}