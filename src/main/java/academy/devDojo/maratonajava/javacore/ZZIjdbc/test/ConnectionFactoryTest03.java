package academy.devDojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devDojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devDojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Felipe Neto").build();
        Producer producer2 = Producer.builder().name("Wesley Alemão").build();
        Producer producer3 = Producer.builder().name("João do Grau").build();
        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
