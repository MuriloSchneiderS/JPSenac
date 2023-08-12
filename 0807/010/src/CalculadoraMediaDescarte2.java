import java.util.Scanner;

public class CalculadoraMediaDescarte2 {
    Scanner input;

    int quantidade, pesoTot;
    float menor = 1000, maior = -1000;
    float media;
    //
    public CalculadoraMediaDescarte2(Scanner scanner){
        this.input = scanner;
        do{
            System.out.println("Digite a quantidade de notas: ");
            this.quantidade = input.nextInt();
            if(quantidade<1) System.out.println("Digite um número maior que 0 para a quantidade!");
        }while(quantidade<1);
    }

    public void calcularMedia(){
        float nota;
        int peso;
        for(int c=1;c<=quantidade;c++){
            System.out.println("Digite a "+c+"° nota e seu respectivo peso: ");
            nota = input.nextFloat();
            peso = input.nextInt();
            this.pesoTot += peso;
            this.media += (nota*peso);
        }
        this.media /= this.pesoTot;
    }
    public void calcularMediaDescarteMM(){
        float nota;
        int peso;
        for(int c=1;c<=quantidade;c++){
            System.out.println("Digite a "+c+"° nota e seu respectivo peso: ");
            nota = input.nextFloat();
            peso = input.nextInt();
            if(menor>nota)menor = nota;
            if(maior<nota)maior = nota;
            this.pesoTot += peso;
            this.media += (nota*peso);
        }
        this.media -= (menor+maior);
        this.media /= this.pesoTot;
    }
}