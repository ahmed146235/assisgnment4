
package assim_4_q1_lab5;
 
public class Doctor implements Staff
{

    public Doctor()
    {
        System.out.println("He is a Doctor ");
    }
    
    public void getname(String name)
    {
        System.out.println(" The Doctor : "+name);
    }
    public void GetSalary(int S)
 {
     System.out.println(" The salary is "+S+" P.E");
 }
   public void getYearsOfWork(int y)
 {
     System.out.println(" The Years of work "+y+" years");
 }
}
