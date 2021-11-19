
package assim_4_q1_lab5;

public class MemeberFactory 
{
    public Staff getmemeber(String MemeberName)
    {
        String M=MemeberName.toLowerCase();
        switch(M)
        {
                case "doctor":
                    return new Doctor();
                case "teachingassistant":
                    return new TeachingAssistant();  
                default:
                        return null;
        }
        
    }
}
