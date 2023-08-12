public class ConversorBases {
    
    //
    public static void converter(int num){
        
        String binario = ConversorBases.binario(num);
        String octal = ConversorBases.octal(num);
        String hexadecimal = ConversorBases.hexadeciaml(num);
        
        System.out.println("Decimal: "+num+"\n"+
        "Binário: "+binario+"\n"+
        "Octal: "+octal+"\n"+
        "Hexadecimal: "+hexadecimal);
    }
    
    public static String binario(int num){//Integer.toBinaryString(num)
        int i;
        String binario = "";
        String sinal = "0";
        if(num==0){
            binario = "0";
        }else if(num<0){
            sinal = "1";
            num = num*-1;
        }
        while(num>0){
            i = num%2;
            binario = i+binario;
            num = num/2;
        }

        return sinal+binario;
    }
    public static String octal(int num){//Integer.toOctalString(num)
        int i;
        String octal = "";
        String sinal = "";
        if(num==0){
            octal = "0";
        }else if(num<0){
            sinal = "-";
            num = num*-1;
        }
        while(num>0){
            i = num%8;
            octal = i+octal;
            num = num/8;
        }

        return sinal+octal;
    }
    public static String hexadeciaml(int num){//Integer.toHexString(num)
        int i;
        String hexadecimal = "";
        String sinal = "";
        if(num==0){
            hexadecimal = "0";
        }else if(num<0){
            sinal = "-";
            num = num*-1;
        }
        while(num>0){
            i = num%16;
            hexadecimal = Integer.toHexString(i).toUpperCase() + hexadecimal;
            num = num/16;
        }

        return sinal+hexadecimal;
    }
}