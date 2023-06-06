public class Alimentacao extends Despesa {
    private String nomeRestaurante;



    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    @Override
    public void cadastrarDespesa() {
        valorTotal = 0;
    }


    @Override
    public void calcularDespesa(double qtdRefeicoes, double pedSc, double diaria ){
        valorTotal = qtdRefeicoes * 18;
    }

    @Override
    public void listarDespesa() {
        System.out.println(nomeRestaurante + valorTotal);
    }
}
