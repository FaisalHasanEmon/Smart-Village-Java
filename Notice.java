import java.io.Serializable;
public class Notice implements Serializable{

    String Number;
    String Date;
    String Notice;
    Notice(String Number ,String Date, String Notice)
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
