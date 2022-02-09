
import java.util.*;

public class Main {

    public static void main(String[] args) {

        SortedSet<String> totalAlunos = new TreeSet<String>();

        SortedSet<String> alunosJava = new TreeSet<String>();

        SortedSet<String> alunosBancoDeDados = new TreeSet<String>();

        alunosJava.add("Alexandre Martins");
        alunosJava.add("Vitor Hugo Lima");
        alunosJava.add("Esther Rodrigues");
        alunosJava.add("Lavínia Cunha");
        alunosJava.add("Natália Gomes");
        alunosJava.add("Yago Ramos");
        alunosJava.add("Letícia Cunha");
        alunosJava.add("Srta. Ana Júlia Ramos");
        alunosJava.add("Pietra Martins");
        alunosJava.add("Thomas Peixoto");
        alunosJava.add("Thales Farias");

        System.out.println("Turma de Java: " + alunosJava);

        alunosBancoDeDados.add("Vitor Hugo Lima");
        alunosBancoDeDados.add("Esther Rodrigues");
        alunosBancoDeDados.add("Nathan Nascimento");
        alunosBancoDeDados.add("Lavínia Cunha");
        alunosBancoDeDados.add("Natália Gomes");
        alunosBancoDeDados.add("Dra. Lavínia Lopes");
        alunosBancoDeDados.add("Yago Ramos");
        alunosBancoDeDados.add("Letícia Cunha");
        alunosBancoDeDados.add("Luiz Miguel Azevedo");
        alunosBancoDeDados.add("Srta. Ana Júlia Ramos");
        alunosBancoDeDados.add("Thales Farias");
        alunosBancoDeDados.add("Dra. Alana Porto");

        System.out.println("Turma de Banco de Dados: " + alunosBancoDeDados);

        totalAlunos.addAll(alunosJava);
        totalAlunos.addAll(alunosBancoDeDados);


        Integer quantTotalAlunos = totalAlunos.size();
        String quantidadeAlunos = quantTotalAlunos.toString();

        System.out.println("Todos os alunos: " + totalAlunos);
        System.out.println("O total de alunos é: " + quantTotalAlunos);

        CriadorArquivo.criacaoArquivo(
                "C:\\Lucas Docs\\Lets Code\\Projeto\\IdeaProjects\\ProjetoTurma\\docs\\arquivo.txt",
                totalAlunos,
                alunosJava,
                alunosBancoDeDados,
                quantidadeAlunos
        );
    }
}
