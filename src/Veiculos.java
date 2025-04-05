import java.util.ArrayList;

public class Veiculos{
    int id;
    float preco;
    String placa;
    String modelo;
    String cor;
    String marca;
    String chassi;
    String tipo;
    boolean disponivel;

    public static ArrayList<String> criarVeiculo(){
        ArrayList<String> ListaVeiculos = new ArrayList<>();
        Veiculos veiculos = new Veiculos();
        veiculos.id = 0;
        veiculos.marca = "Ford";
        veiculos.modelo = "Foda";
        veiculos.cor = "Vermelho";
        veiculos.disponivel = true;

        ListaVeiculos.add(String.valueOf(veiculos.id));
        ListaVeiculos.add(veiculos.marca);
        ListaVeiculos.add(veiculos.modelo);
        return ListaVeiculos;
    }
}