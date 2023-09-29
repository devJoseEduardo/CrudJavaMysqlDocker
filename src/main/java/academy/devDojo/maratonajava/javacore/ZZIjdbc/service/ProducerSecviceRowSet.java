package academy.devDojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devDojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devDojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devDojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerSecviceRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {

        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }
    public static void updateCachedRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}
