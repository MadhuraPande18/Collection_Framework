import  java.util.*;
public class Tree_Set
{
    public static void main(String[] args) 
    {
        TreeSet<String>set=new TreeSet<>();

        set.add("Marvellous");
        set.add("PPA");
        set.add("LB");
        //it gives sorted list
        System.out.println("Sorted set:"+set);
        System.out.println("First:"+set.first());

        
    }
}