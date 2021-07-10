package dia7;

public class CanetaBic extends Caneta{

    String tampaTraseira;

    CanetaBic(){ //construtor
        this.tubo = "Transparente";
        this.quantidadeDeTinta = 1.0;
        this.anoPatente = 2000;
    }

    @Override
    public String toString(){
        return "CanetaBic{" +
                "tampaTraseira=' " + tampaTraseira + '\'' +
                '}'+ "\n" + super.toString();

                /*",cor='" + cor + '\'' +
                ", tubo='" + tubo + '\'' +
                ", ponteira='" + ponteira + '\'' +
                ", carga='" + carga + '\'' +
                ", tamanhoDaCaneta='" + tamanhoDaCaneta + '\'' +
                ", quantidadeDeTinta='" + quantidadeDeTinta + '\'' +
                ", peso='" + peso +
                '}';*/
    }
}
