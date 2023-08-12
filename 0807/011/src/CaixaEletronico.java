public class CaixaEletronico {
    public void notas(double v){
        
        String centStr = String.valueOf(v); // converter para String
        centStr = centStr.split("\\.")[1]; //quebrar aonde esta o ponto e pegar o valor após
        int centavos  = Integer.valueOf(centStr); //converter de para int

        int cemReais = ((int)v)/100;
        double cemResto = v%100;

        int cinquentaReais = ((int)cemResto)/50;
        double cinquentaResto = cemResto%50;
        
        int vinteReais = ((int)cinquentaResto)/20;
        double vinteResto = cinquentaResto%20;

        int dezReais = ((int)vinteResto)/10;

        double restoD = vinteResto%10;
        int restoI = (int)restoD;
        
        System.out.println("Valor resultante:\nNotas de 100: "+cemReais+"\nNotas de 50: "+cinquentaReais+"\nNotas de 20: "+vinteReais+"\nNotas de 10: "+dezReais+"\nRestante: R$"+restoI+" e "+centavos+" centavos("+restoD+").");
    }
}