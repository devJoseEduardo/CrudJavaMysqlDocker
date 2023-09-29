package academy.devDojo.maratonajava.javacore.Oexception.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest02 {
    public static void main(String[] args) throws IOException {

        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {//como o throws IOException, quem que que esteja chamando esse criarNOvoAquivo é obrigado a tratar essa nova seção
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
