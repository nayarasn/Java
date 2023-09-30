public class Funcionario {
    int Matricula;
    String Nome;
    double Salario_bruto, Desconto_INSS, Salario_liquido;
    public double calc_inss(){
        return Desconto_INSS = Salario_bruto * 0.15;
    }
    public double calc_liquido() {
        return Salario_liquido = Salario_bruto - Desconto_INSS;
    }


}
