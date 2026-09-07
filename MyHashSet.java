
import java.util.HashSet;

public class MyHashSet 
{
    public static void main(String[] args) 
    {
        HashSet<String>set=new HashSet<>();
        set.add("Marvellous");
        set.add("Infosystems");
        set.add("Marvellous");  //duplicates will get ignored

        System.out.println(set);

        
    }
    
}
