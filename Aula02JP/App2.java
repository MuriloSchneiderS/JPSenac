import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Digite o valor da casa: ");
        double valCasa = input.nextDouble();
        System.out.println("Qual seu salário mensal? ");
        double salario = input.nextDouble();
        System.out.println("Em quantos anos você vai pagar? ");
        double anosPresta = input.nextDouble();

        double limite = salario * 0.3;
        
        double mensalPresta = valCasa / (anosPresta * 12);
        
        if(mensalPresta <= limite){
            System.out.println("Empréstimo aprovado, pagamento mensal: R$"+mensalPresta);
        }else{
            System.out.println("Empréstimo negado. A prestação mensal de R$"+mensalPresta+" excede 30% do salário mensal de R$"+salario+"!");
        }
        /*
        System.out.println("Digite dois números inteiros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println("O primeiro valor é o maior");
        }else if(num1<num2){
            System.out.println("O segundo valor é o maior");
        }else{
            System.out.println("Não existe valor maior, os dois são iguais");
        }
        */
        /*
        System.out.println("Qual é o seu nome? ");
        String nome = input.nextLine();
        System.out.println("Qual o seu salário? ");
        double sal = input.nextDouble();
        System.out.println("A quantos anos você trabalha na mesma empresa?");
        int anos = input.nextInt();
        double aum;
        if(anos<=3){
            aum = 0.03;
        }else if(anos>=10){
            aum = 0.20;
        }else{
            aum = 0.125;
        }
        sal = sal +(sal * aum);
        aum = aum * 100;
        System.out.println(nome+", você trabalha na empresa a "+anos+" anos na mesma empresa, e portanto receberá "+aum+"% de aumento, e seu novo salário será: R$"+sal);
        */
        /*
        System.out.println("Digite a Largura do terreno(m): ");
        double l = input.nextDouble();
        System.out.println("Digite o comprimento do terreno(m): ");
        double c = input.nextDouble();

        double area = c * l;

        String terreno;
        if(area<100){
            terreno = "TERRENO POPULAR";
        }else if(area>500){
            terreno = "TERRENO VIP";
        }else{
            terreno = "TERREMO MASTER";
        }

        System.out.println("O terreno possui "+area+"m² de área e portanto é um "+terreno);
        */
        /*
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Sexo(M/F): ");
        char sexo = input.next().charAt(0);
        System.out.println("Digite o valor do produto: ");
        double preco = input.nextDouble();
        double desc;

        if(sexo == 'F'){
            desc = 0.13;
        }else if(sexo == 'M'){
            desc = 0.05;
        }else{
            desc = 0.00;
        }
        preco = preco -(preco * desc);
        desc = desc * 100;

        System.out.println("Olá, "+nome+", já que seu sexo é "+sexo+", você terá acesso á "+desc+"% de desconto, e o preço final do produto será: R$"+preco);
        */
        /*
        System.out.println("Informe o preço do produto: ");
        double preco = input.nextDouble();

        System.out.println("Informe a condição de pagamento (\n1-À vista em dinheiro ou cheque, recebe 10% de desconto \n2 -À vista no cartão de crédito, recebe 15% de desconto \n3 Em duas vezes, preço normal de etiqueta sem juros \n4 Em trêsvezes, preço normal de etiqueta mais juros de 10%\n): ");
        int cond = input.nextInt();

        switch(cond){
            case 1:
                preco = preco -(preco * 0.10);
                break;
            case 2:
                preco = preco -(preco * 0.15);
                break;
            case 3:
                break;
            case 4:
                preco = preco +(preco * 0.10);
                break;
            default:
                System.out.println("Forma de pagamento inválida!(diferente de 1-4)");
                break;
        }
        System.out.println("O valor total a ser pagado será: R$"+preco);
        */
        /*
        System.out.println("Informe o ano do seu nascimento: ");
        int ano = input.nextInt();

        int idade = 2023 - ano;
        
        if(idade>18){
            int t = idade - 18;
            System.out.println("Você se alistou "+t+" anos atrás!");
        }else if(idade<18){
            int t = 18 - idade;
            System.out.println("Você não precisará se alistar no exército até daqui à "+t+" anos.");
        }else{
            System.out.println("Você terá de se alista no exército!");
        }
        */
        /*
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        
        if(num%2==0){
            num+=5;
        }else{
            num+=8;
        }

        System.out.println(num);
        */
        /*
        System.out.println("Informe o ano do seu nascimento: ");
        int ano = input.nextInt();

        int idade = 2023 - ano;
        String voto;
        if(idade>=16){
            voto = "PODE";
        }else{
            voto = "NÃO PODE";
        }

        System.out.println("Você "+voto+" votar!");
        */
        /*
        System.out.println("Informe a velocidade do carro: ");
        double vel = input.nextDouble();

        if(vel >80){
            double multa = (vel-80) * 5;
            System.out.println("O motorista foi multado em "+multa);
        }
        */
        /*
        System.out.println("Digite um número: ");
        int num = input.nextInt();

        int res;
        if(num >= 0){
            res = num * 2;
        }else{
            res = num * 3;
        }

        System.out.println(res);
        */
        /*
        System.out.println("Digite um ano: ");
        int ano = input.nextInt();
        String e;

        if(ano % 4 == 0){
            e = "É";
        }else{
            e = "NÃO É";
        }

        System.out.println("Este ano "+e+" BISSEXTO!");
        */
        /*
        System.out.println("Digite dois números, se forem iguais serão somados, se diferentes, multiplicados. ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int res;
        if(num1 == num2){
            res = num1 + num2;
        }else{
            res = num1 * num2;
        }

        System.out.println(res);
        */
        /*
        System.out.println("Digite um número: ");
        int num = input.nextInt();

        String parim;
        if(num % 2 == 0){
            parim = "par";
        }else{
            parim = "Ímpar";
        }

        System.out.println("O número digitado é "+parim);       
        */
        input.close();
    }
}