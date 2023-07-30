    //Considere, como subclasse da classe Pessoa, a classe Empregado.
    //Considere que cada instância da classe Empregado tem, para
    //além dos atributos que caracterizam a classe Pessoa, os atributos
    //codigoSetor (inteiro), salarioBase (vencimento base) e imposto
    //(porcentagem retida dos impostos). Implemente a classe
    //Empregado com métodos seletores e modificadores e um método
    //calcularSalario. Escreva um programa de teste adequado para a
    //classe Empregado.
public class Trabalhador extends Pessoa{
    private int codigoSetor;
    private float salarioBase;
    private float imposto;

    public int getCodigoSetor(){
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    public float getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
    }

    public float getImposto(){
        return imposto;
    }

    public void setImposto(float imposto){
        this.imposto = imposto;
    }

    public float calcularSalario(){
        return salarioBase - (salarioBase * imposto);
    }

    public Trabalhador(String nome){
        super(nome);
    }
}
