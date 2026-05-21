package java_prct;
import java.util.HashMap;
import java.util.Map;

public class UnboxingNPE {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        try{
            int value = map.get("key");
            System.out.println("Value: " + value);
        } catch(Exception e){
            System.out.println("Caught exception: " + e);
        }

        int safe = map.getOrDefault("key", 0);
        System.out.println("Safe value: " + safe);
        
    }
    
}
