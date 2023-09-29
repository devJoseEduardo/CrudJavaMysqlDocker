package academy.devDojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("DIGITE SEU NOME ABAIXO");
        String nome = entrada.nextLine();
    System.out.println("DIGITE SUA IDADE");
        int idade = entrada.nextInt();
        System.out.println("DIGITE M OU F PARA SEU SEXO");
        char sexo = entrada.next().charAt(0);
        System.out.println("Nome: "+nome);
        System.out.println("Idade: : "+idade);
        System.out.println("Sexo: "+sexo);


    }
        }
