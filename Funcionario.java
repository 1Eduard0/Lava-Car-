public class Funcionario extends Pessoa {
    private String salario;

    public Funcionario(String cep, String nome, String salario) {
        super(cep, nome);
        this.salario = salario;
    }

    public String getSalario(){
        return salario;
    }

    @Override
    public void imprimirDescricao() {
        System.out.println("Funcionário: " + getNome() + ", CEP: " + getCep() + ", Salário: " + salario);
    }
}