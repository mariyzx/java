package agendac;

import java.util.ArrayList;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.conttos = new ArrayList<Contato>();
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
        System.out.println("Contato adicionado com sucesso");
    }

    public void exibirContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
        }
    }
}
