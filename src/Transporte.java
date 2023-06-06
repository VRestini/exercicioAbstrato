public class Transporte extends Despesa{
    private double kmPercorrida;
    private double valorPedagios;

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagios() {
        return valorPedagios;
    }

    public void setValorPedagios(double valorPedagios) {
        this.valorPedagios = valorPedagios;
    }

    @Override
    public void calcularDespesa(double kmSc, double pedSc, double diaria) {
        kmPercorrida = kmSc;
        valorPedagios = pedSc;
        valorTotal = (kmPercorrida * 3) + valorPedagios;
    }

    @Override
    public void listarDespesa() {
        System.out.println(kmPercorrida + valorPedagios + valorTotal);
    }
}
