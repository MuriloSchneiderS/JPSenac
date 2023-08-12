import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) throws Exception {
        //solicite ao usuário a quantidade de notas, leia essas notas
        //seus respectivos pesos, 
        //calcule a média, descartando a menor e a maior nota. 
        //Exiba o resultado.
        Scanner input = new Scanner(System.in);
        CalculadoraMediaDescarte2 calc = new CalculadoraMediaDescarte2(input);

        System.out.println("Deseja calcular:\n1-Média ponderada\n2-Média ponderada descartando a menor e a maior nota\nOutro-fechar");
        int escolha = input.nextInt();
        if     (escolha==1)calc.calcularMedia();
        else if(escolha==2)calc.calcularMediaDescarteMM();

        System.out.printf("A média ponderada é: %.1f",calc.media);

        input.close();
    }
}