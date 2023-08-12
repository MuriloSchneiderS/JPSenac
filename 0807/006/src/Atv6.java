import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int num=0;
        long fatorial = 1;
        do{
        System.out.println("Digite um número inteiro positivo(negativo/maior que 20 para encerrar): ");
        num = input.nextInt();

        CalculadoraFatorial calc = new CalculadoraFatorial(num);
        fatorial = calc.calcularFatorial();

        System.out.println("O fatorial de "+num+" é: "+fatorial);
        }while(fatorial!=0 && num<=20);
        System.out.println("Restultado impossível! Programa encerrado.");

        input.close();
    }
}