import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = input.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = input.nextInt();

        CalculadoraPotencia calculadora = new CalculadoraPotencia(base, expoente);
        calculadora.calcular();

        input.close();
    }
}