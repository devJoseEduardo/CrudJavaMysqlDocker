/* academy.devDojo.maratonajava.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder

public final class Producer {
     private final Integer id;
     private final String name;
}

 */
package academy.devDojo.maratonajava.javacore.ZZJcrud.domino;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer id;
    String name;

}