package academy.devDojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class RuntimeExeptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException |ArithmeticException  e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException |ArithmeticException ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException ");
        }  catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException ");
        }

        try {
            talvezLanceExeption();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceExeption() throws SQLException, FileNotFoundException, IOException {

    }

}
