package dia3;

public class Main {

    public static void main(String[] args) {

    }

    public static void operadores(){
        //Atribuição
        int idade = 20;

        int i = 1+1; //+ - * / ++ -- %

        System.out.println(10.0 / 3.0);
        System.out.println(10 %  3);


        boolean operadorRelacional = 1 == 2; // ==, !=, >, <, >=, <=
        //boolean tiposDiferentes = "1" == 1; Impossível de fazer no Java

        //Operadores Lógicos

        boolean testeLogio = 1 == 1 || 2 ==1;

        boolean invertido = !true;
    }

    public static void primeiroIf(){
        //int idade = 17;
        int idade = 1000;
        // boolean teste = idade >= 18;

        if(idade < 0){
            System.out.println("Idade inválida.");
        } else if (idade >= 150){
            System.out.println("Idade inválida");
        } else if (idade >= 18){
            System.out.println("Você tem permissão para assistir esse conteúdo.");
        } else {
            System.out.println("Você não tem permissão para assistir esse conteúdo");
        }

    }
}
