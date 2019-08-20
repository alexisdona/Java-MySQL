import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fabricante {
    @Id
    private long id;
    private String nombre;
}
