//Creare un hashmap prendere tutti i valori, ordinarli e stamparli
import java.util.*;
public class Main {
    public static void main(String[] arg) {
        System.out.println("Hello world!");

        Map<String,Integer> mappaEta = new HashMap<>();
        mappaEta.put("adulto",30);
        mappaEta.put("giovane", 15);
        mappaEta.put("anziano",70);
        mappaEta.put("bambino",5);





        Collection<Integer> collectionOrdinati = mappaEta.values();

        ArrayList<Integer> arrayOrdinati = new ArrayList<>(collectionOrdinati);

        arrayOrdinati.sort(Comparator.naturalOrder());

        System.out.println(arrayOrdinati);

        System.out.println(mappaEta);

    }
}