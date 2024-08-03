import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Carro> carros;

    public Cliente(String cep, String nome) {
        super(cep, nome);
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void visualizarCarros() {
        if (carros.isEmpty()) {
            System.out.println("O cliente não possui carros cadastrados.");
        } else {
            System.out.println("Carros do cliente " + getNome() + ":");
            for (Carro carro : carros) {
                System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Portas: " + carro.getportas());
            }
        }
    }

    @Override
    public void imprimirDescricao() {
        System.out.println("Cliente: " + getNome() + ", CEP: " + getCep());
        visualizarCarros();
    }
}