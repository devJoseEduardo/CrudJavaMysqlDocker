package academy.devDojo.maratonajava.javacore.Qstring.test;

public class Stringtest01 {
    public static void main(String[] args) {
        String nome = "José Eduarod";//String constant pool  piscina constante de Strigs
        String nome2 = "José Eduardo";
        nome = nome.concat(" Oliveira");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nnome3 = new String("José Eduardo");
        System.out.println(nome2 == nnome3);

    }
}
