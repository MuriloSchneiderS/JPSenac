import java.util.Scanner;
public class Atv11 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor desejado: R$");
        double valor = input.nextDouble();

        CaixaEletronico caixa = new CaixaEletronico();
        caixa.notas(valor);

        input.close();
    }
}