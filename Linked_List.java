
import java.util.LinkedList;


public class Linked_List 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("Marvellous");
        list.addFirst("Ganesh");
        list.addLast("Saraswati");
        list.getFirst();

        System.out.println(list);
        list.removeFirst();
        System.out.println("after removal:"+list);
    }
    
}
