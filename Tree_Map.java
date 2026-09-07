
import java.util.TreeMap;

public class Tree_Map
 
{
    public static void main(String[] args) 
    {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(2, "Marvellous");

         map.put(1, "Infosystems");

         System.out.println("Sorted map"+map);
         System.out.println("First key:"+map.firstKey());


    }
    
}
