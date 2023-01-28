package All_Classes;
import java.io.Serializable;

public class Transportation implements Serializable{
  public  String Vehicle_Code;
  public  String Vehicle_Type;
  public  String Vehicle_Number;
  public  String Vehicle_Model;
  public  String Driver_Name;
  public  String Driver_Number;
  public  int Rent_Cost;
  public  Transportation(String Vehicle_Code,String Vehicle_Type, String Vehicle_Number ,String Vehicle_Model, String Driver_Name,String Driver_Number,int Rent_Cost)
    {
        this.Vehicle_Code = Vehicle_Code;
        this.Vehicle_Type = Vehicle_Type;
        this.Vehicle_Number = Vehicle_Number;
        this.Vehicle_Model = Vehicle_Model;
        this.Driver_Name = Driver_Name;
        this.Driver_Number = Driver_Number;
        this.Rent_Cost = Rent_Cost;

    }

    public String toString()
    {
        return "Vehicle Code : "+Vehicle_Code+"\n"+"   Vehicle Type : "+Vehicle_Type+"\n"+"   Vehicle Number : "+Vehicle_Number+"\n"+"   Vehicle Model : "+Vehicle_Model+"\n"+"   Driver Name : "+Driver_Name+"\n"+"   Driver Number : "+Driver_Number+"\n"+"   Rent Cost Per Day : "+Rent_Cost+"TK"+"\n"+"____________________________________________________"+"\n";
    }


    
}
