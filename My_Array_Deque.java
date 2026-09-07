
import java.util.ArrayDeque;

public class My_Array_Deque
{
    public static void main(String[] args) 
    {
        ArrayDeque<String> dq=new ArrayDeque<>();
        dq.push("Marvellous");
        dq.push("Infosystem");

        System.out.println("Stack style:"+dq);
        dq.pop();
        System.out.println("After pop:"+dq);        
    }
    
}
