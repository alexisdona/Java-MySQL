import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Color {
    @Id
    private long id;
    private String nombre;

    public Color(String nombre) {
      this.nombre = nombre;
    }

}
