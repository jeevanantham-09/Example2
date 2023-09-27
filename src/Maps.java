import java.util.HashMap;
import java.util.Map;
public class Maps {
    public static void main(String[] args) {
        Map<String, String> friut = new HashMap<>();
        friut.put("apple", "10");
        friut.put("grapes", "20");
        friut.put("orange", "50");
        friut.put("mango", "30");
        friut.put("papaya", "35");
        for (String key : friut.keySet()) {
            System.out.println(key + "-->" + friut.get(key));
        }
        friut.remove("orange");
        for (String key : friut.keySet()) {
            System.out.println(key + "-->" + friut.get(key));
        }
        friut.put("apple",friut.get("apple")+20);
        for (String key : friut.keySet()) {
            System.out.println(key + "-->" + friut.get(key));
        }
       System.out.println(friut.containsKey("apple"));
        for (String key : friut.keySet()) {
            System.out.println(key + "-->" + friut.get(key));
        }
     }
    }
