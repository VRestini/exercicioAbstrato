import java.util.Scanner;

public abstract class Despesa {
    protected String descricao;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a descrição da despesa: ");
        descricao = sc.nextLine();
        valorTotal = 0;
    }
    public abstract void calcularDespesa();

    public abstract void listarDespesa();


}
