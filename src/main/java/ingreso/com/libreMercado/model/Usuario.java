package ingreso.com.libreMercado.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private int id;

    private String nombreDeUsuario;
    private String contraseña;

    public Usuario(){}


    public Usuario(String nombreACrear, String contraseñaACrear){
        setNombreDeUsuario(nombreACrear);
        setContraseña(contraseñaACrear);
    }


    public int getId() {
        return id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Boolean chequearUsuario(String nombreProveninente){
        return (this.nombreDeUsuario.equals(nombreProveninente));

    }

    public Boolean chequearPassWords(String contraseñaProveniente){
        return (this.contraseña.equals(contraseñaProveniente));

    }
}
