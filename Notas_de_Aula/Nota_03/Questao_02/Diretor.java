public class Diretor extends Funcionario{
    private int acoes;
    public Diretor (String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }

    public void imprimirDetalhes(){
        System.out.println("O nome da Diretora é " + nome);
        System.out.println("Seu salário é de R$ " + salario);
        System.out.println("E tem " + acoes + " ações nessa empresa");
    }
}