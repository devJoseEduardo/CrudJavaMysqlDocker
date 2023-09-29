package academy.devDojo.maratonajava.javacore.Oexception.exeption.test;

import academy.devDojo.maratonajava.javacore.Oexception.exeption.dominio.LoginInvalidoExeption;

import java.util.Scanner;

public class LoginInvelidoExeptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoExeption e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoExeption {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Junior";
        String senhaDB = "007";
        System.out.println("Usuário");
        String urernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(urernameDigitado) || !senhaDigitada.equals(senhaDB)) {
            throw new LoginInvalidoExeption("Usuário ou senha invàlidos");

        }
        System.out.println("Usuário logado com sucesso");
    }
}
