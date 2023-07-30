public class ProgramaChefe {
    public static void main(String[]args){
        Chefe chefe = new Chefe("Julia", "Silva", 1500);

        System.out.println(chefe.getNome() + " " + chefe.getSobrenome() + ", " + chefe.getSalarioBase());
    }
}
