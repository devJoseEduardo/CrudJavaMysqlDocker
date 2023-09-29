package academy.devDojo.maratonajava.javacore.Oexception.exeption.dominio;

public class LoginInvalidoExeption extends Exception{
    public LoginInvalidoExeption() {
        super("Login inválido");
    }

    public LoginInvalidoExeption(String message) {
        super(message);
    }
}

