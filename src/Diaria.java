public class Diaria extends Despesa{
    private double qtdeDiaria;

    public double getQtdeDiaria() {
        return qtdeDiaria;
    }

    public void setQtdeDiaria(double qtdeDiaria) {
        this.qtdeDiaria = qtdeDiaria;
    }

    @Override
    public void calcularDespesa(double qtdeDiaria, double pedSc, double diarias) {
        qtdeDiaria = diarias;
        valorTotal = qtdeDiaria * 50;
    }


    @Override
    public void listarDespesa() {
        System.out.println(valorTotal + qtdeDiaria);
    }
}
