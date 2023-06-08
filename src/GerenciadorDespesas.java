public class GerenciadorDespesas {
    private int qtdeAlimentacao;
    private int qtdeTransporte;
    private int qtdeDiaria;
    private double totalAlimentacao;
    private double totalTransporte;
    private double totalDiaria;
    private double totalDespesas;

    public void analisarDespesa(Despesa despesa){
        if (despesa instanceof Alimentacao){
            Alimentacao alimentacao = (Alimentacao) despesa;
            totalAlimentacao += alimentacao.getValorTotal();
            qtdeAlimentacao = qtdeAlimentacao + 1;
        }
        else if(despesa instanceof Transporte) {
            Transporte transporte = (Transporte) despesa;
            totalTransporte += transporte.getValorTotal();
            qtdeTransporte = qtdeTransporte + 1;
        }
        else if (despesa instanceof Diaria){
            Diaria diaria = (Diaria) despesa;
            totalDiaria += diaria.getValorTotal();
            qtdeDiaria++;
        }
        totalDespesas += despesa.getValorTotal();

    }

    public int getQtdeAlimentacao() {
        return qtdeAlimentacao;
    }

    public void setQtdeAlimentacao(int qtdeAlimentacao) {
        this.qtdeAlimentacao = qtdeAlimentacao;
    }

    public int getQtdeTransporte() {
        return qtdeTransporte;
    }

    public void setQtdeTransporte(int qtdeTransporte) {
        this.qtdeTransporte = qtdeTransporte;
    }

    public int getQtdeDiaria() {
        return qtdeDiaria;
    }

    public void setQtdeDiaria(int qtdeDiaria) {
        this.qtdeDiaria = qtdeDiaria;
    }

    public double getTotalAlimentacao() {
        return totalAlimentacao;
    }

    public void setTotalAlimentacao(double totalAlimentacao) {
        this.totalAlimentacao = totalAlimentacao;
    }

    public double getTotalTransporte() {
        return totalTransporte;
    }

    public void setTotalTransporte(double totalTransporte) {
        this.totalTransporte = totalTransporte;
    }

    public double getTotalDiaria() {
        return totalDiaria;
    }

    public void setTotalDiaria(double totalDiaria) {
        this.totalDiaria = totalDiaria;
    }

    public double getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    public void analisarDespesas(Despesa despesa ){

    }
    
    public void listarDespesas() {
            System.out.println("Quantidade de despesas de Alimentação:" + qtdeAlimentacao);
            System.out.println("Total Alimentação: " + totalAlimentacao);
            System.out.println("Quantidade despesas de Transporte: " + qtdeTransporte);
            System.out.println("Total Transporte: " + totalTransporte);
            System.out.println("Quantidade de despesas Diária: " + qtdeDiaria);
            System.out.println("Total Diária: " + totalDiaria);
            System.out.println("Total geral de despesas: " + totalDespesas);
    }
    // Scanner leitorTexto = new Scanner
    //String nome = leitorTexto.next(); our nextLine(); our nextInt our nextString();
    // Scanner leitor numero = new scanner(System.in);
    // leitorTexto.close();

}
