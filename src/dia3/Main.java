package dia3;

public class Main {

   /* public static int metodoRecursivo(int i) {
        if (i <= 10) {
            return metodoRecursivo(i + 1);
        }

    }*/

    public static void main(String[] args) {
        System.out.println("WHILE");
        int contagem = 1;

        while (contagem < 11) {
            System.out.println(contagem);
            contagem++;
        }

        System.out.println("DO WHILE");
        contagem = 1;
        do {
            System.out.println(contagem);
            contagem++;
        } while (contagem < 11);
    }
}
    //testando o dowhile

    /*boolean condicao = true;


    do{
        if (i > 0) {
            condicao = false;
        }
    } while(condicao);

    System.out.println("FOR")

    for(int i=0; i<=10; i++){
        System.out.println(i);
    }





//TODO PESQUISAR CENARIOS MELHORES PARA WHILE E DO WHILE

    //para (i=0; i<10; i++)



}
*/