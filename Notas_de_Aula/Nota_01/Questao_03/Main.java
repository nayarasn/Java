import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora cal = new Calculadora();

        int rep;
        do {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println(" 3 - Multiplicação");
            System.out.println(" 4 - Divisão");
            System.out.println("5 - Sair ");

            int x = sc.nextInt();

            if (x == 5) {
                System.out.println("Programa Encerrado!");
                return;
            } else if (x>5) {
                System.out.println("Inválido");
                break;
            }
            else {

                System.out.print("Digite o primeiro número: ");
                double numero1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double numero2 = sc.nextDouble();

                double resultado = 0.0;
                switch (x) {

                    case 1:
                        resultado = cal.somar(numero1, numero2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = cal.subtrair(numero1, numero2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = cal.multiplicar(numero1, numero2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        resultado = cal.dividir(numero1, numero2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");

                }
                System.out.println("Para ver novamente, digite 0");
                rep = sc.nextInt();
            }
        } while (rep == 0) ;

    }

}
