package agendac;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private File arquivoBancoDeDados;
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
        this.arquivoBancoDeDados = new File("D:\\agenda.txt");

    }

    public void adicionarContato(Contato contato) {
        try {
            FileWriter escritorArquivo = null;
            BufferedWriter bufferedEscritor = null;

            if (!this.arquivoBancoDeDados.exists()) {
                arquivoBancoDeDados.createNewFile();
            }

            escritorArquivo = new FileWriter(arquivoBancoDeDados, true);
            bufferedEscritor = new BufferedWriter(escritorArquivo);

            bufferedEscritor.write(contato.toString());
            bufferedEscritor.newLine();
            bufferedEscritor.flush();

            escritorArquivo.close();
            bufferedEscritor.close();

            this.contatos.add(contato);
            System.out.println("Contato adicionado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exibirContatos() {
        try {
            FileReader leitor = null;
            BufferedReader bufferedLeitor = null;

            if (arquivoBancoDeDados.exists()) {
                leitor = new FileReader(arquivoBancoDeDados);
                bufferedLeitor = new BufferedReader(leitor);

                String linha = bufferedLeitor.readLine();

                while (linha != null) {
                    System.out.println(linha);
                    linha = bufferedLeitor.readLine();
                }

                leitor.close();
                bufferedLeitor.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
