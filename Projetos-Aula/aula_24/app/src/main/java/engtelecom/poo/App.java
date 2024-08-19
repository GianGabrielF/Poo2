/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        Path dir = Path.of(currentDir);

        Scanner keyBoard = new Scanner(System.in);
        String op = keyBoard.nextLine();
        String[] arquivos = op.split(" ");
        while (!arquivos[0].equals("exit")){
            switch(op){

                case "ls" -> {
                        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                        for (Path path : stream) {
                            System.out.println(path.getFileName());
                        } 

                    } catch (IOException e) {
                        System.err.println("Erro " + e);
                    }
                }

                case "stat" -> {

                    Path path = Path.of(currentDir + "/" + arquivos[1]);
                    if (Files.exists(path)) {
                        System.out.println(String.format("Arquivo: %s", path.toAbsolutePath()));
                        System.out.println(String.format("Regular: %s", Files.isRegularFile(path)));
                        System.out.println(String.format("Diretório: %s", Files.isDirectory(path)));
                        System.out.println(String.format("Permissão de leitura: %s", Files.isReadable(
                        path)));
                        System.out.println(String.format("Permissão de escrita: %s", Files.isWritable(
                        path)));
                    } else {
                        System.out.println("Arquivo não encontrado");
                    }
                }

                case "touch" -> {
                    try {
                        // Criando diretório
                        Path cria = Path.of(currentDir+"/" + arquivos[1]);
                        Files.createDirectories(cria);
                        // Retorna o caminho do arquivo 'arquivo.txt' dentro do diretório 'aula−dir'
                        Path arq = cria.resolve(arquivos[1]);
                        Files.createFile(arq);
                        } catch (Exception e) {
                        System.err.println("Erro: " + e);
                        }
                }

                case "rm" -> {
                    Path remove = Path.of(currentDir + "/" + arquivos[1]);
                    try {
                            Files.deleteIfExists(remove);
                            System.out.println("Arquivo excluído");
                    } catch (Exception e) {
                            System.err.println("Erro: " + e);
                    }
                }

                case "mv" -> {
                    Path localOld = Path.of(currentDir + "/" + arquivos[1]);

                    try{
                    Path localNew = Path.of(currentDir + "/" + arquivos[2]);

                    Files.move(localOld,localNew);
                    System.out.println("Arquivo movido");
                    } catch (Exception e) {
                        System.err.println("Erro " + e);
                    
                    }


                }

                default -> { 
                    System.out.println("comando desconhecido");

                }
            }
            op = keyBoard.nextLine();
            arquivos = op.split(" ");

        }
    }

}

