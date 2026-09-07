
import java.util.concurrent.ConcurrentHashMap;

public class My_Concurrent_HashMap
 {
    public static void main(String[] args) 
    {
        ConcurrentHashMap<Integer,String>map=new ConcurrentHashMap<>();
        map.put(1, "Marvellous");
        map.putIfAbsent(2, "Infosystems");

        System.out.println(map);
    }
    
}
