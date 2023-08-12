import java.util.Scanner;
public class Fumante{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por quantos anos você fumou?");
        int anos = input.nextInt();//total de anos fumando
        int dias = anos * 365;//total de dias fumando
        
        System.out.println("Quantos cigarros você fuma por dia?");
        int cigar = input.nextInt();//cigarros fumados por dia
        
        int total = dias * cigar;//total de cigarros fumados
        
        int perdido = total * 10;//total de minutos perdidos
        //anos fumando * 365 * cigarros por dia * 10
        perdido = perdido / 60;//total de horas perdidas
        perdido = perdido / 24;//total de dias perdidos
        //perdido = perdido / (24 * 60);
        System.out.println("Total de "+perdido+" dias de vida perdidos.");
        input.close();
    }
}