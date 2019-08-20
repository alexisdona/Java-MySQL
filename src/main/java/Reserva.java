import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;
@Entity
public class Reserva {
    @Id
    private long id;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    @ManyToMany
    private List<Jugador> jugadores;
}
