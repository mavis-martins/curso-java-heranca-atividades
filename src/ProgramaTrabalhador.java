    //Considere, como subclasse da classe Pessoa, a classe Empregado.
    //    //Considere que cada instância da classe Empregado tem, para
    //    //além dos atributos que caracterizam a classe Pessoa, os atributos
    //    //codigoSetor (inteiro), salarioBase (vencimento base) e imposto
    //    //(porcentagem retida dos impostos). Implemente a classe
    //    //Empregado com métodos seletores e modificadores e um método
    //    //calcularSalario. Escreva um programa de teste adequado para a
    //    //classe Empregado.


public class ProgramaTrabalhador {
    public static void main(String[]args){
        Trabalhador trabalhador = new Trabalhador("Mavis");

        trabalhador.setSalarioBase(1200);
        trabalhador.setImposto(0.05F);

        System.out.println("Salário: " + trabalhador.calcularSalario());
    }
}
