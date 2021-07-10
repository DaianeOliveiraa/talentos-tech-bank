package dia7;
import java.util.*;

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



    public static void exercicio5() {
        //Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra
        // chutando cada letra em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá que ele acertou,
        // caso tenha errado, o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o
        // usuário perde.
        System.out.println("JOGO DA FORCA");

        List<String> palavra = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String str = "banana";
        String completaPalavra = "_";
        String chute;
        int cont = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Chute uma letra");
            chute = in.nextLine();
            palavra.add(chute);

            if (str.contains(chute)) {
                System.out.println("Acertou!");
                cont++;

            } else {

                System.out.println("Errou!");
            }
            if (cont == str.length()) {
                System.out.println("Parabéns, você ganhou! \n Palavra correta: " + str + "\n Chutes: " + palavra);
                break;
            }

        }
        System.out.println("Você perdeu!");
    }

    public static void forca(){
        //resolução Anderson

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Jogador 1, escolha a palavra que deverá ser adivinhada!");
        String palavraParaSerAdivinhadaInput = in.next();

        System.out.println("Jogador 1, dê uma dica sobre a palavra");
        String dicaDaPalavraParaSerAdivinhada = in.next();

        palavraParaSerAdivinhadaInput = palavraParaSerAdivinhadaInput.trim();

        int maximoDeChutes = 10;

        char[] palavraParaSerAdivinhada = palavraParaSerAdivinhadaInput.toCharArray();


        List<Boolean> listaDeLetrasAcertadas = new ArrayList<>();
        for (char x : palavraParaSerAdivinhada) {
            listaDeLetrasAcertadas.add(false);
        }

        System.out.println("Agora é a vez do jogador 2...");
        System.out.printf("Sua dica é %s\n", dicaDaPalavraParaSerAdivinhada);

        while (maximoDeChutes > 0 && listaDeLetrasAcertadas.contains(false)) {
            System.out.println("Jogador 2, chute uma letra");
            char chute = in.next().charAt(0);

            boolean errouOhChute = true;
            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (chute == palavraParaSerAdivinhada[i]) {
                    listaDeLetrasAcertadas.set(i, true);
                    errouOhChute = false;
                }
            }

            if (errouOhChute) {
                maximoDeChutes--;
                System.out.printf("Agora você só tem %s chutes\n", maximoDeChutes);
            }

            for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
                if (listaDeLetrasAcertadas.get(i)) {
                    System.out.printf("%s ", palavraParaSerAdivinhada[i]);
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();


        }


        System.out.println("------------------------------");
        if (!listaDeLetrasAcertadas.contains(false)) {
            System.out.println("Jogador 2 ganhou o jogo");
        } else {
            System.out.println("Jogador 1 ganhou o jogo");
        }


        in.close();
    }


    public static void desafio2(){
        //Dado um array de números inteiros com valores negativos e positivos, encontre o número mais
        // próximo de zero. Se houver valores como 2 e -2, considere o número positivo
        Scanner in = new Scanner(System.in);
        List<Integer> numerosInteiros = new ArrayList<>();
        List<Integer> numerosInteirosAbs = new ArrayList<>();
        System.out.println("Informe quantidade de números: ");
        int n = in.nextInt();
        int menor = 100000;
        for(int i=0; i<n; i++){
            System.out.println("Digite valores inteiros negativos e positivos para compor o array: ");
            int num = in.nextInt();
            numerosInteiros.add(num);
            numerosInteirosAbs.add(Math.abs(num));

            if(numerosInteirosAbs.get(i) < menor ){
                menor = numerosInteirosAbs.get(i);
            }
        }
        System.out.printf("O número %d é o mais próximo de zero da lista de números inteiros: ", menor);
        System.out.println(numerosInteiros);
        }


    public static void main (String[] args) {
        //exercicio1();
       // exercicio1lista();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        //forca();
        //desafio2();
    }
}
