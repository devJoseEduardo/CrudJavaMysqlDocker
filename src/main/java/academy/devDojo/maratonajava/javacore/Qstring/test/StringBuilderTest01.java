
package academy.devDojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "José Edurardo";
        nome.concat("Oliveira");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("José Eduardo");
        sb.append("Oliveira").append("Empreendedor");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
