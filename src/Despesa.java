public abstract class Despesa {
    private String descricao;
    protected double valorTotal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void cadastrarDespesa(){
        setDescricao(descricao);
        valorTotal = 0;
    }
    protected abstract void calcularDespesa(double qtdRefeicoes, double pedSc, double diarias);

    public abstract void listarDespesa();


}
