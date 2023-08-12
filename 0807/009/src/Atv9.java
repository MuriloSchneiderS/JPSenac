import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor em R$: ");
        double real = input.nextDouble();
        System.out.println("Digite a cotação do dólar $:");
        double dolar = input.nextDouble();
        ConversorMoedas conversor = new ConversorMoedas(real, dolar);
        double convertido = conversor.fazerConversao();

        System.out.printf("O valor convertido de R$%.2f com cotação do dólar à $%.2f é igual à: $%.2f",real,dolar,convertido);

        input.close();
    }
}