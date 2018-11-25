package pl.sda;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    @Test
    public void showMapUsage() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("dom","house");
        dictionary.put("dziecko", "child");
        dictionary.put("samochód", "car");

        for (String key : dictionary.keySet()) {
            System.out.println(key +" : " + dictionary.get(key));
        }

        System.out.println("Klucz wyszukany na bazie wartości: "
                + getKeyForValue("car", dictionary));

        System.out.println(dictionary.get("aaaa"));


    }

    private String getKeyForValue(String value, Map<String, String> dictionary) {
        for (String key : dictionary.keySet()) {
            if (value.equals(dictionary.get(key))) {
                return key;
            }
        }
        return null;
    }

}
