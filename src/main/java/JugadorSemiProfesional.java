import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue("SemiProfesional")
public class JugadorSemiProfesional extends Jugador{
    private int partidosGanados;
    public JugadorSemiProfesional (Paleta paleta, String nombre, String apellido, Date fechaNacimiento, String domicilio, String telefono,int partidosGanados){
        super(paleta, nombre, apellido,  fechaNacimiento, domicilio, telefono);
        this.partidosGanados = partidosGanados;
    }
}
