public class CalculadoraPotencia {
    int base;
    int expoente;
    int resultado = 1;
    public CalculadoraPotencia(int b, int e){
        this.base = b;
        this.expoente = e;
    }
    public void calcular(){
        for(int c=1;c<=expoente;c++){
            resultado *= base;
        }
        System.out.println(base+"^"+expoente+" = "+resultado);
    }
}