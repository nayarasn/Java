public class Gerente extends Funcionario{
    private String departamento;
    private double salarioFinal;

    public Gerente (String nome, double salario, String departamento, double salarioFinal) {
        super(nome, salario);
        this.departamento = departamento;
        this.salarioFinal = salarioFinal;
    }
    public void calcularBonus( ){
        double bonus = salario * 0.1;
        salarioFinal += bonus;

    }
    public void imprimirDetalhes(){
        System.out.println("O nome do Gerente é " + nome);
        System.out.println("Seu salário é de R$ " + salario);
        System.out.println("O departamento de " + departamento + ", onde o gerente trabalha " +
                "tem adicional de 10%, sendo assim seu salário total é de R$ " + salarioFinal);
    }

}
