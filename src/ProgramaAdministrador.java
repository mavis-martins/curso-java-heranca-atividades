    //Implemente a classe Administrador como subclasse da classe
    //Empregado. Um determinado administrador tem como atributos,
    //para além dos atributos da classe Pessoa e da classe Empregado,
    //o atributo ajudaDeCusto (ajudas referentes a viagens, estadias,
    //...). Note que deverá redefinir na classe Administrador o método
    //herdado calcularSalario (o salário de um administrador é
    //equivalente ao salário de um empregado usual acrescido das
    //ajuda de custo). Escreva um programa de teste adequado para
    //esta classe.

public class ProgramaAdministrador {
    public static void main(String[]args){
        Administrador administrador = new Administrador("João");

        administrador.setSalarioBase(1200F);
        administrador.setAjudaCusto(60F);
        administrador.setImposto(0.05F);

        System.out.println("O salário é: " + administrador.calcularSalario());
    }
}
