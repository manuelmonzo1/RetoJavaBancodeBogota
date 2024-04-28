import java.sql.SQLOutput;
import java.util.Scanner;

public class Banco extends Producto {

    private Producto[] productos;
    private int cantProductos;
    private final int capacidadMax;

    public Banco(int capacidadMax) {
        super();
        this.capacidadMax = capacidadMax;
        //Capacidad Maxima del Array
        productos = new Producto[5];
        cantProductos = 0;
    }

    //Metodo para Agregar Productos
    public void agregarProducto(Producto producto) {
        if (cantProductos < capacidadMax) {
            productos[capacidadMax] = producto;
            cantProductos++;
            System.out.println("El producto se Agrego correctamente: ");
        } else {
            System.out.println("No puede ingresar mas productos: ");
        }
    }

    public void mostrarProductos() {
        System.out.println("Mostrar Productos: ");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto #" + (i + 1));
            System.out.println("Tipo: " + getNombreProducto());
            System.out.println("Tipo: " + getIdProducto());
            productos[i].toString();
        }
    }

}
