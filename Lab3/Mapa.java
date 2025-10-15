import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static HashMap<String, String> invert(HashMap<String, String> mapToFlip) {

        HashMap<String, String> newInvertedMap = new HashMap<String, String>();

        for (Map.Entry<String, String> entry : mapToFlip.entrySet()) {

            String oldKey = entry.getKey();
            String oldValue = entry.getValue();

            System.out.println("Ключ - " + oldKey + ", Значение - " + oldValue);

            newInvertedMap.put(oldValue, oldKey);
        }

        return newInvertedMap;
    }
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("яблоко", "apple");
        myMap.put("Лада", "Гранта");
        myMap.put("i", "Phone");

        System.out.println("Мапа до:");
        System.out.println(myMap);

        HashMap<String, String> flippedMap = invert(myMap);

        System.out.println("Мапа после:");
        System.out.println(flippedMap);
    }
}