import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcDespesa = -1;
            int opcPrincipal = -1;
            Alimentacao alimentacao = new Alimentacao();
            Transporte transporte = new Transporte();
            Diaria diaria = new Diaria();
            GerenciadorDespesas gerenciador = new GerenciadorDespesas();

            while (true) {
                System.out.println(
                        "\n    MENU    \n\n1 - Alimentação \n2 - Trasporte \n3 - Diaria \n4 - Exibir dispesa \n0 - Sair / encerrar programa");
                System.out.println("\nDigite a sua opção: ");
                opcPrincipal = sc.nextInt();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                switch (opcPrincipal) {
                    case 1:
                        while (opcDespesa != 0) {
                            System.out.println(
                                    "\n    ALIMENTAÇÃO    \n\n1 - Cadastrar despesa \n2 - Calcular despesa \n3 - Exibir despesa \n4 - Adicionar despesa \n0 - Sair ");
                            System.out.println("\nDigite uma opção: ");
                            opcDespesa = sc.nextInt();
                            switch (opcDespesa) {
                                case 1:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    alimentacao.cadastrarDespesa();
                                    System.out.println("Cadastro realizado");
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    alimentacao.calcularDespesa();
                                    System.out.println("Calculo realizado");
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    alimentacao.listarDespesa();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    gerenciador.analisarDespesas(alimentacao);
                                    System.out.println("Dados incrementados");
                                    break;
                                case 0:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    break;

                            }
                        }
                        opcDespesa = -1;
                        break;
                    case 2:
                        while (opcDespesa != 0) {
                            System.out.println(
                                    "\n    TRANSPORTE    \n\n1 - Cadastrar despesa \n2 - Calcular despesa \n3 - Exibir despesa \n4 - Adicionar despesa  \n0 - Sair ");
                            System.out.println("\nDigite uma opção: ");
                            opcDespesa = sc.nextInt();
                            switch (opcDespesa) {
                                case 1:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    transporte.cadastrarDespesa();
                                    System.out.println("Cadastro realizado");
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    transporte.calcularDespesa();
                                    System.out.println("Calculo realizado");
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    transporte.listarDespesa();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    gerenciador.analisarDespesas(transporte);
                                    System.out.println("Dados incrementados");
                                    break;
                                case 0:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    break;

                            }
                        }
                        opcDespesa = -1;
                        break;
                    case 3:
                        while (opcDespesa != 0) {
                            System.out.println(
                                    "\n    DIARIA    \n\n1 - Cadastrar despesa \n2 - Calcular despesa \n3 - Exibir despesa \n4 - Adicionar despesa \n0 - Sair ");
                            System.out.println("\nDigite uma opção: ");
                            opcDespesa = sc.nextInt();
                            switch (opcDespesa) {
                                case 1:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    diaria.cadastrarDespesa();
                                    System.out.println("Cadastro realizado");
                                    break;
                                case 2:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    diaria.calcularDespesa();
                                    System.out.println("Calculo realizado");
                                    break;
                                case 3:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    diaria.listarDespesa();
                                    break;
                                case 4:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    gerenciador.analisarDespesas(diaria);
                                    System.out.println("Dados incrementados");
                                    break;
                                case 0:
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
                                    break;

                            }
                        }
                        opcDespesa = -1;
                        break;
                    case 4:
                        gerenciador.listarDespesas();
                        break;
                    case 0:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\nPrograma finalizado.\n");
                        return;

                }
            }
        }
    }
}
