package academy.devDojo.maratonajava.javacore.Oexception.exeption.test;

import academy.devDojo.maratonajava.javacore.Oexception.exeption.dominio.Leitor1;
import academy.devDojo.maratonajava.javacore.Oexception.exeption.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerAquivo();
    }
    public static void lerAquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2();){

        }catch (IOException e){

        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exeption) {
                exeption.printStackTrace();
            }
        }
    }
}
