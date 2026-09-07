
import java.util.HashMap;

public class Program956 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,Integer>inventory=new HashMap<Integer,Integer>();
        //key-value--->Integer,integer

        //Add 101 50

        inventory.put(101, 50);

        //Add 102 30

        inventory.put(102, 30);

        //SELL 101 5

        if(inventory.containsKey(101))
        {
            inventory.put(101, inventory.get(101)-5);
        }

        //RESTOCK 102 20

        if(inventory.containsKey(102))
        {
            inventory.put(102, inventory.get(102)+20);
        }

        System.out.println(inventory);

        
    }
    
}
