public class Reserva {
    int id;
    String tipo;
    int Id_cliente;
    int Id_Veiculo;
    int km_inicio;
    int km_fim;
    String custos_adicionais;
    String observacoes;
    String local_Devolucao;
    String data_emprestado;
    int ValorBruto;

    public static void main(String[] args) {
        Veiculos veiculos = new Veiculos();

        System.out.println(veiculos.criarVeiculo());
    }
}
