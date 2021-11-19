
package assim_4_q1_lab5;

import java.util.Scanner;

public class ASSIM_4_Q1_Lab5 {

    public static void main(String[] args)
    {
        
       Scanner S=new Scanner(System.in);
        System.out.println(" IS The Memebera Doctor or Teachingassistant? ");
        String type=S.next();
        System.out.println(" What's his name? ");
        String name=S.next();
        System.out.println(" How many years Work ? ");
        int y=S.nextInt();
        System.out.println(" How much is the salary ? ");
        int s=S.nextInt();
        MemeberFactory mf=new MemeberFactory();
        Staff mem=mf.getmemeber(type);
        mem.getname(name);
        mem.GetSalary(s);
        mem.getYearsOfWork(y);
        System.out.println("___________________________________\n");
    }
    
}
