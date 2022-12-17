import java.io.Serializable;
public class Complain implements Serializable{
    String User_name;
    String Complain;
    String Number;
    Complain(String User_name,String Number, String Complain)
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

