import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas a serem inseridas: ");
        int quantidade = input.nextInt();
        if(quantidade<2){
            System.out.println("Erro! Digite um número maior que 2 para calcular a média!");
        }else{
            CalculadoraMediaDescarte calc = new CalculadoraMediaDescarte(quantidade, input);
            calc.calcular();
        }
        input.close();
    }
}