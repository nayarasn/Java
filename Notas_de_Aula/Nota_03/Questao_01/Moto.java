public class Moto extends Veiculo{
    private int cilindrada;

    public Moto (String marca, String modelo, int anoFabricacao, int cilindrada) {
        super(marca, modelo, anoFabricacao);
        this.cilindrada = cilindrada;
    }

    public void imprimir_detalhes_moto(){
        System.out.println("A marca da moto é " + marca);
        System.out.println("Seu modelo é " + modelo);
        System.out.println("O ano de fabricação é " + anoFabricacao);
        System.out.println("A cilindrada é " + cilindrada);
    }

}