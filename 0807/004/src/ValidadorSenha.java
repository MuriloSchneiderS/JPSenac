public class ValidadorSenha {
    public boolean validador(String senha){
        boolean maiuscula = false;
        boolean numero = false;
        boolean validez = false;
        for (int c = 0; c < senha.length(); c++) {//Loop passa por cada caractere
            char caractere = senha.charAt(c);//caractere recebe o caractere na posição correspondente à c, contador que vai de 0 ao tamanho da senha
            if (Character.isUpperCase(caractere)){//O caractere é maiúsculo?
                maiuscula = true;
            }else if(Character.isDigit(caractere)){//O caractere é um digito?
                numero = true;
            }
        }
        //ter no mínimo 8 caracteres 
        if(senha.length()<8){//O tamanho da senha é menor que 8 caracteres
            System.out.println("A senha precisa ter 8 ou mais caracteres!");
        //conter pelo menos uma letra maiúscula
        }else if(!maiuscula){//maiuscula é falso, portanto não há uma letra maiúscula
            System.out.println("A senha precisa ter pelo menos uma letra maiúscula!");
        //e um número.
        }else if(!numero){//numero é falso, portanto não há um número
            System.out.println("A senha precisa ter pelo menos um número!");
        }else{//Passou pelos testes acima, portanto é válida
            System.out.println("A senha é valida!");
            validez = true;
        }
        return validez;
    }
}