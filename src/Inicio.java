import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {

        Conexion conexion = new Conexion();

        try(Connection cnx = conexion.get_connection()) {

        } catch (SQLException e) {
            System.out.println(e);
        }

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("-------------------");
            System.out.println("\tAplicación de Mensajes\n");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar  Mensajes");
            System.out.println("3. Editar Mensaje");
            System.out.println("4. Borrar Mensaje");
            System.out.println("5. Salir");
            System.out.println("-------------------");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    break;
            }

        }while (opcion != 5);


    }

}
