public class Itens extends Conteudo {

    private int quantidade;

    public Itens(String descricao, int quantidade) {
        super(descricao);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getConteudo() {
        return "Itens: " + this.getDescricao() + " - quantidade: " + this.quantidade + "\n";
    }
}
