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

public class VendedorPrograma {
    public static void main(String[]args){
        Vendedor vendedor = new Vendedor("Luis");

        vendedor.setSalarioBase(2500F);
        vendedor.setImposto(0.3F);
        vendedor.setValorVendas(320F);
        vendedor.setComissao(0.2F);

        System.out.println("O salário é: " + vendedor.calcularSalario());
    }
}
