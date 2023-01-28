package All_Classes;
import java.io.Serializable;

public class Newspaper implements Serializable{

   public String Newspaper_Name;
   public String Newspaper_Type;
   public int Newspaper_Price;
   public Newspaper(String Newspaper_Name, String Newspaper_Type, int Newspaper_Price)
    {
        this.Newspaper_Name = Newspaper_Name;
        this.Newspaper_Type = Newspaper_Type;
        this.Newspaper_Price = Newspaper_Price;
    }

    public String toString()
    {
        return "Newspaper Name : "+Newspaper_Name+"\n"+"   Newspaper Type : "+Newspaper_Type+"\n"+"   Newspaper Price : "+Newspaper_Price+"\n"+"____________________________________________________";
    }

    
}
