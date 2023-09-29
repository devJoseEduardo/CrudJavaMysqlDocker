package academy.devDojo.maratonajava.javacore.Pwrappe.test;

public class WrapperTest01 {
    public static void main(String[] args) {


        byte byteP = 1;
        short aShortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'j';
        boolean booleanP = false;

        byte byteW = 1;
        short aShortW = 1;
        int intW = 1;
        long longW = 10L;
        float floatW = 10F;
        double doubleW = 10D;
        char charW = 'j';
        boolean booleanW = false;

        int i = intW ;//umboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean(null);
        System.out.println("Verdadeiro");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(9));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}

