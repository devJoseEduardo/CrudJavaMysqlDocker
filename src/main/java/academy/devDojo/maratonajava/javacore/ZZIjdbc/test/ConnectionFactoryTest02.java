package academy.devDojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devDojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devDojo.maratonajava.javacore.ZZIjdbc.service.ProducerSecviceRowSet;
import academy.devDojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("Vinicios JUNIOR").build();
        ProducerSecviceRowSet.updateCachedRowSet(producerToUpdate);
        //log.info("---------------");
        //List<Producer> producers = ProducerSecviceRowSet.findByNameJdbcRowSet("");
        //log.info(producers);
    }

}

