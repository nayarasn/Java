public class Produto {
    private int codigo;
    private String  nome;
    private int quantidade;
    private int qtd_venda;
    private int qtd_final;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQtd_venda() {
        return qtd_venda;
    }

    public void setQtd_venda(int qtd_venda) {
        this.qtd_venda = qtd_venda;
    }

    public int getQtd_final() {
        return qtd_final;
    }

    public void setQtd_final(int qtd_final) {
        this.qtd_final = qtd_final;
    }

    public  int getqtd_final() { qtd_final =  quantidade - qtd_venda;
        return qtd_final;}

}