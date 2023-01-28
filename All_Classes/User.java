package All_Classes;
import java.io.Serializable;

public class User implements Serializable{
   public String Name;
   public String User_Name;
   public String Email;
   public String Profession;
   public String Phone;
   public String Pass;
   public User(String Name , String User_Name ,String Email, String Profession, String Phone, String Pass)
    {
        this.Name = Name;
        this.User_Name = User_Name;
        this.Email = Email;
        this.Profession = Profession;
        this.Phone = Phone;
        this.Pass = Pass;

    }

    public String toString()
    {
        return "Name : "+Name+"\n"+"   User Name : "+User_Name+"\n"+"   Email : "+Email+"\n"+"   Profession : "+Profession+"\n"+"   Phone Number : "+Phone+"\n"+"______________________________________________________________________________________";
    }
}