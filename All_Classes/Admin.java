package All_Classes;
import java.io.Serializable;

public class Admin implements Serializable{
  public  String id;
  public  String name;
  public  String nid;
  public  String email;
  public  String pass;
  public  Admin(String name,String nid ,String id , String email ,String pass)
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





