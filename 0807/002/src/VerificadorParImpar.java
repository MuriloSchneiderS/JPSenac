import java.util.Scanner;
public class VerificadorParImpar {
    Scanner input;

    int quant;

    int[] num;
    String paridade;
    String verificado = "";
    //
    public VerificadorParImpar(int q, Scanner scanner){
        this.quant = q;
        this.input = scanner;
        num = new int[q];
    }

    public String Verificar(){
        for(int c=0;c<quant;c++){
            System.out.println("Digite o "+(c+1)+"° número: ");
            num[c] = input.nextInt();
        }
        for(int c=0;c<quant;c++){
            if(num[c]%2==0){
                paridade = "É par";
            }else{
                paridade = "Não é par";
            }
            verificado += ((c+1)+"° número: "+num[c]+" "+paridade+".\n");
        }
        return verificado;
    }
}