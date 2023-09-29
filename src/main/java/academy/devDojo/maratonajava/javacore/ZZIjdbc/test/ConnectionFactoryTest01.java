package academy.devDojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devDojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devDojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devDojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devDojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("vinicios junior").build();
        // ProducerService.save(producer);
        //ProducerService.delete(70);
        //ProducerService.update(producerToUpdate);
        //List<Producer> producers = ProducerService.findAll();
        //List<Producer> producers = ProducerService.findByName("Pa");
        //log.info("Producers found'{}'", producers);
        //ProducerService.showProducerMetaData();
        //  ProducerService.showDriverMetaData();
        // ProducerService.showTypeScrollWorking();
        //List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
        //  List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures    ");
        //log.info("Producers found'{}'", producers);

        // List<Producer> producers = ProducerService.findByNamePreparedStatement("Bo");
        //log.info("Producers found'{}'", producers);
        //  ProducerService.updatePreparedStatement(producerToUpdate);
       // List<Producer> producers = ProducerService.findByNameCallableStatement("NHK");
        //log.info("Producers found'{}'", producers);
    }

}
