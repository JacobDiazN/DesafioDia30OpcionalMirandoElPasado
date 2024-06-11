import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {
    public static void main(String[] args) {

        Queue<String> juegos = new LinkedList();
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        int cantidadJuegos = juegos.size();

        System.out.println("__________________________________________");
        System.out.println("El listado de \"juegos\" quedó así :");
        System.out.println("__________________________________________");
        while (!juegos.isEmpty()) {
            String juego = juegos.poll();
            System.out.println(juego);
        }
        System.out.println("__________________________________________");

        System.out.printf("Hay %s juegos en la lista \"juegos\"\n" , cantidadJuegos);
        System.out.println("__________________________________________");
    }
}
