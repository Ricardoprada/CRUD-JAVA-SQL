import java.util.Scanner;

public class MensajesService {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("tu nombre");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajeDAD.crearMensajeDB(registro);
    }

    public static void listarMensajes() {
        MensajeDAD.leerMensajesDB();
    }

    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mensaje a eliminar");
        int id_mensaje = sc.nextInt();
        MensajeDAD.borrarMensajeDB(id_mensaje);
    }

    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nuevo mensaje");
        String newMensaje = sc.nextLine();

        System.out.println("¿Cual mensaje desea Editar?");
        int id_mensaje = sc.nextInt();

        Mensajes actualizar = new Mensajes();
        actualizar.setId_mensaje(id_mensaje);
        actualizar.setMensaje(newMensaje);

        MensajeDAD.actualizarMensajeDB(actualizar);

    }

}
