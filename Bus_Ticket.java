import java.io.Serializable;
public class Bus_Ticket implements Serializable{
    String Ticket_Code;
    String Destination;
    String DateAndTime;
    int Ticket_Price;

    Bus_Ticket(String Ticket_Code, String Destination , String DateAndTime,int Ticket_Price)
    {
        this.Ticket_Code = Ticket_Code;
        this.Destination = Destination;
        this.DateAndTime = DateAndTime;
        this.Ticket_Price = Ticket_Price; 
    }

    public String toString()
    {
        return "Ticket Code : "+Ticket_Code+"\n"+"   Destination : "+Destination+"\n"+"   Date And Time : "+DateAndTime+"\n"+"   Ticket Price : "+Ticket_Price+"\n"+"____________________________________________________";
    }
    
}
