import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números a serem inseridos: ");
        int quant = input.nextInt();
        if(quant<1){
            System.out.println("Erro, quantidade precisa ser maior que 0!");
        }else{
            VerificadorParImpar verif = new VerificadorParImpar(quant, input);
            System.out.println("Digite os números desejados: ");
            String stringTot = verif.Verificar();
            System.out.println(stringTot);
        }

        input.close();
    }
}