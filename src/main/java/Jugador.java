
import javax.persistence.*;
import java.util.Date;
@Entity
@DiscriminatorColumn(name = "discriminador")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Jugador {
    @Id
    private long id;
    @OneToOne
    private Paleta paleta;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String domicilio;
    private String telefono;

    public Jugador (Paleta paleta,String nombre,String apellido, Date fechaNacimiento,String domicilio,String telefono) {
        this.paleta = paleta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
}
