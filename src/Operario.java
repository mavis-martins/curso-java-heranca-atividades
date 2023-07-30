    //Implemente a classe Operario como subclasse da classe
    //Empregado. Um determinado operário tem como atributos, para
    //além dos atributos da classe Pessoa e da classe Empregado, o
    //atributo valorProducao (que corresponde ao valor monetário dos
    //artigos efetivamente produzidos pelo operário) e comissao (que
    //corresponde à porcentagem do valorProducao que será
    //adicionado ao vencimento base do operário). Note que deverá
    //redefinir nesta subclasse o método herdado calcularSalario (o
    //salário de um operário é equivalente ao salário de um empregado
    //usual acrescido da referida comissão). Escreva um programa de
    //teste adequado para esta classe.
public class Operario extends Trabalhador {
    private float valorProducao;
    private float valorComissao;

    public float getValorProducao(){
        return  valorProducao;
    }

    public void setValorProducao(float valorProducao){
        this.valorProducao = valorProducao;
    }

    public float getValorComissao(){
        return valorComissao;
    }

    public void setValorComissao(float valorComissao){
        this.valorComissao = valorComissao * valorProducao;
    }

    public Operario(String nome){
        super(nome);
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + valorComissao;
    }
}
