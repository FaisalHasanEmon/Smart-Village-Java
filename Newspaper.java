import java.io.Serializable;

import javax.lang.model.element.NestingKind;
public class Newspaper implements Serializable{

    String Newspaper_Name;
    String Newspaper_Type;
    int Newspaper_Price;
    Newspaper(String Newspaper_Name, String Newspaper_Type, int Newspaper_Price)
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
