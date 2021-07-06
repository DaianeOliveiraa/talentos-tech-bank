package dia7;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicios {

    public static void exercicio1(){
        //Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i=0; i<=5; i++) {
            System.out.println("Insira números: ");
            numeros[i] = in.nextInt();
        }


       System.out.println(Arrays.toString(numeros));
        in.close();
    }

    public static void exercicio1lista(){
        Scanner in = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        for(int i=0; i < 5; i ++) {
            System.out.println("Informe um número:");
            int num = in.nextInt();
            lista.add(num);
        }
        System.out.println(lista);

    }
    public static void exercicio2() {
        //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.
        Scanner in = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        //int[] numeros = new int[5];
        int cont = 0;

        for(int i=0; i<=5; i++) {
            System.out.println("Insira números: ");
            int numeros = in.nextInt();
            lista.add(numeros);
        }
        for(Integer numero : lista){
            if (numero < 0) {
                cont++;
            }
        }
        System.out.println(lista);
        System.out.println("Quantidade de números negativos: " +cont);
    }

    public static void exercicio3(){
        //Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.
        Scanner in = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        //int[] numeros = new int[5];
        int cont = 0;

        for(int i=0; i<=5; i++) {
            System.out.println("Insira números: ");
            int numeros = in.nextInt();
            lista.add(numeros);
        }
        for(Integer numero : lista){
            if (numero%2==0) {
                cont++;
            }
        }
        System.out.println(lista);
        System.out.println("Quantidade de números pares: " +cont);

        //System.out.println(lista.stream().filter(numero -> numero % 2 ==0 ).count());

    }

    public static void exercicio4(){
       // Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.
        Scanner in = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        //int[] numeros = new int[5];
        int maior = 0;

        for(int i=0; i<=5; i++) {
            System.out.println("Insira números: ");
            int numeros = in.nextInt();
            lista.add(numeros);
        }
        for(Integer numero : lista){
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println(lista);
        System.out.println("O maior valor da lista é: " +maior);

        //System.out.println(Collections.max(lista));
    }



    public static void exercicio5(){
        //Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra
        // chutando cada letra em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá que ele acertou,
        // caso tenha errado, o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o
        // usuário perde.
        System.out.println("JOGO DA FORCA");

        List<String> palavra = new ArrayList<>("TALENTO");
        Scanner in = new Scanner(System.in);
        for(int i=0; i<=10; i++){
            System.out.println("Chute uma letra");
            int letra = in.next.charAt(0);

            if(){
                System.out.println("Acertou!");

            }else{
                System.out.println("Errou!");
            }
        }

    }

    public static void main(String[] args) {
        //exercicio1();
       // exercicio1lista();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        exercicio5();
    }
}
