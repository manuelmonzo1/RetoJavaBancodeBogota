import java.util.ArrayList;

public class Persona {
    private String nomreUsuario;
    private String apelllido;
    private int cedula;

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Persona(String nomreUsuario, String apelllido, int cedula) {
        this.nomreUsuario = nomreUsuario;
        this.apelllido = apelllido;
        this.cedula = cedula;
    }

    public Persona() {
    }

    public String getNomreUsuario() {
        return nomreUsuario;
    }

    public void setNomreUsuario(String nomreUsuario) {
        this.nomreUsuario = nomreUsuario;
    }


    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nomreUsuario='" + nomreUsuario + '\'' +
                ", apelllido='" + apelllido + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}
