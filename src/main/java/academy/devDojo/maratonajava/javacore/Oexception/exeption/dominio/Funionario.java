package academy.devDojo.maratonajava.javacore.Oexception.exeption.dominio;

import java.io.FileNotFoundException;

public class Funionario extends Pessoa{
    public void salvar()throws LoginInvalidoExeption, ArithmeticException {
        System.out.println("Salvando Funcionáro");
    }

}
