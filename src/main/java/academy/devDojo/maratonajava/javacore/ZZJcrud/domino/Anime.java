package academy.devDojo.maratonajava.javacore.ZZJcrud.domino;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Anime {
    Integer id ;
    String name;
    int episodes;
    Producer producer;
}
