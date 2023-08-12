public class ConversorMoedas {
    double real;
    double dolar;
    double valorConvertido;
    //
    public ConversorMoedas(double r, double d){
        this.real = r;
        this.dolar = d;
    }
    public double fazerConversao(){
        valorConvertido = real/dolar;
        return valorConvertido;
    }
}