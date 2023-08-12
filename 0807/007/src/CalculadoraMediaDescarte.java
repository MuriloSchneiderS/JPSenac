import java.util.Scanner;

public class CalculadoraMediaDescarte {
    Scanner input;
    int quantidade;
    double num;
    double total;
    double menor;
    public CalculadoraMediaDescarte(int q, Scanner scanner){
        this.quantidade = q;
        this.input = scanner;
    }
    public void calcular(){
        for(int c=1;c<=quantidade;c++){
            System.out.println("Digite a "+c+"° nota: ");
            num = input.nextInt();
            if(c==1){
                menor = num;
            }else if(num<menor){
                menor = num;
            }
            total += num;
        }
        total -= menor;
        System.out.println("A média, excluindo a menor nota ("+menor+") é: "+(total/quantidade));
    }
}