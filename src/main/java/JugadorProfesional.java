import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue("Profesional")
public class JugadorProfesional extends Jugador{
    private int cantidadVictoriasEnTorneos;
    private double peso;
    private double altura;

    public JugadorProfesional (Paleta paleta, String nombre, String apellido, Date fechaNacimiento, String domicilio, String telefono, int cantidadVictoriasEnTorneos,double peso, double altura) {
        super(paleta, nombre, apellido, fechaNacimiento, domicilio, telefono);
        this.cantidadVictoriasEnTorneos = cantidadVictoriasEnTorneos;
        this.peso = peso;
        this.altura = altura;
    }
}
