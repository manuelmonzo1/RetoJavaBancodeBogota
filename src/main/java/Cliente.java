
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    private Persona[] personas;
    private int cantidadPersonas;
    private int capacidadMax = 0;

    public Cliente() {
        this.capacidadMax = capacidadMax;
        personas = new Persona[capacidadMax];
        cantidadPersonas = 0;
    }

    //METODO_1 AGREGAR PERSONA
    public void agregarCliente(int i) {
        String nomreUsuario, apellido;
        int cedula;
        System.out.println("Digitar Nombre: ");
        nomreUsuario = scanner.nextLine();
        System.out.println("Digitar Apellido: ");
        apellido = scanner.nextLine();
        System.out.println("Digitar Cedula: ");
        cedula = Integer.parseInt(scanner.nextLine());
        Cliente cliente = new Cliente();
        cliente.setNomreUsuario(nomreUsuario);
        cliente.setApellido(apellido);
        cliente.setCedula(cedula);
        cliente.getNomreUsuario();
        cliente.getApellido();
        cliente.getCedula();
        Banco banco = new Banco();
        banco.mostrarProductos();
        clientes.add(cliente);
        System.out.println("Cliente Creado con Exito");
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
            switch (dato) {
                case 1:
                    Cliente cliente = new Cliente();
                    System.out.println("Digite el nombre: ");
                    nombre = scanner.nextLine();
                    cliente.setNomreUsuario(nombre);
                    break;
                case 2:
                    Cliente cliente1 = new Cliente();
                    System.out.println("Digite el Apellido: ");
                    apellido = scanner.nextLine();
                    cliente1.setApellido(apellido);
                    break;
                case 3:
                    Cliente cliente2 = new Cliente();
                    System.out.println("Digite cedula: ");
                    cedula = scanner.nextLine();
                    cliente2.setCedula(Integer.parseInt(cedula));
                    break;
                case 4:
                    Banco CDT = new Banco();
                    Banco AHORROS = new Banco();

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error escoja una de las opciones indicadas: ");
            }
        }
        while (dato != 5);
    }

    public int consultarClliente() {
        Integer cedula;
        int indice = -1;
        System.out.println("Digite Numero de cedula: ");
        cedula = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < clientes.size(); i++) {
            if (cedula.equals(clientes.get(i).getCedula())) {
                System.out.println("Nombre: " + clientes.get(i).getNomreUsuario());
                System.out.println("Apellido: " + clientes.get(i).getApellido());
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
            clientes.get(i);
            System.out.println("Nombre: " + clientes.get(i).getNomreUsuario());
            System.out.println("Apellido: " + clientes.get(i).getApellido());
            System.out.println("Cedula: " + clientes.get(i).getCedula());
            System.out.println("idProducto: " );
            System.out.println("_____________________________");
            System.out.println("Nombre: " + clientes.get(i+1).getNomreUsuario());
            System.out.println("Apellido: " + clientes.get(i+1).getApellido());
            System.out.println("Cedula: " + clientes.get(i+1).getCedula());
            System.out.println("-----------------------------");
            break;
        }
    }
}


