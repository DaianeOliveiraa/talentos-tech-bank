package dia2;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        exercicio6();
    }

    public static void exercicio1(){

        //Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.

        Scanner in = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        if(!in.hasNext()) {
            System.out.println("Valor inválido. Digite número do tipo inteiro.");
            in.close();
            //System.exit( status: 1);
        }
        int num = in.nextInt();


        if (num%2==0){
            System.out.println(+num + " é par!");
        }
        else {
            System.out.println(+num + " é ímpar!");
        }



    }
    
    public static void exercicio2(){
        //Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das categorias...

        Scanner in = new Scanner(System.in);
        System.out.println("Insira idade do nadador: ");
        if(!in.hasNext()) {
            System.out.println("Valor inválido. Digite número do tipo inteiro.");
            in.close();
            System.exit(1);
        }
        int idade = in.nextInt();

        if (idade>=5 && idade<=7){
            System.out.println("Infantil A");
        }
        else if (idade>=8 && idade<=11){
            System.out.println("Infantil B");
        }
        else if (idade>=12 && idade<=13){
            System.out.println("Juvenil A");
        }
        else if(idade>=14 && idade<=17){
            System.out.println("Juvenil B");
        }
        else if (idade>=18){
            System.out.println("Maiores que 18");
        }
        else{
            System.out.println("Categoria não encontrada para idade " +idade);
        }

    }
    public static void exercicio3(){
        //Escreva um algoritmo que leia dois números inteiros e determine qual é o menor e o maior também.

        Scanner in = new Scanner(System.in);
        System.out.println("Insira dois números inteiros: ");
        if(!in.hasNext()) {
            System.out.println("Valor inválido. Digite número do tipo inteiro.");
            in.close();
            System.exit(1);
        }

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if (n1<n2){
            System.out.println(+n1 + " é menor que " +n2);
            System.out.println(+n2 + " é maior que " +n1);
        }
        else if (n2<n1){
            System.out.println(+n2 + " é menor que " +n1);
            System.out.println(+n1 + " é maior que " +n2);
        }
        else{
            System.out.println(+n1 + " é igual a " +n2);
        }

    }


    public static void exercicio4(){
        //Construa um algoritmo que leia 10 valores inteiros e positivos e encontre o maior valor,
        //menor valor e a média dos números lidos
        Scanner in = new Scanner(System.in);
        int valor[] = new int[10];
        int maior = 0, menor = 1000;
        float somatorio=0, media=0;

        for( int i=0; i<valor.length; i++) {
            System.out.println("Insira 10 valores inteiros e positivos: ");
            if(!in.hasNext()) {
                System.out.println("Valor inválido. Digite número do tipo inteiro.");
                in.close();
                System.exit(1);
            }
            valor[i] = in.nextInt();

            somatorio = somatorio + valor[i];
            media = somatorio/10;

            if (valor[i]<menor) {
                menor = valor[i];
            }

            if(valor[i]>maior){
                maior = valor[i];
            }
        }
        System.out.println("Menor valor: " +menor+ "\nMaior valor: " +maior+ "\nMédia: " +media);


    }

    public static void exercicio5() {
        //Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas
        // (adição, subtração, multiplicação e divisão). Todas as operações serão entre dois valores.
        // No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha qual operação deseja realizar: \n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");

        if (!in.hasNext()) {
            System.out.println("Valor inválido. Digite número do tipo inteiro.");
            in.close();
            System.exit(1);
        }

        int n = in.nextInt();
        System.out.println("Insira dois valores: ");
        if (!in.hasNext()) {
            System.out.println("Valor inválido. Digite número do tipo inteiro.");
            in.close();
            System.exit(1);
        }
        float valor1 = in.nextFloat();
        float valor2 = in.nextFloat();

        if (n == 1) {
            float adicao = valor1 + valor2;
            System.out.println("Resultado da Adição é: " + adicao);
        } else if (n == 2) {
            float subtracao = valor1 - valor2;
            System.out.println("Resultado da Subtração é: " + subtracao);
        } else if (n == 3) {
            float multiplicacao = valor1 * valor2;
            System.out.println("Resultado da Multiplicação é: " + multiplicacao);
        } else if (n == 4) {
            if (valor2 == 0) {
                System.out.println("Não se pode dividir por 0");
            } else {
                float divisao = valor1 / valor2;

                System.out.println("Resultado da Divisão é: " + divisao);
            }
        }
         else{
                System.out.println("Opção escolhida não corresponde às operações disponiveis.");
            }

        }

        public static void exercicio6 () {
            //Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô). O algoritmo deverá
            // perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t]) e
            // deverá fazer o mesmo para o jogador 2.
            // No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate

            Scanner in = new Scanner(System.in);

            System.out.println("Jogador 1, escolha entre: \n1[pe]-Pedra\n2[pa]-Papel\n3[t]-Tesoura");
            int jogador1 = in.nextInt();
            System.out.println("Jogador 2, escolha entre: \n1[pe]-Pedra\n2[pa]-Papel\n3[t]-Tesoura");
            int jogador2 = in.nextInt();


            if (jogador1 == 1 && jogador2 == 1 || jogador1 == 2 && jogador2 == 2 || jogador1 == 3 && jogador2 == 3) {
                System.out.println("Empate!");

            } else if (jogador1 == 1 && jogador2 == 3 || jogador1 == 2 && jogador2 == 3 || jogador1 == 3 && jogador2 == 2) {
                System.out.println("Jogador 1 ganhou!");
            }

            else if (jogador1 == 1 && jogador2 == 2 || jogador1 == 2 && jogador2 == 3 || jogador1 == 3 && jogador2 == 2) {
                System.out.println("Jogador 2 ganhou!");

            } else {
                System.out.println("Opção inválida");
            }
        }
    }

