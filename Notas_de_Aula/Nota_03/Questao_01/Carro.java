public class Carro extends Veiculo{
    private int numPortas;

    public Carro (String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
        this.numPortas = numPortas;
    }

    public void imprimir_detalhes_carro(){
        System.out.println("A marca do veículo é " + marca);
        System.out.println("Seu modelo é " + modelo);
        System.out.println("O ano de fabricação é " + anoFabricacao);
        System.out.println("O número de portas é " + numPortas);
    }
}
