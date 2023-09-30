import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a 1º nota: ");
        double nota1 = sc1.nextDouble();
        System.out.println("Digite a 2º nota: ");
        double nota2 = sc1.nextDouble();

        a.nome = nome;
        a.nota1 = nota1;
        a.nota2 = nota2;

        a.calc_media();

        System.out.println("\nMedia do aluno " + a.media);

        if (a.media >= 7) {
            System.out.println(a.nome + " está aprovado!");
        } else if (a.media < 4) {
            System.out.println(a.nome + " está reprovado!");
        } else {
            System.out.println(a.nome + " está na final!");
        }

        sc.close();
        sc1.close();
    }

}