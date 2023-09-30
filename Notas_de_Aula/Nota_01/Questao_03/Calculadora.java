class Calculadora {
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public  double multiplicar(double a, double b) {
        return a * b;
    }

    public  double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero.");
            return 0.0; // Retorna 0.0 em caso de divisão por zero
        }
        return a / b;
    }
}