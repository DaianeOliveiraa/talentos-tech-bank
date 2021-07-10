package dia7.ExerciciosOO;

public class Pessoa {
    //Crie uma classe para representar uma pessoa, com os atributos de nome, ano de nascimento e altura.
    // Crie também um método para imprimir todos dados de uma pessoa.
    // Crie um método para mostrar quantos anos a pessoa fará/terá neste ano.

    String nome ;
    int anoNascimento;
    Double altura;
    int idade;

   @Override
    public String toString() {
       return "Pessoa'{" +
               "nome='" + nome + '\'' +
               "anoNascimento='" + anoNascimento + '\'' +
               "altura='" + altura + '\'' +
               "idade='" + idade +
               "}";

   }
    public void imprimeDados(){

        System.out.println("Dados da pessoa: \n Nome:" + this.nome +"\n Ano de nascimento: " + this.anoNascimento + "\n Altura: " + this.altura);
    }

    public void calculaIdade(){
        idade = 2021 - this.anoNascimento;

        System.out.printf("A %s fará %d em 2021. ", this.nome, this.idade);
    }
}
