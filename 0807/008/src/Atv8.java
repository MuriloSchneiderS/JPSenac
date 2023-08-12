import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //solicite ao usuário um número inteiro positivo e exiba a representação desse número nas bases binária, octal e hexadecimal.
        System.out.println("Digite um número inteiro: ");//[...]positivo
        int num = input.nextInt();
        /*System.out.println(Integer.toBinaryString(num)+"\n"+
        Integer.toOctalString(num)+"\n"+
        Integer.toHexString(num));*/
        ConversorBases.converter(num);
        input.close();
    }
}