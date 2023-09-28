import java.util.Scanner;

public class ContaApp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ContaPoupança poupança = new ContaPoupança();
        ContaEspecial especial = new ContaEspecial();

        System.out.println("Informe o nome do cliente_poupança: ");
        poupança.setCliente(input.nextLine());
        System.out.println("Informe o número da conta_poupança do cliente "+poupança.getCliente()+": ");
        poupança.setNumConta(input.nextInt());
        System.out.println("Informe o saldo da conta_poupança do cliente "+poupança.getCliente()+": ");
        poupança.setSaldo(input.nextDouble());
        System.out.println("Informe a taxa de rendimento da conta_poupança do cliente "+poupança.getCliente()+": ");
        poupança.setTaxaRendimento(input.nextDouble());
        System.out.println("Informe a quantidade de dias da conta_poupança: ");
        poupança.calcularSaldo(input.nextInt());
        
        input.nextLine();
        System.out.println("Informe o nome do cliente_especial: ");
        especial.setCliente(input.nextLine());
        System.out.println("Informe o núemero da conta_especial do cliente "+especial.getCliente()+": ");
        especial.setNumConta(input.nextInt());
        System.out.println("Informe o saldo da conta_especial do cliente "+especial.getCliente()+": ");
        especial.setSaldo(input.nextDouble());
        System.out.println("Informe o limite da conta_especial do cliente "+especial.getCliente()+": ");
        especial.setLimite(input.nextInt());
        input.nextLine();
        System.out.println("Insira o saque a efetuar na conta_especial do cliente "+especial.getCliente());
        especial.sacar(input.nextDouble());
        
        System.out.printf("INFO%nCliente_poupança %s#%d:%n  Saldo: R$%.2f%n  Taxa de Rendimento: %.0f%n",poupança.getCliente(),poupança.getNumConta(),poupança.getSaldo(),poupança.getTaxaRendimento());
        System.out.printf("Cliente_especial %s#%d:%n  Saldo: R$%.2f%n  Limite: R$%d.",especial.getCliente(),especial.getNumConta(),especial.getSaldo(),especial.getLimite());

        input.close();
    }
}