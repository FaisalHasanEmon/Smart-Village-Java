import java.io.Serializable;

public class Admin implements Serializable{
    String id;
    String name;
    String nid;
    String email;
    String pass;
    Admin(String name,String nid ,String id , String email ,String pass)
    {
        
        this.name=name;
        this.nid=nid;
        this.id = id;
        this.email = email;
        this.pass = pass;
    }

    public String toString()
    {
        return "Admin Name : "+name+"\n"+"   Admin NID : "+nid+"\n"+"   Admin User Name : "+id+"\n"+"   Admin Email : "+email+"\n"+"______________________________________________________________________________________"+"\n";
    }
}


 class User implements Serializable{
    String Name;
    String User_Name;
    String Email;
    String Profession;
    String Phone;
    String Pass;
    User(String Name , String User_Name ,String Email, String Profession, String Phone, String Pass)
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
