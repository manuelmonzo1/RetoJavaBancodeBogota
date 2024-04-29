import java.security.SecureRandom;

public class Banco extends Producto {


    private Producto[] productos;
    private int cantProductos;

    private int capacidadMax = 0;

    public Banco() {
        super();
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
        SecureRandom secureRandom = new SecureRandom();

        // Generar un MAC aleatorio
        byte[] macAddress = new byte[6];
        secureRandom.nextBytes(macAddress);

        // Imprimir el MAC aleatorio generado
        System.out.print("MAC aleatorio del producto: ");
        for (int i = 0; i < macAddress.length; i++) {
            System.out.printf("%02X%s", macAddress[i], (i < macAddress.length - 1) ? "-" : "");
        }
        // Imprimir otros detalles del producto
        System.out.println("\nTipo: CDT");
        System.out.println("Descripción: Certificado de Depósito a Término");

    }
//        System.out.println("Mostrar Productos: ");
//        for (int i = 0; i < 1; i++) {
//            System.out.println("Producto #" + (i + 1));
//            System.out.println("CDT");
//            System.out.println("CUENTA DE NOMINA");
//            productos.clone();
//        }
}



