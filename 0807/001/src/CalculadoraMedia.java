import java.util.Scanner;
public class CalculadoraMedia {
    Scanner input;

    int quant;
    double total = 0;
    double media = 0;
    //
    public CalculadoraMedia(int q, Scanner scanner){
        this.quant = q;
        this.input = scanner;
    }

    public double CalcularMedia(){
        for(int c=1;c<=quant;c++){
            System.out.println("Digite o "+c+"° número: ");
            total += input.nextInt();
        }
        media = (total/quant);
        return media;
    }
}
