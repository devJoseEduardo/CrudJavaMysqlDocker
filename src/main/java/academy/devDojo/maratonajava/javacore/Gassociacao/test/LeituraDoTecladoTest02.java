package academy.devDojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de preevisão do futuro");
        System.out.println("Deiche sua pergunta e eu responderei sim ou não  ");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0)==' '){
            System.out.println("SIM");
        }else {
            System.out.println("NÃo");
        }
    }
}
