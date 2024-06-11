import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {
    public static void main(String[] args) {

        Map<String, Integer> golosinas = new TreeMap<>();

        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tabletón", 5);

        System.out.println("__________________________________________________________________");
        System.out.println("El listado de \"golosinas\":");
        System.out.println("__________________________________________________________________");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            System.out.printf("%-11s : %d\n", entry.getKey(), entry.getValue());
        }
        System.out.println("__________________________________________________________________");


        System.out.println("El listado filtrado por las \"golosinas\" que costaban menos de 100:");
        System.out.println("__________________________________________________________________");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(entry.getValue()<100){
                System.out.printf("%-11s : %d\n", key, value);
            }
        }
        System.out.println("__________________________________________________________________");
    }
}
