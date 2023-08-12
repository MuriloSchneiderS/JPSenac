import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = input.nextInt();
        Tabuada tabuada = new Tabuada(num);
        tabuada.calculoTabuada();

        input.close();
    }
}