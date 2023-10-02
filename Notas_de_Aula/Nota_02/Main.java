import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Produto p = new Produto();

        int rep;
        do {
            int x = sc.nextInt();

            System.out.println("Informe os dados a seguir para cadastrar um produto:");

            System.out.println("Digite o código do produto:");
            p.setCodigo(sc.nextInt());
            System.out.println("Digite o nome do produto:");
            p.setNome(sc2.nextLine());
            System.out.println("Digite a quantidade de produtos:");
            p.setQuantidade(sc.nextInt());

            System.out.println("Foram inseridos" + p.getQuantidade() + "produtos com sucesso!");
            System.out.println("Para realizar uma venda digite 1");
            System.out.println("Para encerrar o programa digite 0");
            switch (x) {
                case 0:
                    System.out.println("Encerrando o programa");
                case 1:
                    System.out.println("Digite a quantidade que desejar vender:");
                    int qtd_venda = sc.nextInt();
                    p.setQtd_venda(qtd_venda);
                    System.out.println("Foram vendidas " + p.getQtd_venda() + " unidades de " + p.getNome());
                    System.out.println("Quantidade final em estoque: " + p.getqtd_final());
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
            System.out.println("Digite 0 para repetir: ");
            rep = sc.nextInt();

        } while (rep == 0);
        System.out.println("Programa Encerrado");

    }
}

