public abstract class Pessoa {
    private String cep;
    private String nome;

    public Pessoa (String cep, String nome){
        this.cep = cep;
        this.nome = nome;
    }

    public String getCep(){
        return cep;
    }

    public String getNome(){
        return nome;
    }

    public abstract void imprimirDescricao();
}