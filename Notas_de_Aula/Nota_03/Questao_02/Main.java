public class Main {
    public static void main (String[] args) {
        Gerente ger = new Gerente("Edilson", 5000, "engenharia",5000);
        Diretor dir = new Diretor("Nayara", 20000, 500);

        ger.calcularBonus();
        ger.imprimirDetalhes();
        System.out.println();
        dir.imprimirDetalhes();

    }
}