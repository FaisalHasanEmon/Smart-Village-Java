package All_Classes;
import java.io.Serializable;

public class Shop implements Serializable{
   public String Product_Code;
   public String Product_Type;
   public String Product_Name;
   public String Product_Quantity;
   public int Product_Price;

   public Shop(String Product_Code, String Product_Type, String Product_Name, String Product_Quantity, int Product_Price)
    {
        this.Product_Code = Product_Code;
        this.Product_Type = Product_Type;
        this.Product_Name = Product_Name;
        this.Product_Quantity = Product_Quantity;
        this.Product_Price = Product_Price;
    }

    public String toString()
    {
        return "Product Code : "+Product_Code+"\n"+"   Product Type : "+Product_Type+"\n"+"   Product Name : "+Product_Name+"\n"+"   Product Quantity : "+Product_Quantity+"\n"+"   Product Price : "+Product_Price+"\n"+"____________________________________________________";
    }

    
}
