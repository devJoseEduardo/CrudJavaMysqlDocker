package academy.devDojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExeptionTest03 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo o aequivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando o recurso liberado pelo recurso SO");
        }
        return null;
    }
    private static void abreConexao2() {
        try {
            System.out.println("Abrindo o aequivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("fechando o recurso liberado pelo recurso SO");
        }

    }

}
