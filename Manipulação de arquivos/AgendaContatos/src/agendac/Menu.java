package agendac;

import java.util.Scanner;

public class Menu {
    private Agenda agenda;

    public Menu() {
        this.agenda = new Agenda();
    }
    public void exibir() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Digite a opção desejada");
            System.out.println("0 - SAIR | 1 - ADICIONAR CONTATO | 2 - LISTAR CONTATOS");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 0 -> {
                    System.out.println("A agenda foi fechada");
                    System.exit(0);
                }
                case 1 -> this.opcaoAdicionarContato();
                case 2 -> this.opcaoExibirContatos();
                default -> System.out.println("Opção inexistente!");
            }
        }

        System.out.println("Obrigada!");
        scanner.close();
    }

    private void opcaoAdicionarContato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();

        this.agenda.adicionarContato(new Contato(nome, telefone));
    }

    private void opcaoExibirContatos() {
        System.out.println("---- LISTA DE CONTATOS ----");
        this.agenda.exibirContatos();
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibir();
    }
}
