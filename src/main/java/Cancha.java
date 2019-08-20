import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Cancha {
    @Id
    private long id;
    private boolean tieneIluminacion;
    @ManyToOne
    private Color color;
    private String nombre;
    @OneToMany
    private List<Reserva> reservas;

    public Cancha(boolean tieneIluminacion, Color color, String nombre) {
        this.tieneIluminacion = tieneIluminacion;
        this.color = color;
        this.nombre = nombre;
    }


}
