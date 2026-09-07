import java.util.*;
public class MarvellousArrayList
{
    public static void main(String[] args) 
    {
        ArrayList<String>list=new ArrayList<>();
        list.add("Marvellous");
        list.add("Infosystems");
        list.add("Marvellous");

        System.out.println("List:"+list);
        System.out.println("First element:"+list.get(0));
        System.out.println("second element:"+list.get(1));
        System.out.println("Contains marvellous??"+list.contains("Marvellous"));
        System.out.println("Contains logic building"+list.contains("Logic_Building"));

        list.remove("Infosystems");

        System.out.println("After removal:"+list);

        
    }
}