package academy.devDojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {//Como o metodo datalouder é um metodo abtrato, vc é obrigado a prover a implementação daquelee metodo.

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");

    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
    public static void retrieveMAX_DATA_SIZE() {
        System.out.println("Dentro do retrieveMAX_DATA_SIZE na classe Databaseloader ");
    }


}
