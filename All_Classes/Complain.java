package All_Classes;
import java.io.Serializable;
public class Complain implements Serializable{
   public String User_name;
   public String Complain;
   public String Number;
   public Complain(String User_name,String Number, String Complain)
    {
        this.User_name = User_name;
        this.Number = Number;
        this.Complain = Complain;

    }

    public String toString()
    {
        return "User Name : "+User_name+"\n"+"   Complain Number : "+Number+"\n"+"   Complain : "+Complain+"\n"+"____________________________________________________________________________________________";
    }
    
}

