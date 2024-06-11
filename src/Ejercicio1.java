import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("Tienda Michaely");
        marcas.add("Supermercado Multiahorro");
        marcas.add("Papelería Ercilla");
        marcas.add("Supermercado Almac");
        marcas.add("La Fama");
        marcas.add("Feria del Disco");
        marcas.add("Hotel Crillón");
        marcas.add("Otto Kraus");
        marcas.add("Salo");
        marcas.add("bellsouth");

        System.out.println("_____________________________");
        System.out.println("Las marcas que recuerdo son :");
        System.out.println("_____________________________");
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println(marcas.get(i));
        }

        System.out.println("_____________________________");
        System.out.println("La amiga recuerda 3 marcas que se agregarán al listado, estas son:");
        marcas.add("Blockbaster");
        System.out.println("Blockbaster");
        marcas.add("Carrefour");
        System.out.println("Carrefour");
        marcas.add("Jetix");
        System.out.println("Jetix");
        System.out.println("_____________________________");

        System.out.println("El nuevo listado quedó así :");
        System.out.println("_____________________________");
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println(marcas.get(i));
        }
        System.out.println("_____________________________");
        System.out.println("Nos damos cuenta que 'Blockbaster' en realidad se escribe 'Blockbuster' y decidimos cambiarlo...");

        // Cambiar "Blockbaster" a "Blockbuster"
        int index = marcas.indexOf("Blockbaster");
        if (index != -1) {
            marcas.set(index, "Blockbuster");
        }
        System.out.println("...Se ha modificado con Éxito \"Blockbaster\" a \"Blockbuster\", como se aprecia a continuación");
        System.out.println( "--> " + (marcas.set(index, "Blockbuster" )) + " <--");

        System.out.println("_____________________________");
        System.out.println("Lamentablemente, usted se da cuenta que “Carrefour” aún existe y decide borrarlo del listado. ");
        boolean remover = marcas.remove("Carrefour");
        if(remover){
            System.out.println("True, Carrefour se eliminó de manera correcta");
        }else{
            System.out.println("False, Carrefour no fue eliminó ya que no existe en la lista");
        }

        System.out.println("El nuevo listado quedó así :");
        System.out.println("_____________________________");
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println(marcas.get(i));
        }

        //Usted se inspira y decide hacer una colección aparte de marcas que podrían estar
        //fuera del mercado. Para ello, usted debe agregar marcas (las que quiera) en una nueva
        //ArrayList<>() llamada “posiblesMarcas” e incorporarlas a la lista de ”marcas”.
        System.out.println("_____________________________");
        System.out.println("Se crea un nuevo ArrayList llamado posiblesMarcas, se agregan las siguientes Marcas:");
        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Bebidas Free");
        System.out.println("Bebidas Free");
        posiblesMarcas.add("Chicles Dos en Uno");
        System.out.println("Chicles Dos en Uno");
        posiblesMarcas.add("Dulce Pololeo de Cupido");
        System.out.println("Dulce Pololeo de Cupido");
        System.out.println("_____________________________");

        //Uniendo ambos ArrayList
        marcas.addAll(posiblesMarcas);
        System.out.println("El nuevo listado quedó así :");
        System.out.println("_____________________________");

        int cuenta = marcas.size();
        System.out.printf("Hay %d elementos en la lista.\n", cuenta);
        System.out.println("_____________________________");

    }
}
