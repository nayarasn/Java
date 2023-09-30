public class Main {
    public static void main (String[] args) {
        Carro car = new Carro("Jeep", "Commander", 2023, 4);
        Moto mot = new Moto("Yamaha", "Mt-09", 2023, 847);

        car.imprimir_detalhes_carro();
        System.out.println();
        mot.imprimir_detalhes_moto();
    }
}