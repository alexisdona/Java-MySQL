import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue("Amateur")
public class JugadorAmateur extends Jugador {
    public JugadorAmateur(Paleta paleta, String nombre, String apellido, Date fechaNacimiento, String domicilio, String telefono) {
        super(paleta, nombre, apellido, fechaNacimiento, domicilio, telefono);
    }
}