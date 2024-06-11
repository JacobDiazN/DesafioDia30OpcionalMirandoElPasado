import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {
    public static void main(String[] args) {

        Set<String> invitados = new TreeSet<>();
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        System.out.println("__________________________________________");
        System.out.println("El listado \"invitados\" quedó así :");
        System.out.println("__________________________________________");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }
        System.out.println("__________________________________________");

        Set<String> posiblesInvitados = new TreeSet<>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        System.out.println("El listado \"posiblesInvitados\" quedó así :");
        System.out.println("__________________________________________");
        for (String posibleInvitado : posiblesInvitados) {
            System.out.println(posibleInvitado);
        }
        System.out.println("__________________________________________");


        System.out.println("Se une el Set invitados y el Set posiblesInvitados");
        Set<String> invitadosUnidos = new TreeSet<>(invitados);
        invitadosUnidos.addAll(posiblesInvitados);
        System.out.println("El listado de \"invitadosUnidos\" quedó así :");
        System.out.println("__________________________________________");
        for (String invitadoUnido : invitadosUnidos) {
            System.out.println(invitadoUnido);
        }
        System.out.println("__________________________________________");


        invitadosUnidos.remove("Jorge");
        System.out.println("Jorge acaba de ser eliminado de la lista para no ser invitado, por fome.");
        System.out.println("El listado de \"invitadosUnidos\" quedó definitivamente así :");
        System.out.println("__________________________________________");
        for (String invitadoUnido : invitadosUnidos) {
            System.out.println(invitadoUnido);
        }
        System.out.println("__________________________________________");
    }
}
