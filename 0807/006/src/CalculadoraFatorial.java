public class CalculadoraFatorial {
    int num;
    long fatorial;
    //
    public CalculadoraFatorial(int n){
        this.num = n;
        this.fatorial = n;
    }

    public long calcularFatorial(){
        if(num<0){
            fatorial = 0;
        }else if(num<2){
            fatorial = 1;
        }else{
            for(int c=(num-1);c>1;c--){
                fatorial *= c;
            }
        }
        return fatorial;
    }
}