public class Producto {
    private String nombreProducto;
    private String idProducto;

    public Producto(String nombreProducto, String idProducto) {
        this.nombreProducto = nombreProducto;
        this.idProducto = idProducto;
    }

    public Producto() {

    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", idProducto='" + idProducto + '\'' +
                '}';
    }
}
