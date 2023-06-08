import java.util.Scanner;
public class Diaria extends Despesa{
    private double qtdeDiaria;

    public double getQtdeDiaria() {
        return qtdeDiaria;
    }

    public void setQtdeDiaria(double qtdeDiaria) {
        this.qtdeDiaria = qtdeDiaria;
    }

    @Override
    public void calcularDespesa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantas dias você se hospedou em algum lugar: ");
        qtdeDiaria = sc.nextDouble();
        valorTotal = qtdeDiaria * 50;
    }


    @Override
    public void listarDespesa() {
        System.out.println("A descrição é: " + descricao + "\n O valor total é:" + valorTotal + "\nA quantidade de dias que você se hospedou é:" + qtdeDiaria);
    }
}
