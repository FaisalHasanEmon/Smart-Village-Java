package All_Classes;
import java.io.Serializable;

public class Cottage implements Serializable{
   public String Cottage_Code;
   public String Cottage_Type;
   public int Cottage_Price;

   public Cottage(String Cottage_Code, String Cottage_Type, int Cottage_Price)
    {
        this.Cottage_Code = Cottage_Code;
        this.Cottage_Type = Cottage_Type;
        this.Cottage_Price = Cottage_Price;
    }

    public String toString()
    {
        return "Cottage Code : "+Cottage_Code+"\n"+"   Cottage Type : "+Cottage_Type+"\n"+"   Cottage Price : "+Cottage_Price+"\n"+"____________________________________________________";        
    }
    
}
