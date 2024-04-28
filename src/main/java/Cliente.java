
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private Persona[] personas;
    private int cantidadPersonas;
    private final int capacidadMax;

    int indice;

    public Cliente(int capacidadMax) {
        super();
        this.capacidadMax = capacidadMax;
        //Capacidad Maxima del Array
        personas = new Persona[capacidadMax];
        cantidadPersonas = 1;
    }
    //AGREGAR CLIENTE FUNCIONAMIENTO (0K)
    public void agregarCliente() {
        String nombre, apellido, cedula;
        System.out.println("Digitar Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Digitar Apellido: ");
        apellido = scanner.nextLine();
        System.out.println("Digitar Cedula: ");
        cedula = scanner.nextLine();
        Cliente cliente = new Cliente(1);
        clientes.add(cliente);
        System.out.println("Cliente Creado con Exito");
    }
    public void mostrarCliente(int indice) {
        System.out.println("Cliente numero: " + (indice + 1));
        System.out.println("Nombre: " + clientes.get(indice).getNomreUsuario());
        System.out.println("Cedula: " + clientes.get(indice).getCedula());
//        for (int j = 0; j < clientes.get(indice).getProductos().length; j++) {
//            System.out.println("producto " + (j + 1) + " " + clientes.get(indice).getProductos()[j]);
//        }
    }
    public int consultarCliente() {
        String cedula;
        int indice = -1;
        System.out.println("Digite Numero de cedula: ");
        cedula = scanner.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(indice).equals(cedula)) {
                indice = i;
            }
        }
        if (indice == -1) {
            System.out.println("cliente no encontrado: ");
        }
        return indice;
    }
    public void verListaCliente() {
        System.out.println("Los clientes son las siguientes: ");
        for (int i = 0; i < clientes.size(); i++) {
            agregarCliente();
            System.out.println(getNomreUsuario());
            break;
        }
    }

    public void actualizarCliente() {
        String nombre, apellido, cedula;
        String[] productos = new String[5];
        int dato;
        do {
            System.out.println("Por favor indique el dato que quiere modificar: ");
            System.out.println("Opcion 1: Nombre");
            System.out.println("Opcion 2: Apellido");
            System.out.println("Opcion 3: Cedula");
            System.out.println("Opcion 4: Productos");
            System.out.println("Opcion 5: Salir");
            System.out.println("***********************");
            System.out.print("Selecionar una Opcion: ");
            dato = Integer.parseInt(scanner.nextLine());
            int indice = 0;
            switch (dato) {
                case 1:
                    Cliente cliente = new Cliente(10);
                    System.out.println("Digite el nombre: ");
                    nombre = scanner.nextLine();
                    cliente.setNomreUsuario(nombre);
                    break;
                case 2:
                    Cliente cliente1 = new Cliente(1);
                    System.out.println("Digite el Apellido: ");
                    apellido = scanner.nextLine();
                    cliente1.setApelllido(apellido);
                    break;
                case 3:
                    Cliente cliente2 = new Cliente(1);
                    System.out.println("Digite cedula: ");
                    cedula = scanner.nextLine();
                    cliente2.setCedula(Integer.parseInt(cedula));
                    break;
                case 4:
//                    System.out.println("Digite su primer producto: ");
//                    productos[0] = scanner.nextLine();
//                    System.out.println("Digite su segundo producto: ");
//                    productos[1] = scanner.nextLine();
//                    clientes.get(indice).
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error escoja una de las opciones indicadas: ");
            }
        }
        while (dato != 5);
    }

}
