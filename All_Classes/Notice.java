package All_Classes;
import java.io.Serializable;
public class Notice implements Serializable{

   public String Number;
   public String Date;
   public String Notice;
   public Notice(String Number ,String Date, String Notice)
    {
        this.Number = Number;
        this.Date = Date;
        this.Notice = Notice;
    }

    public String toString()
    {
        return "Notice Number : "+Number+"\t"+"   Notice Date : "+Date+"\t"+"   Notice : "+Notice+"\n"+"_________________________________________________________________________________________________________"+"\n";
    }
}
