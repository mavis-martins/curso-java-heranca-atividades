    //Implemente a classe Administrador como subclasse da classe
    //Empregado. Um determinado administrador tem como atributos,
    //para além dos atributos da classe Pessoa e da classe Empregado,
    //o atributo ajudaDeCusto (ajudas referentes a viagens, estadias,
    //...). Note que deverá redefinir na classe Administrador o método
    //herdado calcularSalario (o salário de um administrador é
    //equivalente ao salário de um empregado usual acrescido das
    //ajuda de custo). Escreva um programa de teste adequado para
    //esta classe.
public class Administrador extends Trabalhador{
    private float ajudaCusto;

    public float getAjudaCusto(){
        return ajudaCusto;
    }

    public void setAjudaCusto(float ajudaCusto){
        this.ajudaCusto = ajudaCusto;
    }

    public Administrador(String nome){
        super(nome);
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + ajudaCusto;
    }
}
