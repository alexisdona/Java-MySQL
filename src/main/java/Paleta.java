import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Paleta {
    @Id
    private long id;
    @ManyToOne
    private Color color;
    private String nombre;
    @ManyToOne
    private Fabricante fabricante;

    public Paleta(String nombre,Color color, Fabricante fabricante) {
        this.nombre = nombre;
        this.color = color;
        this.fabricante = fabricante;
    }

}
