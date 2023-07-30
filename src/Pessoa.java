    //Cria uma Classe Pessoa, contendo os atributos
    //encapsulados, com seus respectivos seletores (getters) e
    //modificadores (setters), e ainda o construtor padrão e pelo
    //menos mais duas opções de construtores conforme sua
    //percepção. Atributos: String nome; String endereço;
    //String telefone;
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String endereco;
    private  String telefone;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public  String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }


    public Pessoa(String nome){

        this.nome = nome;
    }

    public  Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}