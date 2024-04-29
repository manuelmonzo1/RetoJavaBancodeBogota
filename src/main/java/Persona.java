public class Persona {
    private String nomreUsuario;
    private String apellido;
    private int cedula;


    public Persona(String nomreUsuario, String apellido, int cedula) {
        this.nomreUsuario = nomreUsuario;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nomreUsuario='" + nomreUsuario + '\'' +
                ", apelllido='" + apellido + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}
