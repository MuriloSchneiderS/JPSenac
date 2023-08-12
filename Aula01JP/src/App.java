import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        double salario = 1200.00;
        double c1 = 200.00;
        double c2 = 120.00;
        double multa = 0.02;
        double descontado = (200 + (c1 * multa)) + (120 + (c2 * multa));

        System.out.println("João possui um salário de R$"+salario+
        ".\nDepois de pagar as contas de R$"+c1+
        " e uma multa de R$"+(c1 * multa)+", R$"+c2+
        " e uma multa de R$"+(c2 * multa)+
        ", pagando um total de R$"+descontado+
        ". \nAinda terá R$"+(salario-descontado)+" na conta!");
        /*
        System.out.println("Insira a quantia de moedas de \n1 centavo: ");
        int c1 = input.nextInt();
        System.out.println("5 centavos: ");
        int c5 = input.nextInt();
        System.out.println("10 centavos: ");
        int c10 = input.nextInt();
        System.out.println("25 centavos: ");
        int c25 = input.nextInt();
        System.out.println("50 centavos: ");
        int c50 = input.nextInt();
        System.out.println("1 Real: ");
        int r1 = input.nextInt();

        double total = r1 * 100 + c1 * 1 + c5 * 5 + c10 * 10 + c25 * 25 + c50 * 50;

        System.out.println("O total é: R$"+total);
        */
        /*
        double chip = 4.00;
        double alim = 3.50;//*2

        System.out.println("Quantos frangos a granja possui?");
        int quant = input.nextInt();

        double total = quant * (chip + 2 * alim);

        System.out.println("Uma granja com "+quant+" frangos, cada um possuindo 1 anel com chip de R$"+chip+" e dois anéis de alimento de R$"+alim+" gastaria um total de R$"+total+" para marcar todos os frangos.");
        */
        /*
        double hora = 10.00;
        double extra = 15.00;

        System.out.println("Qual a carga horária mensal do funcionário?");
        double carga = input.nextDouble();
        

        System.out.println("Quantas horas o funcionário trabalhou? ");
        double real = input.nextDouble();

        double bruto = carga * hora + (real - carga) * extra;

        double liquido = bruto - (bruto * 0.10);

        System.out.println("O funcionário trabalhou um total de "+(real-carga)+" horas extras, e deve receber:\nBruto: R$"+bruto+"\nLíquido (-10%): R$"+liquido);
        */
        /*
        System.out.println("Digite uma temperatura em celsius: ");
        float cels = input.nextFloat();
        float fahr = ((cels * 9) / 5) + 32;
        System.out.println(cels+"°C em Fahrenheit é: "+fahr+"°F");
        */
        /*
        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = input.nextInt();
 
        int dias = idade * 365;
 
        System.out.println(nome+", você possui "+idade+" anos, e "+dias+" dias em vida");
        */
        /*
        double paopre = 0.12;
        double broapre = 1.50;

        System.out.println("Quantos pãezinhos foram vendidos?");
        double paoq = input.nextDouble();
        double paotot = paoq * paopre;

        System.out.println("Quantas broas foram vendidas? ");
        double broaq = input.nextDouble();
        double broatot = broaq * broapre;

        double total = paotot + broatot;

        double poup = total * 0.10;

        System.out.println("Pãozinho: "+
        "\n  quantidade: "+paoq+
        "\n  preço: R$"+paopre+
        "\n  total: R$"+paotot+
        "\nBroas: "+
        "\n  quantidade: "+broaq+
        "\n  preço: R$"+broapre+
        "\n  total: R$"+broatot+
        "\nTotal: R$"+total+
        "\nPoupar(10%): R$"+poup
        );
        */
        /*
        System.out.println("Digite a altura plana do terreno (m): ");
        int h = input.nextInt();
        System.out.println("Digite a largura do terreno (m): ");
        int b = input.nextInt();

        System.out.println("A área do terreno é: "+(b*h)+"m²");
        */
        /*
        System.out.println("Digite um valor inteiro");
        int num = input.nextInt();
        
        int ant = num - 1;
        int suc = num + 1;

        System.out.println(ant+" _ "+num+" _ "+suc);
        */
        /*
        System.out.println("Digite dois valores inteiros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int soma = num1 + num2;
        int subt = num1 - num2;
        double divi = num1 / num2;
        int mult = num1 * num2;

        System.out.println(
            num1+" + "+num2+" = "+soma+"; \n"+
            num1+" - "+num2+" = "+subt+"; \n"+
            num1+" / "+num2+" = "+divi+"; \n"+
            num1+" * "+num2+" = "+mult
        );
        */
        /*
        System.out.println("Digite três valores: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        int sum = num1 + num2 + num3;
        double quad = Math.pow(sum, 2);

        System.out.println("O quadrado de "+sum+" é "+quad);
        */
        /*
        System.out.println("Digite um valor em dólar");
        double dol = input.nextDouble();
        System.out.println("Cotação do dólar: ");
        double cot = input.nextDouble();

        double real = dol * cot;

        System.out.println("Sob a cotação "+cot+" o valor U$"+dol+" equivale à R$"+real);
        */
        /*
        System.out.println("Valor A: ");
        int A = input.nextInt();
        System.out.println("Valor B: ");
        int B = input.nextInt();
        double dif;
        if (A>B){
            dif = A - B;
        }else{
            dif = B - A;
        }
        double qua = Math.pow(dif, 2);

        System.out.println("diferença: "+dif+" Quadrado: "+qua);
        */
        /*
        System.out.println("Informe o comprimento, largura e altura da caixa: ");
        double comp = input.nextDouble();
        double larg = input.nextDouble();
        double altu = input.nextDouble();

        double volu = comp * larg * altu;

        System.out.println("O volume é: "+volu);
        */
        /*
        System.out.println("Informe o valor A: ");
        int A = input.nextInt();

        System.out.println("Informe o valor B: ");
        int B = input.nextInt();

        int C = B;
        B = A;
        A = C;

        System.out.println("A: "+A+", B: "+B);
        */
        /*
        System.out.println("Informe o salário: ");
        double salario = input.nextDouble();

        System.out.println("Informe o acréscimo: ");
        double acre = input.nextDouble();
        salario = salario * acre;

        System.out.println("O salário acrescido em "+acre+"% é: "+salario);
        */
        /*
        double salario, acre;

        System.out.println("Informe o salário: ");
        salario = input.nextDouble();

        acre = salario * 1.25;
        System.out.println("O salário acrescido em 25% é: "+acre);
        */
        /*
        double cinicial, cfinal;
        
        System.out.println("Inofrme o custo inicial: ");
        cinicial = input.nextDouble();

        cfinal = cinicial * 1.45;
        System.out.println("O custo final é: "+cfinal);
        */
        /*
        double nota1, nota2, nota3, media;
        
        System.out.println("Informe a nota 1: ");
        nota1 = input.nextDouble();

        System.out.println("Informe a nota 2: ");
        nota2 = input.nextDouble();

        System.out.println("Informe a nota 3: ");
        nota3 = input.nextDouble();

        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.println("Média ponderada: "+media);
        */
        /*
        int idade, dias;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        idade = input.nextInt();

        dias = idade * 365;

        System.out.println("você possui "+idade+" anos, e "+dias+" dias em vida");
        double num1, num2, num3, media;
        Scanner input = new Scanner(System.in);

        System.out.println("Nota 1: ");
        num1 = input.nextDouble();

        System.out.println("Nota 2: ");
        num2 = input.nextDouble();

        System.out.println("Nota 3: ");
        num3 = input.nextDouble();

        media = (num1 + num2 + num3) / 3;

        System.out.println("Soma: "+media);
        */
        input.close();
    }
}