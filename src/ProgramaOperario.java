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

public class ProgramaOperario {
    public static void main (String[]args){
        Operario operario = new Operario("Clara");

        operario.setSalarioBase(1200F);
        operario.setImposto(0.1F);
        operario.setValorProducao(400F);
        operario.setValorComissao(0.3F);

        System.out.println("O salário é: " + operario.calcularSalario());
    }
}
