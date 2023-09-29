package academy.devDojo.maratonajava.javacore.Oexception.exeption.test;

import academy.devDojo.maratonajava.javacore.Oexception.exeption.dominio.Funionario;
import academy.devDojo.maratonajava.javacore.Oexception.exeption.dominio.LoginInvalidoExeption;
import academy.devDojo.maratonajava.javacore.Oexception.exeption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobreescritaComExeption01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funionario funionario = new Funionario();
        try {
            funionario.salvar();
        } catch (LoginInvalidoExeption e) {
            e.printStackTrace();
        }
    }
}
