import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SortedSet;

public class CriadorArquivo {

    public static void criacaoArquivo (String outputPath,
                                       SortedSet<String> totalAlunos,
                                       SortedSet<String> alunosJava,
                                       SortedSet<String> alunosBancoDeDados,
                                       String quantidadeAlunos) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            writer.append("Todos os alunos: \n");
            totalAlunos.forEach(alunos -> {
                try {
                    writer.append(alunos + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.append("\n" + "Turma Java: " + "\n");
            alunosJava.forEach(alunosjava -> {
                try{
                    writer.append(alunosjava + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.append("\n" + "Turma Banco de Dados: " + "\n");
            alunosBancoDeDados.forEach(alunosbanco -> {
                try{
                    writer.append(alunosbanco + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.append("\n" + "Total de Alunos: " + "\n");
            writer.append(quantidadeAlunos);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
