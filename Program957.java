
import java.util.HashMap;

public class Program957
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

        int Productid=101;

        //product 101 available quantity:45

        if(inventory.containsKey(Productid))
        {
            System.out.println("Product "+Productid+" Available quantity: "+inventory.get(Productid));
        }

        else
        {
            System.out.println("Product not fount");
        }

        
    }
    
}
