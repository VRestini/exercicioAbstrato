import java.util.Scanner;
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
    public void calcularDespesa() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a descrição da despesa: ");
        descricao = sc.nextLine();

        System.out.print("Digite a quilometragem percorrida: ");
        kmPercorrida = sc.nextDouble();

        System.out.print("Digite o valor gasto com pedágios: ");
        valorPedagios = sc.nextDouble();

        valorTotal = (kmPercorrida * 3) + valorPedagios;
    }

    @Override
    public void listarDespesa() {

        System.out.println("A descrição é: " + descricao + "\n O valor total é:" + valorTotal + "\nA quantidade de quilometros percorrida foi:" + kmPercorrida + "\n O valor total gasto com pedágios foi:" + valorPedagios);

    }
}

