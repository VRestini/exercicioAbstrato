import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a descrição da despesa: ");
        descricao = sc.nextLine();
        valorTotal = 0;
        System.out.print("Digite o nome do restaurante: ");
        nomeRestaurante = sc.nextLine();
    }


    @Override
    public void calcularDespesa(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de refeições: ");
        int quantidadeRefeicoes = scanner.nextInt();

        valorTotal = quantidadeRefeicoes * 18;
    }

    @Override
    public void listarDespesa() {

        System.out.println("A descrição é: " + descricao + "\n O valor total é:" + valorTotal + "\nO nome do restaurante é:" + nomeRestaurante);

    }
}
