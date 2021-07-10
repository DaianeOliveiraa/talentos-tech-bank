package dia7;

public class Caneta {

    public String cor;
    String tubo;
    String ponteira;
    String carga;
    Double tamanhoDaCaneta;
    Double quantidadeDeTinta = 0.5;
    Double peso;
    Integer anoPatente = 1923;

    @Override
    public String toString(){
        return "Caneta{" +
                "cor='" + cor +
                ", tubo='" + tubo + '\'' +
                ", ponteira='" + ponteira + '\'' +
                ", carga='" + carga + '\'' +
                ", tamanhoDaCaneta='" + tamanhoDaCaneta + '\'' +
                ", quantidadeDeTinta='" + quantidadeDeTinta + '\'' +
                ", peso='" + peso + 
                '}';
    }
    public void imprimiQuantidadeTinta(){

        System.out.println("Quantidade de tinta = " + this.quantidadeDeTinta);
    }

}
