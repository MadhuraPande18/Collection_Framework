import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program968 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Amit",78);
        Student s2 = new Student("Pooja",92);
        Student s3 = new Student("Rahul",85);
        Student s4 = new Student("Neha",92);
        Student s5 = new Student("Kiran",67);

         ArrayList <Student> aobj = new ArrayList<Student>();

        aobj.add(s1);
        aobj.add(s2);
        aobj.add(s3);
        aobj.add(s4);
        aobj.add(s5);

            
        Collections.sort(aobj, new Comparator<Student>()
        {
            public int compare(Student s1, Student s2)
            {
                if(s1.marks != s2.marks)
                {
                    return s2.marks-s1.marks;   // Diffrence
                }
                return s1.name.compareTo(s2.name);  // -1 0 1
            }
        });

        for(Student s : aobj)
        {
            System.out.println(s);
        }
        
    }
    
}
