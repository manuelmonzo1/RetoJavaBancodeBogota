import java.util.Scanner;

public class Menu {
    Cliente cliente = new Cliente(1);
    Scanner scanner = new Scanner(System.in);
    int opcion;
    public Menu(int i) {
    }

    public void ejecutarMenu() {
        do {
            System.out.println("*******************************");
            System.out.println("********Menu*******");
            System.out.println("Opcion 1: registro cliente nuevo");
            System.out.println("Opcion 2: actualizacion cliente actual");
            System.out.println("Opcion 3: buscar cliente por cedula");
            System.out.println("Opcion 4: ver lista de clientes");
            System.out.println("Opcion 5: Salir");
            System.out.println("***********************");
            System.out.print("Selecionar una Opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());
            Cliente cliente = new Cliente(1);
            switch (opcion) {
                case 1:
                    cliente.agregarCliente();
                    break;
                case 2:
                    cliente.actualizarCliente();
                    break;
                case 3:
                    cliente.consultarCliente();
                    break;
                case 4:
                    cliente.verListaCliente();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error escoja una de las opciones indicadas: ");
            }
        } while (opcion != 5);
    }

}
