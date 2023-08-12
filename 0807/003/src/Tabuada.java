public class Tabuada {
    int num;
    public Tabuada(int n){
        this.num = n;
    }
    public void calculoTabuada(){
        for(int c=1;c<=10;c++){
            System.out.println(num+" * "+c+" = "+(num*c));
        }
    }
}