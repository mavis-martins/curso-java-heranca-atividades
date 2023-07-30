    //Implemente a classe Vendedor como subclasse da classe
    //Empregado. Um determinado vendedor tem como atributos, para
    //além dos atributos da classe Pessoa e da classe Empregado, o
    //atributo valorVendas (correspondente ao valor monetário dos
    //artigos vendidos) e o atributo comissao (porcentagem do
    //valorVendas que será adicionado ao vencimento base do
    //Vendedor). Note que deverá redefinir nesta subclasse o método
    //herdado calcularSalario (o salário de um vendedor é equivalente
    //ao salário de um empregado usual acrescido da referida
    //comissão). Escreva um programa de teste adequado para esta
    //classe.
public class Vendedor extends Trabalhador{
    private float valorVendas;
    private float comissao;

    public float getValorVendas(){
        return valorVendas;
    }

    public void setValorVendas(float valorVendas){
        this.valorVendas = valorVendas;
    }

    public  float getComissao(){
        return comissao;
    }

    public void setComissao(float comissao){
        this.comissao = valorVendas * comissao;
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + comissao;
    }

    public Vendedor(String nome){
        super(nome);
    }
}
