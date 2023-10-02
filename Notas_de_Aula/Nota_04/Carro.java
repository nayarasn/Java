public class Carro {
    protected String marca;
    protected String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarDetalhes(){
        System.out.println("O carro é da marca " + marca + " e do modelo " + modelo);
    }
}
