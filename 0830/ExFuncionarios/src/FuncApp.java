import java.util.Scanner;

public class FuncApp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Telefonista telefonista = new Telefonista();
        Secretaria secretaria = new Secretaria();

        System.out.println("Informe o nome do Gerente: ");
        gerente.setNome(input.nextLine());
        System.out.println("Digite o usuário do Gerente: ");
        gerente.setUsuario(input.nextLine());
        System.out.println("Informe a senha do Gerente: ");
        gerente.setSenha(input.nextLine());
        System.out.println("Informe o salário do Gerente: ");
        gerente.setSalario(input.nextDouble());

        input.nextLine();

        System.out.println("informe o nome da Telefonista: ");
        telefonista.setNome(input.nextLine());
        System.out.println("informe o código da Telefonista: ");
        telefonista.setCodigo(input.nextLine());
        System.out.println("Informe o salário da Telefonista: ");
        telefonista.setSalario(input.nextDouble());

        input.nextLine();

        System.out.println("Informe o nome da Secretária: ");
        secretaria.setNome(input.nextLine());
        System.out.println("Informe o número de ramal da Secretária: ");
        secretaria.setRamal(input.nextInt());
        System.out.println("Informe o salário da Secretária: ");
        secretaria.setSalario(input.nextDouble());

        System.out.println("Gerente: \n Nome:"+gerente.getNome()+"\n Usuário:"+gerente.getUsuario()+"\n Salário: "+gerente.getSalario()+
        "\nTelefonista: \n Nome:"+telefonista.getNome()+"\n Código: "+telefonista.getCodigo()+"\n Salário: "+telefonista.getSalario()+
        "\nSecretária: \n Nome:"+secretaria.getNome()+"\n Código de ramal: "+secretaria.getRamal()
        );

        input.close();
    }
}