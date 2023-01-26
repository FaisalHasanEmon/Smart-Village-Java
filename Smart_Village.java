import java.io.*;
import java.net.SocketTimeoutException;
import java.security.DrbgParameters.NextBytes;
import java.sql.Blob;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

import javax.lang.model.element.NestingKind;
import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.SourceDataLine;
import javax.swing.TransferHandler.TransferSupport;

public class Smart_Village 
{
    
//============================================THE FOLLOWING METHOD CONVERTS STRING TO INTEGER AND CHEKS THE CONVERTED STRING IS INTEGER OR NOT ============================== 
    static int a,b; 
    static int Int_Check(String y)
    {
        int x = -1;
        String  m = y;
        do{
            try 
            { 
                Integer.parseInt(m); 
                a = Integer.valueOf(m);
                
            }  
            catch (NumberFormatException e)  
            { 
                System.out.println(m + " is not a valid input"); 
            }
            x=0;
            
            }while(x!=0);

            return a;
    }
//========================================================================================================================================================================
    
     
    public static void main(String[] args) throws Exception{
        
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

    //================================ CREATING FIELS =================================================
        
        File file = new File("Admin.txt");
        File file1 = new File("Notice.txt");
        File file2 = new File("Cottage.txt");
        File file3 = new File("Newspaper.txt");
        File file4 = new File("Bus_Ticket.txt");
        File file5 = new File("Transportation.txt");
        File file6 = new File("Shoping.txt");
        File file_01 = new File("User.txt");
        File file_02 = new File("Complain.txt");

    
    //=================================================================================================    

    
    //=============================== LISTS AND ITERATORS ==============================================
        //Admin List and Iterator
        ArrayList<Admin> admin = new ArrayList<Admin>();
        ListIterator<Admin> admin_list = null;

        //Notice List and Iterator
        ArrayList<Notice> notice = new ArrayList<Notice>();
        ListIterator<Notice> notice_list = null; 

        //Cottage List and Iterator
        ArrayList<Cottage> cottage = new ArrayList<Cottage>();
        ListIterator<Cottage> cottage_list = null;

        //Newspaper List and Iterator
        ArrayList<Newspaper> newspaper = new ArrayList<Newspaper>();
        ListIterator<Newspaper> newspaper_list = null;

        //Bus Ticket List and Iterator
        ArrayList<Bus_Ticket> bus = new ArrayList<Bus_Ticket>();
        ListIterator<Bus_Ticket> bus_list = null;
        
        //Transportation List and Iterator
        ArrayList<Transportation> vehicle = new ArrayList<Transportation>();
        ListIterator<Transportation> vehicle_list = null;

        //Shoping List and Iterator
        ArrayList<Shop> product = new ArrayList<Shop>();
        ListIterator<Shop> product_list= null;

        //User List and Iterator
        ArrayList<User> user = new ArrayList<User>();
        ListIterator<User> user_list = null;

        //User Complain List and Itereator
        ArrayList<Complain> complain = new ArrayList<Complain>();
        ListIterator<Complain> complain_list = null;


    //================================================================================================    
    
    //=====================  ObjectOutputStream AND ObjectInputStream CLASS OBJECTS ==================  
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
    //================================================================================================ 
   
    //================================ READING FILES =================================================    
        
        if(file.isFile())
        {
            //Admin ---> file
            ois = new ObjectInputStream(new FileInputStream(file));
            admin = (ArrayList<Admin>)ois.readObject();
            ois.close();
        }

        if(file1.isFile())
        {
            //Notice ---> file1
            ois = new ObjectInputStream(new FileInputStream(file1));
            notice = (ArrayList<Notice>)ois.readObject();
            ois.close();
        }

        if(file2.isFile())
        {
            //Cottage ---> file2
            ois = new ObjectInputStream(new FileInputStream(file2));
            cottage = (ArrayList<Cottage>)ois.readObject();
            ois.close();
        }

        if(file3.isFile())
        {
            //Newspaper ---> file3
            ois = new ObjectInputStream(new FileInputStream(file3));
            newspaper=(ArrayList<Newspaper>)ois.readObject();
            ois.close();
        }
        
        if(file4.isFile())
        {
            //Bus Tickets ---> file4
            ois = new ObjectInputStream(new FileInputStream(file4));
            bus=(ArrayList<Bus_Ticket>)ois.readObject();
            ois.close();
        }

        if(file5.isFile())
        {
            //Transportation ---> file5
            ois = new ObjectInputStream(new FileInputStream(file5));
            vehicle = (ArrayList<Transportation>)ois.readObject();
            ois.close();
        }

        if(file6.isFile())
        {
            //Shoping ---> file6
            ois = new ObjectInputStream(new FileInputStream(file6));
            product = (ArrayList<Shop>)ois.readObject();
            ois.close();
        }
        
        if(file_01.isFile())
        {            
            //User ---> file_01
            ois = new ObjectInputStream(new FileInputStream(file_01));
            user = (ArrayList<User>)ois.readObject();
            ois.close();

        }

        if(file_02.isFile())
        {
            //Complain ---> file0_2
            ois = new ObjectInputStream(new FileInputStream(file_02));
            complain = (ArrayList<Complain>)ois.readObject();
            ois.close();

        }
    //================================================================================================    

        char choice ='~';
        do{
            System.out.print("\033[H\033[2J");  
            System.out.flush();   
            System.out.println("------------------------------------------");
            System.out.println("|           WELCOME TO SMART             |"); 
            System.out.println("|            FURFURI NAGAR               |");
            System.out.println("------------------------------------------");
            System.out.println("| 1 .START AS ADMIN                      |");
            System.out.println("| 2 .START AS USER                       |");
            System.out.println("| 0 .EXIT                                |");
            System.out.println("-----------------------------------------");
            System.out.print("--> Select An Option : ");
            choice = sc.next().charAt(0);

            switch(choice)
            {
//------------------------------------------------------------------------------- FIRST PAGE -----------------------------------------------------------------------                
                case '1':
                    
                    char ad_choice1 ='~';
                    do
                    {
                        System.out.print("\033[H\033[2J");
                        System.out.println("__________________________");
                        System.out.println();
                        System.out.println("\tAdmin Page");
                        System.out.println("__________________________");
                        System.out.println("1 .Sign Up ");
                        System.out.println("2 .Log In ");
                        System.out.println("0. Back");
                        System.out.print("Select An Option : ");
                        ad_choice1 = sc.next().charAt(0);
                         

                        switch(ad_choice1)
                        {
                       //=================================================== ADMIN SIGNUP OPEN ================================================================        
                            
                       case '1':
                                char hold = '~';
                                do

                                {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("____________________________________");
                                    System.out.println();
                                    System.out.println("\tAdmin Sign Up Page");
                                    System.out.println("____________________________________");
                                    System.out.println();
                                    
                                    System.out.print("Enter Full Name : ");
                                    String admin_name =sc1.nextLine();

                                    System.out.print("Enter NID Number : ");
                                    String admin_nid = sc1.nextLine();
                                
                                    System.out.print("Enter Username : ");
                                    String admin_id = sc1.nextLine();

                                    System.out.print("Enter Email : ");
                                    String admin_email = sc1.nextLine();

                                    System.out.print("Enter Password : ");
                                    String admin_pass = sc1.nextLine();
                                    
                                    admin_list = admin.listIterator();
                                    Boolean ad_signup_check = false;
                                    while(admin_list.hasNext())
                                    {
                                        Admin ad_ch = (Admin)admin_list.next();
                                        if(admin_id.equals(ad_ch.id) || admin_email.equals(ad_ch.email) || admin_pass.equals(ad_ch.pass))
                                        {
                                            System.out.println("You Hava Already An Account. Please Login :)");
                                            ad_signup_check = true;
                                        }
                                    }
                                    if(ad_signup_check==false)
                                    {
                                        admin.add(new Admin(admin_name, admin_nid, admin_id, admin_email, admin_pass));
                                        oos = new ObjectOutputStream(new FileOutputStream(file));
                                        oos.writeObject(admin);
                                        oos.close();
                                        System.out.println();
                                        System.out.println("Account Has Successfully Created !!! ");
                                        System.out.println("You Can Login Now From Admin Page :) ");

                                    }

                                    System.out.println();
                                    System.out.print("Go Back To Admin Page (Press 0) : ");
                                    hold = sc.next().charAt(0);
                                }while(hold!='0');
                                
                                break;
                       //============================================== ADMIN SIGNUP CLOSE ==========================================================    
                           
                       
                       //============================================== ADMIN LOGIN OPEN =============================================================
                       case '2':
                                if(file.isFile())
                                {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("__________________________");
                                    System.out.println();
                                    System.out.println("\tAdmin Login");
                                    System.out.println("__________________________");
                                    System.out.println();
                                    
                                    Boolean check = false;

                                    System.out.print("Enter Username :");
                                    String admin_log_id = sc1.nextLine();
                                
                                    System.out.print("Enter Password : ");
                                    String admin_log_pass = sc1.nextLine();

                                    admin_list = admin.listIterator();
                                    while(admin_list.hasNext())
                                    {
                                        Admin a = (Admin)admin_list.next();
                                        
                                        if(admin_log_id.equals(a.id) && admin_log_pass.equals(a.pass))
                                        {
                                            char ad_choice2='~';
                                            do
                                            {
                                                System.out.print("\033[H\033[2J");
                                                System.out.println("__________________________");
                                                System.out.println();
                                                System.out.println("\tAdmin Page");
                                                System.out.println("__________________________");
                                                System.out.println();

                                                System.out.println("1 .Notice");
                                                System.out.println("2 .Manage Users");
                                                System.out.println("3 .View Complains");
                                                System.out.println("4 .Manage Cottage");
                                                System.out.println("5 .Manage Newspaper ");
                                                System.out.println("6 .Mange Bus Tickets");
                                                System.out.println("7 .Manage Transportations");
                                                System.out.println("8 .Shoping Details");
                                                System.out.println("9 .Admin Settings");
                                                System.out.println("0 .Back");
                                                System.out.print("Select An Option : ");
                                                ad_choice2 = sc.next().charAt(0);
                                                switch(ad_choice2)
                                                {
                                                    //============================================== 1.ADMIN NOTICE ==========================================
                                                    case '1':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("__________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tNotice");
                                                        System.out.println("___________________________________________");
                                                        System.out.println();
                                                        char ad_notice_choice = '~';
                                                        do
                                                        {
                                                        System.out.println("1. Announce Notice");
                                                        System.out.println("2. View Notice");
                                                        System.out.println("3. Update Notice");
                                                        System.out.println("4. Delete Notice");
                                                        System.out.println("0. Back");
                                                        System.out.print("Select An Option : ");
                                                        ad_notice_choice = sc.next().charAt(0);
                                                        switch(ad_notice_choice)
                                                        {
                                                        //============================================== 1.1 ANNOUNCE NOTICE ==========================================
                                                            case '1':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("__________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tAnnounce Notice");
                                                                System.out.println("___________________________________________");
                                                                System.out.println();

                                                                System.out.print("Enter Notice Number : ");
                                                                String ad_notice_num = sc1.nextLine();

                                                                System.out.print("Enter Notice Date : ");
                                                                String ad_notice_date = sc1.nextLine();

                                                                System.out.print("Write Noice : ");
                                                                String ad_notice_write = sc1.nextLine();
                                                                notice.add(new Notice(ad_notice_num, ad_notice_date, ad_notice_write));

                                                                oos = new ObjectOutputStream(new FileOutputStream(file1));
                                                                oos.writeObject(notice);
                                                                oos.close();
                                                            break;

                                                        ////============================================== 1.2 VIEW NOTICE ==============================================================
                                                            case '2':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("_________________________________________________________________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\t\t\t\tViewing Notice");
                                                                System.out.println("_________________________________________________________________________________________________________");
                                                                System.out.println();
                                                                
                                                                if(file1.isFile())
                                                                {
                                                                int i = 1;
                                                                notice_list=notice.listIterator();
                                                                while(notice_list.hasNext())
                                                                {
                                                                    System.out.println(i+". "+notice_list.next());
                                                                    i++;
                                                                }
                                                                }

                                                                else
                                                                {
                                                                    System.out.println("Oops!!! Nothing Found :(");
                                                                }
                                                                

                                                            break;

                                                        ////============================================== 1.3 UPDATE NOTICE ==============================================================
                                                            case '3':
                                                                
                                                                if(file1.isFile())
                                                                {
                                                                    
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tUpdate Notice");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();

                                                                    System.out.print("Enter Notice Number : ");
                                                                    String ad_new_notice_num = sc1.nextLine();

                                                                    notice_list = notice.listIterator();
                                                                    Boolean new_notice_check = false;
                                                                    while(notice_list.hasNext())
                                                                    {
                                                                        Notice update_notice=(Notice)notice_list.next(); 
                                                                        if(ad_new_notice_num.equals(update_notice.Number))
                                                                        {
                                                                            System.out.print("Enter New Notice Date : ");
                                                                            String new_notice_date = sc1.nextLine();
                                                                            
                                                                            System.out.print("Enter new notice : ");
                                                                            String new_notice = sc1.nextLine();

                                                                            notice_list.set(new Notice(ad_new_notice_num, new_notice_date, new_notice));
                                                                            new_notice_check = true;
                                                                        }
                                                                    }

                                                                    if(new_notice_check==true)
                                                                    {
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file1));
                                                                        oos.writeObject(notice);
                                                                        oos.close();
                                                                        System.out.println("Notice Successfully Updated:)"); 
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Notice not found :/");
                                                                    }
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Oops!!! Nothing Found :(");
                                                                }
                                                            break;
                                                        
                                                        ////============================================== 1.4 DELETE NOTICE ==============================================================
                                                            case '4':
                                                                if(file1.isFile())
                                                                {
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tDelete Notice");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();

                                                                    System.out.print("Enter Notice Number : ");
                                                                    String notice_delete_number = sc1.nextLine();
                                                                    notice_list = notice.listIterator();
                                                                    Boolean notice_delete_check = false;
                                                                    while(notice_list.hasNext())
                                                                    {
                                                                        Notice update_notice=(Notice)notice_list.next(); 
                                                                        if(notice_delete_number.equals(update_notice.Number))
                                                                        {
                                                                            
                                                                            notice_list.remove();
                                                                            notice_delete_check = true;
                                                                        }
                                                                    }
                                                                    if(notice_delete_check == true)
                                                                    {                                      
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file1));
                                                                        oos.writeObject(notice);
                                                                        oos.close();
                                                                        System.out.println("Notice Deleted Successfully :) ");
                                                                        System.out.println();
                                                                    }
                                                                    else{
                                                                        System.out.println("Notice Not Found :| ");
                                                                        System.out.println();
                                                                    }
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Oops!!! Nothing Found :(");
                                                                }
                                                            break;
                                                        }


                                                        }while(ad_notice_choice!='0');

                                                    break;
                                                ////============================================== 1.0 ADMIN NOTICE CLOSED ==============================================================

                                                ////============================================== 2 MANAGE USERS =====================================================================
                                                case '2':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tUser Management");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        if(file_01.isFile())
                                                        {
                                                        
                                                            char user_manage = '~';
                                                            do{
                                                                System.out.println("1 .View User Accounts ");
                                                                System.out.println("2 .Remove User Account");
                                                                System.out.println("0 .Back");
                                                                System.out.print("Select An Option : "); 
                                                                user_manage = sc.next().charAt(0);
                                                                switch(user_manage)
                                                                {
                                                                ////============================================== 2.1 VIEW USERS =====================================================================
                                                                    case '1':
                                                                        System.out.print("\033[H\033[2J");    
                                                                        System.out.println("______________________________________________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\t\t\tUser Accounts");
                                                                        System.out.println("______________________________________________________________________________________");
                                                                        System.out.println("______________________________________________________________________________________");
                                                                        System.out.println();
                                                                        user_list = user.listIterator();
                                                                        int i=1;
                                                                        while(user_list.hasNext())
                                                                        {
                                                                            System.out.println(i+". "+user_list.next());
                                                                            i++;
                                                                        }
                                                                    break;
                                                                ////============================================== 2.2 DELETE USERS =====================================================================
                                                                    case '2':
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.println("______________________________________________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\t\tManage User Accounts");
                                                                        System.out.println("______________________________________________________________________________________");
                                                                        System.out.println("______________________________________________________________________________________");
                                                                        System.out.println();

                                                                        System.out.print("Enter User Handle(User Name) :");
                                                                        String remove_user = sc1.nextLine();
                                                                        user_list = user.listIterator();
                                                                        Boolean user_delete_check = false;
                                                                        while(user_list.hasNext())
                                                                        {
                                                                            User user_acc = (User)user_list.next();
                                                                            if(remove_user.equals(user_acc.User_Name))
                                                                            {
                                                                                user_list.remove();
                                                                                user_delete_check = true;
                                                                            }
                                                                        }
                                                                        if(user_delete_check == true)
                                                                        {
                                                                            oos = new ObjectOutputStream(new FileOutputStream(file_01));
                                                                            oos.writeObject(user);
                                                                            oos.close();
                                                                            System.out.println("User Removed");
                                                                        }
                                                                        else 
                                                                        {
                                                                            System.out.println("Wrong User Handle (User Name) ");
                                                                        }
                                                                    break;
                                                                ////============================================== 2.2 DELETE USERS CLOSED =====================================================================   



                                                                }


                                                            }while(user_manage!='0');

                                                        }
                                                        else 
                                                        {
                                                            System.out.println("Oops!!! Nothing Found :( ");
                                                        }
                                                    break;
                                                ////============================================== MANAGE USERS CLOSED =================================================================
                                                
                                                ////============================================== 3 VILLAGERS COMPLAINS =================================================================
                                                case '3':
                                                        System.out.print("\033[H\033[2J");
                                                        
                                                        System.out.println("____________________________________________________________________________________________");
                                                        System.out.println("\t\t\t\t\tVillagers Complains");
                                                        System.out.println("____________________________________________________________________________________________");
                                                        if(file_02.isFile())
                                                        {
                                                            

                                                            char ad_view_complains = '~';
                                                            do{
                                                                complain_list = complain.listIterator();
                                                                int i = 1;

                                                                
                                                                while(complain_list.hasNext())
                                                                {
                                                                    System.out.println(i+". "+complain_list.next());
                                                                    i++;
                                                                } 
                                                                System.out.print("Back To Main Menu (Type 0) : ");
                                                                ad_view_complains = sc.next().charAt(0);
                                                                switch(ad_view_complains)
                                                                {

                                                                }

                                                                System.out.println();
                                                                System.out.print("Back To Main Menu (Press 0) : ");
                                                                ad_view_complains = sc.next().charAt(0);
                                                                switch(ad_view_complains)
                                                                {

                                                                }
                                                            }while(ad_view_complains != '0');
                                                        }
                                                        else 
                                                        {
                                                            System.out.println("Oops!!! Nothing Found :(");
                                                        }
                                                    break;
                                                ////=========================================== VILLAGERS COMPLAINS CLOSED =====================================================================
                                                
                                                
                                                
                                                ////============================================== 4 COTTAGE MANAGEMENT ==========================================================================
                                                
                                                   case '4':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tManage Cottages");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();

                                                        char ad_select_cottage = '~';
                                                        do
                                                        {
                                                            System.out.println("1 .Add Cottage");
                                                            System.out.println("2 .View Cottage");
                                                            System.out.println("3 .Update Cottage");
                                                            System.out.println("4 .Delete Cottage");
                                                            System.out.println("0 .Back");
                                                            System.out.print("Select An Option : ");
                                                            ad_select_cottage = sc.next().charAt(0);
                                                            switch(ad_select_cottage)
                                                            {
                                                            ////=================================== ADD COTTAGE ======================================================================
                                                            
                                                                case '1':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tAdd Cottages");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    
                                                                    System.out.print("Enter Cottage Code : ");
                                                                    String cottage_code = sc1.nextLine();

                                                                    cottage_list = cottage.listIterator();
                                                                    Boolean cottage_adding_check = false;
                                                                    while(cottage_list.hasNext())
                                                                    {
                                                                        Cottage cottage_acc = (Cottage)cottage_list.next();
                                                                        if(cottage_code.equals(cottage_acc.Cottage_Code))
                                                                        {
                                                                            System.out.println("This "+cottage_code+" is already in use :] .Try another Code :) ");
                                                                            System.out.println("____________________________________________________");
                                                                            System.out.println();
                                                                            cottage_adding_check = true;
                                                                        }
                                                                    }

                                                                    if(cottage_adding_check == false)
                                                                    {
                                                                        System.out.print("Enter Cottage type : " );
                                                                        String cottage_type = sc1.nextLine();

                                                                        System.out.print("Enter Cottage Price : ");
                                                                        String cottage_pirce1 = sc1.nextLine();
                                                                        int cottage_pirce = Int_Check(cottage_pirce1);
                                                                        if(cottage_pirce==0)
                                                                        {
                                                                            System.out.println("Please Try Again");
                                                                        }
                                                                        else
                                                                        {
                                                                        cottage.add(new Cottage(cottage_code, cottage_type, cottage_pirce));
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file2));
                                                                        oos.writeObject(cottage);
                                                                        oos.close();
                                                                        System.out.println("Cottage Successfully Added :)");
                                                                        }
                                                                    }    
                                                                break;
                                                            
                                                            
                                                            ////============================== ADD COTTAGE CLOSED ====================================================================


                                                            ////================================== VIEW COTTAGE ======================================================================
                                                                case '2':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tView Cottages");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                char ad_views_cottages = '~';
                                                                do
                                                                {
                                                                    if(file2.isFile())
                                                                    {
                                                                        cottage_list = cottage.listIterator();
                                                                        int i = 1;
                                                                        while(cottage_list.hasNext())
                                                                        {
                                                                            System.out.println(i+". "+cottage_list.next());
                                                                            i++;
                                                                        }
                                                                        System.out.print("Back To Main Menu (Press 0) : ");
                                                                        ad_views_cottages = sc.next().charAt(0);
                                                                        switch(ad_views_cottages)
                                                                        {

                                                                        }
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Oops!!! Nothing Found :( ");
                                                                    }
                                                                }while(ad_views_cottages!='0');


                                                                break;
                                                            ////=============================== VIEW COTTAGE CLOSED ===================================================================
                                                            ////=============================== UPDATE COTTAGE ========================================================================

                                                            case '3':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tUpdate Cottages");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.print("Enter Cottage Code : ");
                                                                String cottage_update_code = sc1.nextLine();

                                                                cottage_list = cottage.listIterator();
                                                                Boolean cottage_update_check = false;
                                                                while(cottage_list.hasNext())
                                                                {
                                                                    Cottage cottage_acc = (Cottage)cottage_list.next();
                                                                    if(cottage_update_code.equals(cottage_acc.Cottage_Code))
                                                                    {
                                                                        System.out.print("Enter New Cottage Type : ");
                                                                        String new_cottage_type = sc1.nextLine();

                                                                        System.out.print("Enter New Cottage Price : ");
                                                                        int new_cottage_price = sc.nextInt();

                                                                        cottage_list.set(new Cottage(cottage_update_code, new_cottage_type, new_cottage_price));
                                                                        cottage_update_check = true ;
                                                                    }
                                                                }
                                                                if(cottage_update_check == true)
                                                                {
                                                                    oos = new ObjectOutputStream(new FileOutputStream(file2));
                                                                    oos.writeObject(cottage);
                                                                    oos.close();
                                                                    System.out.println("Cottage Successfully Updated :)");
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Wrong Cottage Number :{ ");
                                                                }
                                                           
                                                           
                                                           break;
                                                            ////=============================== UPDATE COTTAGE CLOSED ===================================================================
                                                            
                                                            
                                                            ////=============================== DELETE COTTAGE ========================================================================

                                                               case '4':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tDelete Cottages");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.print("Enter Cottage Code : ");
                                                                String cottage_delete_code = sc1.nextLine();

                                                                cottage_list = cottage.listIterator();
                                                                Boolean cottage_delete_check = false;
                                                                while(cottage_list.hasNext())
                                                                {
                                                                    Cottage cottage_acc = (Cottage)cottage_list.next();
                                                                    if(cottage_delete_code.equals(cottage_acc.Cottage_Code))
                                                                    {
                                                                        cottage_list.remove();
                                                                        cottage_delete_check = true ;
                                                                    }
                                                                }
                                                                if(cottage_delete_check == true)
                                                                {
                                                                    oos = new ObjectOutputStream(new FileOutputStream(file2));
                                                                    oos.writeObject(cottage);
                                                                    oos.close();
                                                                    System.out.println("Cottage Successfully Deleted :)");
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Wrong Cottage Number :{ ");
                                                                }
                                                               
                                                               
                                                               break;

                                                            ////=============================== DELETE COTTAGE CLOSED =================================================================

                                                            }
                                                        }while(ad_select_cottage!='0');
                                                       
                                                   break;
                                
                                                
                                                
                                                ////=========================================== COTTAGE MANAGEMENT CLOSED ======================================================================

                                                ////=========================================== NEWSPAPER MANAGEMENT ============================================================================

                                                    case '5':
                                                        
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tManage Newpaper");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        char ad_choice_newspaper = '~';
                                                        do{

                                                            System.out.println("1 .Add Newspaper");
                                                            System.out.println("2 .View Newspaper");
                                                            System.out.println("3 .Update Newspaper");
                                                            System.out.println("4 .Delete Newspaper");
                                                            System.out.println("0 .Back");
                                                            System.out.print("Select An Option : ");
                                                            ad_choice_newspaper = sc.next().charAt(0);
                                                            switch(ad_choice_newspaper)
                                                            {
                                                               //================================================== AMDIN ADD NEWSPAPER ================================================== 
                                                                case '1':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tAdd Newspaper");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                        
                                                                    System.out.print("Enter Newaper Name : ");
                                                                    String newspaper_name = sc1.nextLine();

                                                                    newspaper_list=newspaper.listIterator();
                                                                    Boolean newspaper_adding_check = false;
                                                                    while(newspaper_list.hasNext())
                                                                    {
                                                                        Newspaper newspaper_acc = (Newspaper)newspaper_list.next();
                                                                        if(newspaper_name.equals(newspaper_acc.Newspaper_Name))
                                                                        {
                                                                            System.out.println("This name is already in use :| ");
                                                                            newspaper_adding_check=true;
                                                                        }
                                                                    }

                                                                    if(newspaper_adding_check == false)
                                                                    {
                                                                        System.out.print("Enter Newspaper Type :");
                                                                        String newspaper_type = sc1.nextLine();

                                                                        System.out.print("Enter Newspaper Price : ");
                                                                        String newspaper_price1 = sc1.nextLine();
                                                                        int newspaper_price = Int_Check(newspaper_price1);

                                                                        if(newspaper_price==0)
                                                                        {
                                                                            System.out.println("Please Try Again ");
                                                                            System.out.println();
                                                                        }
                                                                        else
                                                                        {
                                                                            newspaper.add(new Newspaper(newspaper_name, newspaper_type, newspaper_price));
                                                                            oos = new ObjectOutputStream(new FileOutputStream(file3));
                                                                            oos.writeObject(newspaper);
                                                                            oos.close();
                                                                            System.out.println("Newspaper Successfully Added :) ");
                                                                        }

                                                                    }


                                                                break;
                                                                //================================================== ADMIN ADD NEWSPAPER CLOSED ==================================================


                                                                //================================================== ADMIN VIEWS NEWSPAPER CLOSED ================================================

                                                                case '2':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tView Cottages");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    char ad_views_newspaper = '~';
                                                                    do
                                                                    {
                                                                        if(file3.isFile())
                                                                        {
                                                                            newspaper_list = newspaper.listIterator();
                                                                            int i = 1;
                                                                            while(newspaper_list.hasNext())
                                                                            {
                                                                                System.out.println(i+". "+newspaper_list.next());
                                                                                i++;
                                                                            }
                                                                            System.out.print("Back To Main Menu (Press 0) : ");
                                                                            ad_views_newspaper = sc.next().charAt(0);
                                                                            switch(ad_views_newspaper)
                                                                            {

                                                                            }
                                                                        }
                                                                        else 
                                                                        {
                                                                            System.out.println("File Not Found :( ");
                                                                        }


                                                                    }while(ad_views_newspaper != '0');
                                                                    
                                                                break;


                                                                //====================================================== ADMIN VIEWS NEWSPAPER CLOSED ===================================================
                                                                

                                                                //====================================================== ADMIN UPDATES NEWSPAPER ========================================================
                                                                case '3':
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tUpdate Cottages");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.print("Enter Newspaper Name : ");
                                                                    String newspaper_update_name = sc1.nextLine();
                                                                    
                                                                    Boolean newspaper_update_check = false;
                                                                    newspaper_list=newspaper.listIterator();
                                                                    while(newspaper_list.hasNext())
                                                                    {
                                                                        Newspaper newspaper_acc = (Newspaper)newspaper_list.next();
                                                                        if(newspaper_update_name.equals(newspaper_acc.Newspaper_Name))
                                                                        {
                                                                            System.out.print("Enter New Newspaper Type : ");
                                                                            String new_newspaper_type = sc1.nextLine();

                                                                            System.out.print("Enter New Newspaper Price : ");
                                                                            int new_newspaper_price = sc.nextInt();

                                                                            newspaper_list.set(new Newspaper(newspaper_update_name, new_newspaper_type, new_newspaper_price));
                                                                            newspaper_update_check = true;
                                                                        }
                                                                    }
                                                                    if(newspaper_update_check == true)
                                                                    {
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file3));
                                                                        oos.writeObject(newspaper);
                                                                        oos.close();
                                                                        System.out.println("Newspaper Successfully Updated :)");
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Wrong Newspaper Name :{");
                                                                    }

                                                        
                                                                
                                                                break; 
                                                                //====================================================== ADMIN UPDATES NEWSPAPER CLOSED===================================================

                                                                //====================================================== ADMIN DELETES NEWSPAPER==========================================================

                                                                case '4':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tDelete Newspaper");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                
                                                                System.out.print("Enter Newspaper Name : ");
                                                                String newspaper_delete = sc1.nextLine();

                                                                newspaper_list = newspaper.listIterator();
                                                                Boolean newspaper_delete_check = false;
                                                                while(newspaper_list.hasNext())
                                                                {
                                                                    Newspaper newspaper_acc = (Newspaper)newspaper_list.next();
                                                                    if(newspaper_delete.equals(newspaper_acc.Newspaper_Name))
                                                                    {
                                                                        newspaper_list.remove();
                                                                        newspaper_delete_check = true;

                                                                    }
                                                                }
                                                                if(newspaper_delete_check == true)
                                                                {
                                                                    oos = new ObjectOutputStream(new FileOutputStream(file3));
                                                                    oos.writeObject(newspaper);
                                                                    oos.close();
                                                                    System.out.println("Newspaper Successfully Deleted :) ");
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Wrong Newspaper Name :{ ");
                                                                }


                                                                break;


                                                                //===================================================ADMIN DELETES NEWSPAPER CLOSED=======================================================


                                                            }
                                                            

                                                        }while(ad_choice_newspaper != '0'); 


                                                    break;



                                                ////=========================================== NEWSPAPER MANAGEMENT CLOSED ======================================================================
                                                ////=========================================== BUS TICKET MANAGEMENT ============================================================================
                                                     case '6':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tManage Bus Ticket");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        char bus_choice = '~';
                                                        do
                                                        {
                                                            System.out.println("1 .Add Bus Ticket");
                                                            System.out.println("2 .View Bus Ticket");
                                                            System.out.println("3 .Update Bus Ticket");
                                                            System.out.println("4 .Delete Bus Ticket");
                                                            System.out.println("0 .Back");
                                                            System.out.print("Select An Option : ");
                                                            bus_choice = sc.next().charAt(0);
                                                            switch(bus_choice)
                                                            {
                                                                ///============================================== ADDING BUS TICKET ===============================================================

                                                                case '1':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tAdd Bus Ticket");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();

                                                                    System.out.print("Enter Bus Ticket Code : ");
                                                                    String ticket_code = sc1.nextLine();

                                                                    Boolean ad_checking_bus_ticke = false;
                                                                    bus_list = bus.listIterator();
                                                                    while(bus_list.hasNext())
                                                                    {
                                                                        Bus_Ticket bus_acc = (Bus_Ticket)bus_list.next();
                                                                        if(ticket_code.equals(bus_acc.Ticket_Code))
                                                                        {
                                                                            System.out.println("This Tciket Is Already In Use ");
                                                                            ad_checking_bus_ticke = true;
                                                                        }
                                                                    }
                                                                    if(ad_checking_bus_ticke == false)
                                                                    {
                                                                        System.out.print("Enter Destination : ");
                                                                        String destination = sc1.nextLine();

                                                                        System.out.print("Enter Date And Time : ");
                                                                        String date_and_time = sc1.nextLine();

                                                                        System.out.print("Enter Ticket Price : ");
                                                                        String ticket_price1 = sc1.nextLine();
                                                                        int ticket_price= Int_Check(ticket_price1);
                                                                        if(ticket_price == 0)
                                                                        {
                                                                            System.out.println("Please Try Again!!! ");
                                                                            System.out.println();
                                                                        }

                                                                        else
                                                                        {
                                                                            bus.add(new Bus_Ticket(ticket_code, destination, date_and_time, ticket_price));

                                                                            oos = new ObjectOutputStream(new FileOutputStream(file4));
                                                                            oos.writeObject(bus);
                                                                            oos.close();
                                                                            System.out.println("Bus Ticket Successfully Added :) ");
                                                                        }
                                                                    }
                                                                        
                                                                break;
                                                                ///======================================== ADDING BUS TICKET CLOSED================================================================
                                                                
                                                                ///======================================= VIEWING BUS TICKET ======================================================================
                                                                case '2':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tViewing Bus Tickets");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    if(file4.isFile())
                                                                    {
                                                                        char view_bus_tickets = '~';
                                                                        do{
                                                                            bus_list = bus.listIterator();
                                                                            int i = 1;
                                                                            while(bus_list.hasNext())
                                                                            {
                                                                                System.out.println(i+". "+bus_list.next());
                                                                                i++;

                                                                            }

                                                                            System.out.println();
                                                                            System.out.print("Back To Main Menu (Press 0) : ");
                                                                            view_bus_tickets = sc.next().charAt(0);
                                                                            switch(view_bus_tickets)
                                                                            {

                                                                            }

                                                                        }while(view_bus_tickets != '0');
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Oops!!! Nothing Found :( ");
                                                                    }
                                                                    
                                                                break;
                                                                ///======================================= VIEWING BUS TICKET CLOSED================================================================

                                                                ///======================================= UPDATING BUS TICKET =====================================================================

                                                                case '3':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tUpdate Bus Tickets");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    if(file4.isFile())
                                                                    {
                                                                        System.out.print("Enter Tcket Code : ");
                                                                        String ticket_code_update = sc1.nextLine();

                                                                        bus_list = bus.listIterator();
                                                                        Boolean update_check = false;
                                                                        while(bus_list.hasNext())
                                                                        {
                                                                            Bus_Ticket ticket_acc = (Bus_Ticket)bus_list.next();
                                                                            if(ticket_code_update.equals(ticket_acc.Ticket_Code))
                                                                            {
                                                                                System.out.print("Enter New Destination : ");
                                                                                String new_destination = sc1.nextLine();

                                                                                System.out.print("Enter New Date And Time : ");
                                                                                String new_date_and_time = sc1.nextLine();

                                                                                System.out.print("Enter New Price : ");
                                                                                int new_ticket_price = sc.nextInt();

                                                                                bus_list.set(new Bus_Ticket(ticket_code_update, new_destination, new_date_and_time, new_ticket_price));
                                                                                update_check = true;

                                                                                oos = new ObjectOutputStream(new FileOutputStream(file4));
                                                                                oos.writeObject(bus);
                                                                                oos.close();
                                                                                System.out.println("Bus Ticke Successfully Updated :) ");
                                                                            } 
                                                                        }
                                                                        if(update_check == false)
                                                                        {
                                                                            System.out.println("Invalid Ticket Number !!! ");
                                                                        }
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Oops!!! Nothing Found :( ");
                                                                    }
                                                                break;

                                                                ///======================================= UPDATING BUS TICKET CLOSED===============================================================
                                                                
                                                                ///======================================= DELETING BUS TICKET =====================================================================
                                                                case '4':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tDelete Bus Ticket");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                if(file4.isFile())
                                                                {
                                                                    System.out.print("Enter Ticket Code : ");
                                                                    String delete_ticket_code = sc1.nextLine();
                                                                    
                                                                    bus_list = bus.listIterator();
                                                                    Boolean ticke_delete_check = false;
                                                                    while(bus_list.hasNext())
                                                                    {
                                                                        Bus_Ticket ticket_acc = (Bus_Ticket)bus_list.next();
                                                                        if(delete_ticket_code.equals(ticket_acc.Ticket_Code))
                                                                        {
                                                                            bus_list.remove();
                                                                            System.out.println("Ticket Successfully Deleted :) ");
                                                                            ticke_delete_check = true;
                                                                        }
                                                                    }
                                                                    if(ticke_delete_check == false)
                                                                    {
                                                                        System.out.println("Invalid Ticket Code :{ ");
                                                                    }

                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Oops!!! Nothing Found :(");
                                                                }

                                                                break;
                                                                ///======================================= DELETING BUS TICKET CLOSED===============================================================
                                                                
                                                            }


                                                        }while(bus_choice !='0');



                                                     break;
                                                ////=========================================== BUS TICKET MANAGEMENT CLOSED =====================================================================
                                                
                                                    
                                                ////========================================================== TRNSPORTATION MANAGEMENT =====================================================================

                                                     case '7':
                                                     System.out.print("\033[H\033[2J");
                                                     System.out.println("____________________________________________________");
                                                     System.out.println();
                                                     System.out.println("\t\tTransportation Managements");
                                                     System.out.println("____________________________________________________");
                                                     System.out.println();

                                                     char ad_choice_vehicle = '~';

                                                     do{
                                                        System.out.println("1 .Add Vehicle ");
                                                        System.out.println("2 .View Vehicles ");
                                                        System.out.println("3 .Update Vehicle ");
                                                        System.out.println("4 .Delete Vehicle ");
                                                        System.out.println("0 .Back ");
                                                        System.out.print("Select An Option : ");
                                                        ad_choice_vehicle = sc.next().charAt(0);

                                                        switch(ad_choice_vehicle)
                                                        {
                                                            ////=========================================== ADD TRNSPORTATION ========================================================================
                                                            case '1':
                                                                int n = -1;
                                                                do
                                                                {
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tAdd Vehicle");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.print("Enter Vehicle Code : ");
                                                                    String Vehicle_Code = sc1.nextLine();

                                                                    System.out.print("Enter Vehicle Type : ");
                                                                    String Vehicle_Type = sc1.nextLine();

                                                                    System.out.print("Enter Vehicle Number : ");
                                                                    String Vehicle_Number = sc1.nextLine();

                                                                    System.out.print("Enter Vehicle Model : ");
                                                                    String Vehicle_Model = sc1.nextLine();

                                                                    System.out.print("Enter Driver Name : ");
                                                                    String Dirver_Name = sc1.nextLine();

                                                                    System.out.print("Enter Driver Number : ");
                                                                    String Dirver_Number = sc1.nextLine();

                                                                    System.out.print("Rent Cost Per Day : ");
                                                                    String Rent_Cost1 = sc1.nextLine();
                                                                    int Rent_Cost = Int_Check(Rent_Cost1);

                                                                    Boolean Rent_Cost_Checking = true;

                                                                    if(Rent_Cost == 0)
                                                                    {
                                                                        System.out.println();
                                                                        System.out.println("Invalid Rent Cost!!!\nPlease Try Again!!!");
                                                                        System.out.println();
                                                                        Rent_Cost_Checking = false;

                                                                        
                                                                    }
                                                                    else 
                                                                    {
                                                                        vehicle_list = vehicle.listIterator();
                                                                        Boolean vehicle_existance_checking = false;
                                                                        while(vehicle_list.hasNext())
                                                                        {
                                                                            Transportation vehicle_acc = (Transportation)vehicle_list.next();
                                                                            if(Vehicle_Code.equals(vehicle_acc.Vehicle_Code) ||  Vehicle_Number.equals(vehicle_acc.Vehicle_Number) || Dirver_Number.equals(vehicle_acc.Driver_Number))
                                                                            {
                                                                                vehicle_existance_checking = true;
                                                                            }
                                                                        }

                                                                        if(vehicle_existance_checking == false ||  Rent_Cost_Checking == true)
                                                                        {
                                                                            vehicle.add(new Transportation(Vehicle_Code, Vehicle_Type, Vehicle_Number, Vehicle_Model, Dirver_Name, Dirver_Number, Rent_Cost));
                                                                            oos = new ObjectOutputStream(new FileOutputStream(file5));
                                                                            oos.writeObject(vehicle);
                                                                            oos.close();
                                                                            System.out.println();
                                                                            System.out.println(" Registration Successfully Completd :) ");
                                                                            System.out.println();
                                                                        }
                                                                        else
                                                                        {
                                                                            System.out.println();
                                                                            System.out.println("This Vehicle Is Already Registerd :| ");
                                                                            System.out.println();
                                                                        }
                                                                    }
                                                                    System.out.print("Back To Main Menu (Press 0) :");
                                                                    n = sc.nextInt();
                                                                }while(n!=0);





                                                            break;
                                                            ////=========================================== ADD TRNSPORTATION CLOSED========================================================================

                                                            ////=========================================== VIEW TRNSPORTATION ========================================================================
                                                            case '2':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tView Vehicle");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                if(file5.isFile())
                                                                {
                                                                    int x = -1;
                                                                    do{
                                                                        vehicle_list = vehicle.listIterator();
                                                                        int i = 1;
                                                                        while(vehicle_list.hasNext())
                                                                        {
                                                                            System.out.println(i+". "+vehicle_list.next());
                                                                            i++;
                                                                        }
                                                                        
                                                                        System.out.print("Back To Main Menu (Press 0): ");
                                                                        x = sc.nextInt();
                                                                    }while(x!=0);
                                                                }

                                                            break;
                                                            ////=========================================== VIEW TRNSPORTATION CLOSED ========================================================================

                                                            ////=========================================== UPDATE TRNSPORTATION ========================================================================
                                                            case '3':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tUpdate Vehicle");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                if(file5.isFile())
                                                                {
                                                                    System.out.print("Enter Vehicle Code : ");
                                                                    String new_vehicle_code = sc1.nextLine();

                                                                    System.out.print("Enter New Vehicle Number : ");
                                                                    String new_vehicle_number = sc1.nextLine();

                                                                    vehicle_list = vehicle.listIterator();
                                                                    Boolean vehicle_update_checking = false;
                                                                    while(vehicle_list.hasNext())
                                                                    {
                                                                        Transportation vehicle_acc = (Transportation)vehicle_list.next();
                                                                        if(new_vehicle_code.equals(vehicle_acc.Vehicle_Code))
                                                                        {
                                                                            
                                                                            System.out.print("Enter New Vehicle Type : ");
                                                                            String new_vehicle_type = sc1.nextLine();

                                                                            System.out.print("Enter New Vehicle Model : ");
                                                                            String new_vehicle_model = sc1.nextLine();

                                                                            System.out.print("Enter New Driver Name : ");
                                                                            String new_driver_name = sc1.nextLine();

                                                                            System.out.print("Enter New Driver Number  : ");
                                                                            String new_driver_number = sc1.nextLine();

                                                                            System.out.print("Enter New Rent Cost  : ");
                                                                            String new_rent_cost1 =sc1.nextLine();
                                                                            int new_rent_cost = Int_Check(new_rent_cost1);

                                                                            if(new_rent_cost == 0)
                                                                            {
                                                                                System.out.println("Invalid Rent Cost!!!\nPlease Try Again :)");
                                                                            }
                                                                            else{
                                                                                vehicle_list.set(new Transportation(new_vehicle_code, new_vehicle_type, new_vehicle_number, new_vehicle_model, new_driver_name, new_driver_number, new_rent_cost));  
                                                                            }
                                                                            vehicle_update_checking = true;
                                                                        }
                                                                    }
                                                                    if(vehicle_update_checking==true)
                                                                    {
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file5));
                                                                        oos.writeObject(vehicle);
                                                                        oos.close();
                                                                        System.out.println("Vehicle Information Successfully Updated");
                                                                        System.out.println();
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println();
                                                                        System.out.println("Wrong Vehicle Code :{ ");
                                                                        System.out.println();
                                                                    }
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Oops!!! Nothing Found :(");
                                                                }

                                                            break;
                                                            ////=========================================== UPDATE TRNSPORTATION CLOSED========================================================================

                                                            ////=========================================== DELETE TRNSPORTATION ========================================================================
                                                            case '4':
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tDelete Vehicle");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                            
                                                                System.out.print("\033[H\033[2J");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                System.out.println("\t\tUpdate Vehicle");
                                                                System.out.println("____________________________________________________");
                                                                System.out.println();
                                                                if(file5.isFile())
                                                                {
                                                                    System.out.print("Enter Vehicle Code : ");
                                                                    String new_vehicle_code = sc1.nextLine();

                                                                    vehicle_list = vehicle.listIterator();
                                                                    Boolean vehicle_update_checking = false;
                                                                    while(vehicle_list.hasNext())
                                                                    {
                                                                        Transportation vehicle_acc = (Transportation)vehicle_list.next();
                                                                        if(new_vehicle_code.equals(vehicle_acc.Vehicle_Code))
                                                                        {
                                                                            vehicle_list.remove();
                                                                            vehicle_update_checking = true;
                                                                        }
                                                                    }
                                                                    if(vehicle_update_checking==true)
                                                                    {
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file5));
                                                                        oos.writeObject(vehicle);
                                                                        oos.close();
                                                                        System.out.println("Vehicle Information Successfully Removed");
                                                                        System.out.println();
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println();
                                                                        System.out.println("Wrong Vehicle Code :{ ");
                                                                        System.out.println();
                                                                    }
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Oops!!! Nothing Found :(");
                                                                }

                                                            break;
                                                            ////=========================================== DELETE TRNSPORTATION CLOSED ========================================================================
                                                            
                                                        }


                                                     }while(ad_choice_vehicle != '0');

                                                     break;

                                                ////========================================================== TRNSPORTATION MANAGEMENT CLOSED =====================================================================   
                                                ////========================================================== SHOPING MANAGEMENT =====================================================================   
              
                                                     case '8':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tShoping Management");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();

                                                        char ad_select_shops = '~';

                                                        do{

                                                            System.out.println("1 .Add Product ");
                                                            System.out.println("2 .View Products");
                                                            System.out.println("3 .Update Products");
                                                            System.out.println("4 .Delete Product");
                                                            System.out.println("0 .Back");
                                                            System.out.print("Select An Option : ");

                                                            ad_select_shops = sc.next().charAt(0);

                                                            switch(ad_select_shops)
                                                            {
                                                            ////========================================================== ADD PRODUCT ===================================================================== 
                                                                case '1':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tAdd Product");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();

                                                                    System.out.print("Enter Product Code : ");
                                                                    String product_code = sc1.nextLine();

                                                                    product_list = product.listIterator();
                                                                    Boolean product_existance_check = false;
                                                                    //Boolean product_price_check = false;

                                                                    while(product_list.hasNext())
                                                                    {
                                                                        Shop shop_acc = (Shop)product_list.next();
                                                                        if(product_code.equals(shop_acc.Product_Code))
                                                                        {
                                        
                                                                            System.out.println("This Product Code Is Already In Use :{ ");
                                                                            product_existance_check = true;

                                                                        }
                                                                    }

                                                                    if(product_existance_check == false)
                                                                    {
                                                                        System.out.print("Enter Type  : ");
                                                                        String product_type = sc1.nextLine();


                                                                        System.out.print("Enter Name : ");
                                                                        String product_name = sc1.nextLine();


                                                                        System.out.print("Enter Quantity : ");
                                                                        String product_quantity = sc1.nextLine();


                                                                        System.out.print("Product Price : ");
                                                                        String product_price1 = sc1.nextLine();
                                                                        int product_price = Int_Check(product_price1);

                                                                        
                                                                        if(product_price==0)
                                                                        {
                                                                            System.out.println("Please Try Again !!! ");
                                                                            //product_price_check = true;

                                                                        }

                                                                        else 
                                                                        {
                                                                            product.add(new Shop(product_code, product_type, product_name, product_quantity, product_price));
                                                                            oos = new ObjectOutputStream(new FileOutputStream(file6));
                                                                            oos.writeObject(product);
                                                                            oos.close();
                                                                            System.out.println();
                                                                            System.out.println("Product Entry Successfull :) ");
                                                                        }
                                                    
                                                                        
                                                                    } 
                                                                    
                                                                    break;
                                                            ////====================================================== ADD PRODUCT  CLOSED===================================================================== 
                                                            
                                                            
                                                            ////========================================================== VIEW PRODUCT ===================================================================== 
                                                                case '2':
                                                                if(file6.isFile())
                                                                {
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tView Product");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    product_list = product.listIterator();
                                                                    char product_view_check = '~';
                                                                    do
                                                                    {
                                                                    int i = 1;
                                                                    while(product_list.hasNext())
                                                                    {
                                                                        System.out.println(i+". "+product_list.next());
                                                                        i++;
                                                                    }

                                                                    System.out.println();
                                                                    System.out.print("Back To Main Menu (Press 0 ) : ");
                                                                    product_view_check = sc.next().charAt(0);
                                                                    switch(product_view_check)
                                                                    {

                                                                    }
                                                                    }while(product_view_check!='0');
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Oops!!! Nothing Found :( ");
                                                                }
                                                                
                                                                break;
                                                            ////======================================================VIEW PRODUCT CLOSED ===================================================================== 
                                                            
                                                            
                                                            ////========================================================== UPDATE PRODUCT ===================================================================== 
                                                                case '3':
                                                                if(file6.isFile())
                                                                {
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tUpdate Product");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();

                                                                    System.out.print("Enter Product Code : ");
                                                                    String update_prodcut_code = sc1.nextLine();

                                                                    product_list = product.listIterator();
                                                                    Boolean prodcut_update_check = false;
                                                                    Boolean product_price_check = false;

                                                                    while(product_list.hasNext())
                                                                    {
                                                                        Shop shop_acc = (Shop)product_list.next();
                                                                        {
                                                                            if(update_prodcut_code.equals(shop_acc.Product_Code))
                                                                            {
                                                                                System.out.print("Enter New Product Type : ");
                                                                                String new_product_type = sc1.nextLine();

                                                                                System.out.print("Enter New Product Name : ");
                                                                                String new_product_name = sc1.nextLine();

                                                                                System.out.print("Enter New Product Quantity : ");
                                                                                String new_product_quantity = sc1.nextLine();

                                                                                System.out.print("Enter New Product Price : ");
                                                                                String new_product_price1 = sc1.nextLine();
                                                                                int new_prodcut_price = Int_Check(new_product_price1);

                                                                                if(new_prodcut_price == 0)
                                                                                {
                                                                                    System.out.println("Try Again");
                                                                                    product_price_check = true;
                                                                                }

                                                                                else 
                                                                                {
                                                                                    product_list.set(new Shop(update_prodcut_code, new_product_type, new_product_name, new_product_quantity,new_prodcut_price));
                                                                                    
                                                                                }


                                                                                prodcut_update_check = true;
                                                                            }
                                                                            
                                                                            
                                                                        }
                                                                    }
                                                                    if(prodcut_update_check == true && product_price_check == false)
                                                                    {
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file6));
                                                                        oos.writeObject(product);
                                                                        oos.close();
                                                                        System.out.println("Prodcut Successfully Updated :)");
                                                                        System.out.println();
                                                                    }
                                                                    else if(prodcut_update_check == false) 
                                                                    {
                                                                        System.out.println("Wrong Product Code :( ");
                                                                    }
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Oops!!! Nothing Found :( ");
                                                                }

                                  

                                                                break;
                                                            ////======================================================UPDATE PRODUCT CLOSED ===================================================================== 
                                                            
                                                            
                                                            ////========================================================== DELETE PRODUCT ===================================================================== 
                                                                case '4':
                                                                if(file6.isFile())
                                                                {
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tDelete Product");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    
                                                                    System.out.print("Enter Product Code : ");
                                                                    String delete_product_code = sc1.nextLine();

                                                                    product_list = product.listIterator();
                                                                    Boolean product_delete_check = false;
                                                                    while(product_list.hasNext())
                                                                    {
                                                                        Shop shop_acc = (Shop)product_list.next();
                                                                        if(delete_product_code.equals(shop_acc.Product_Code))
                                                                        {
                                                                            product_list.remove();
                                                                            product_delete_check = true;

                                                                        }

                                                                    }
                                                                    if(product_delete_check == true)
                                                                    {
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file6));
                                                                        oos.writeObject(product);
                                                                        oos.close();
                                                                        System.out.println();
                                                                        System.out.println("Prodcut Successfully Deleted :)");
                                                                        System.out.println();
                                                                    }

                                                                    else 
                                                                    {
                                                                        System.out.println();
                                                                        System.out.println("Wrong Product Code :| ");
                                                                        System.out.println();
                                                                    }
                                                                }
                                                                else 
                                                                {
                                                                    System.out.println("Oops!!! Nothing Found :( ");
                                                                }

                                                                break;
                                                            ////======================================================= DELETE PRODUCT CLOSED ===================================================================== 
                                                                
                                                            }

                                                        }while(ad_select_shops!= '0');
                                                    break;
                                                ////========================================================== SHOPING MANAGEMENT CLOSED =====================================================================


                                                ////============================================== 9.ADMIN ACCOUNT SETTINGS ===================================================================
                                                    case '9':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tAdmin Account Settings");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();

                                                        char ad_acc_settings_choice = '~';
                                                        do
                                                        {
                                                            System.out.println("1 .View Admin Accounts ");
                                                            System.out.println("2 .Change Email And Password");
                                                            System.out.println("3 .Delete Admin Account");
                                                            System.out.println("0 .Back");
                                                            System.out.print("Select An Option : ");
                                                            ad_acc_settings_choice = sc.next().charAt(0);
                                                            switch(ad_acc_settings_choice)
                                                            {
                                                                //============================================== 9.1 VIEW ADMIN ACCOUNTS ============================================
                                                                case '1':
                                                                    System.out.print("\033[H\033[2J");
                                                                    admin_list = admin.listIterator();
                                                                    System.out.println("______________________________________________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\t\t\tAdmin Accounts");
                                                                    System.out.println("______________________________________________________________________________________");
                                                                    System.out.println("______________________________________________________________________________________");
                                                                    System.out.println();
                                                                    int i = 1;
                                                                    while(admin_list.hasNext())
                                                                        {
                                                                            System.out.println(i+". "+admin_list.next());
                                                                            i++;
                                                                        }
                                                               
                                                                break;
                                                                
                                                                //============================================== 9.2 ADMIN ACCOUNTS UPDATE ==========================================
                                                                case '2':
                                                                    System.out.print("\033[H\033[2J");
                                                                    
                                                                    System.out.println("___________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\tChange Email And Password");
                                                                    System.out.println("___________________________________________");
                                                                    
                                                                    System.out.print("Enter Username : ");
                                                                    String admin_user_name = sc1.nextLine();
                                                                    admin_list = admin.listIterator();
                                                                    Boolean ad_check=false;
                                                                    
                                                                    while(admin_list.hasNext())
                                                                    {
                                                                        Admin a_new = (Admin)admin_list.next();
                                                                        if(admin_user_name.equals(a_new.id))
                                                                        {
                                                                            
                                                                            System.out.print("Enter New Name : ");
                                                                            String ad_new_name =sc1.nextLine();

                                                                            System.out.print("Enter New Nid Number : ");
                                                                            String ad_new_nid = sc1.nextLine();
                                                                            
                                                                            System.out.print("Enter New Email : ");
                                                                            String ad_new_email = sc1.nextLine();

                                                                            System.out.print("Enter New Password : ");
                                                                            String ad_new_password = sc1.nextLine();

                                                                            admin_list.set(new Admin(ad_new_name, ad_new_nid, admin_user_name, ad_new_email, ad_new_password));
                                                                            ad_check =true;

                                                                        }

                                                                    }
                                                                    if(ad_check==true)
                                                                        {
                                                                            oos = new ObjectOutputStream(new FileOutputStream(file));
                                                                            oos.writeObject(admin);
                                                                            oos.close();
                                                                            System.out.println("Update Successfully Completed :)");
                                                                        }
                                                                        else
                                                                        {
                                                                            System.out.println("No User Found :(");
                                                                        }
                                                                    break;
                                                                
                                                                //============================================== 9.3 DELETE ADMIN ACCOUNTS ==========================================
                                                                case '3':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tDelete Admin Account");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.print("Enter Username: ");
                                                                    
                                                                    String ad_delete_user_name = sc1.nextLine();
                                                                    admin_list = admin.listIterator();

                                                                    Boolean found = false;
                                                                    while(admin_list.hasNext())
                                                                    {
                                                                        Admin ad_delete = (Admin)admin_list.next();
                                                                        if(ad_delete_user_name.equals(ad_delete.id))
                                                                        {
                                                                            admin_list.remove();
                                                                            found =true;
                                                                        }
                                                                    }
                                                                    if(found)
                                                                    {                                      
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file));
                                                                        oos.writeObject(admin);
                                                                        oos.close();
                                                                        System.out.println("Account Deleted Successfully :) ");
                                                                        System.out.println();
                                                                    }
                                                                    else{
                                                                        System.out.println("Account Not Found :| ");
                                                                        System.out.println();
                                                                    }
                                                                    break;
                                                            }

                                                            
                                                        }while(ad_acc_settings_choice!='0');
                                                    break;
                                                ////============================================== 9.0 ADMIN ACCOUNT SETTINGS CLOSED===========================================================
                                                        


                                                }

                                            }while(ad_choice2!='0');

                                            check = true;
                                        }
                                    }
                                    if(!check)
                                    {
                                        System.out.println("Wrong User ID And Password :(");
                                        System.out.println("");
                                    }
                                }
                                else 
                                {
                                    System.out.println("Oops!!! Nothing Found :(");
                                }
                                break;
                        }
                    }while(ad_choice1!='0');
                    break;
                //============================================== ADMIN LOGIN CLOSED =================================================================    

                

                
                //============================================================================ USERS PAGE ==================================================================================================
                    case '2':
                    char user_choice = '~';
                    do{

                        System.out.print("\033[H\033[2J");
                        System.out.println("__________________________");
                        System.out.println();
                        System.out.println("\tUser Page");
                        System.out.println("__________________________");
                        System.out.println();
                        
                        System.out.println("1 .Sign UP");
                        System.out.println("2 .Login ");
                        System.out.println("0 .Exit ");
                        System.out.print("Select An Option : ");
                        user_choice = sc.next().charAt(0);

                        switch(user_choice)
                        {
                            //=================================================== USER SIGNING ================================================================ 
                            case '1':
                                System.out.print("\033[H\033[2J");
                                System.out.println("____________________________________________");
                                System.out.println();
                                System.out.println("\t\tUser Sign Up Page");
                                System.out.println("____________________________________________");
                                System.out.println();
                                char user_sign_up_holder = '~';
                                do
                                {
                                System.out.print("Enter Name : ");
                                String name = sc1.nextLine();
                                System.out.print("Enter Username : ");
                                String user_name = sc1.nextLine();
                                System.out.print("Enter Email : ");
                                String email = sc1.nextLine();
                                System.out.print("Enter Profession : ");
                                String profession = sc1.nextLine();
                                System.out.print("Enter Phone Number : ");
                                String phone = sc1.nextLine();
                                System.out.print("Enter Password : ");
                                String pass = sc1.nextLine();

                                user_list = user.listIterator();
                                Boolean user_signup_check = false;
                                while(user_list.hasNext())
                                {
                                    User user_acc = (User)user_list.next();
                                    if(user_name.equals(user_acc.User_Name) || email.equals(user_acc.Email) || phone.equals(user_acc.Phone))
                                    {
                                        user_signup_check = true;
                                    }
                                }
                                if(user_signup_check == true)
                                {
                                    System.out.println();
                                    System.out.println("You Hava Already An Account. Please Login :)");
                                    System.out.println("____________________________________________");
                                }
                                if(user_signup_check==false)
                                {
                                    user.add(new User(name, user_name, email, profession, phone, pass));
                                    oos = new ObjectOutputStream(new FileOutputStream(file_01));
                                    oos.writeObject(user);
                                    oos.close();
                                    System.out.println();
                                    System.out.println("You Have Successfully Signed Up");
                                    System.out.println("Now You Can Login From User Sign Up Page");
                                    System.out.println("____________________________________________");
                                    
                                }

                                System.out.println();

                                System.out.print("Press 1 For Another Sign Up 0 For Back : ");
                                user_sign_up_holder = sc.next().charAt(0);
                                System.out.print("____________________________________________");

                                }while(user_sign_up_holder!='0');
                                
                               
                            
                            break;
                            //=================================================== USER SIGNING CLOSED ================================================================ 
                            
                            
                            
                            
                            
                            //=================================================== USER LOGING IN ================================================================ 
                            case '2':
                                if(file_01.isFile())
                                {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("__________________________");
                                    System.out.println();
                                    System.out.println("\tUser Login");
                                    System.out.println("__________________________");
                                    System.out.println();

                                    System.out.print("Enter User Name : ");
                                    String login_username = sc1.nextLine();
                                    System.out.print("Enter Password : ");
                                    String user_pass = sc1.nextLine();

                                    Boolean login_check = false;

                                    user_list = user.listIterator();
                                    while(user_list.hasNext())
                                    {
                                        User user_login = (User)user_list.next();
                                        if(login_username.equals(user_login.User_Name) && user_pass.equals(user_login.Pass))
                                        {
                                                
                                            char user_options = '~';
                                            do{
                                                System.out.print("\033[H\033[2J");
                                                
                                                System.out.println("____________________________________");
                                                System.out.println();
                                                System.out.println("\t\tUser Page");
                                                System.out.println("____________________________________");
                                                System.out.println();
                                                System.out.println("1 .View Announcements");
                                                System.out.println("2 .Inform A Problem Or A Complain");
                                                System.out.println("3 .Cottage");
                                                System.out.println("4 .Subscribe Newspaper ");
                                                System.out.println("5 .Buy Bus Tickets");
                                                System.out.println("6 .Rent Vehicle");
                                                System.out.println("7 .Shop");
                                                System.out.println("8 .Account Settings");
                                                System.out.println("0 .Back");
                                                
                                                System.out.print("Select An Option : "); 
                                                user_options = sc.next().charAt(0);
                                                
                                                switch(user_options)
                                                {
                                                //======================================================= USER ANNOUNCEMENTS=====================================================================    
                                                    case '1':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("_________________________________________________________________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\t\t\t\tANNOUNCEMENTS");
                                                        System.out.println("_________________________________________________________________________________________________________");
                                                        System.out.println();
                                                        
                                                        if(file1.isFile())
                                                        {
                                                            char view_notice = '`';
                                                            do
                                                            {
                                                                int i = 1;
                                                                notice_list=notice.listIterator();
                                                                while(notice_list.hasNext())
                                                                {
                                                                    System.out.println(i+". "+notice_list.next());
                                                                    i++;
                                                                }
                                                                System.out.print("Back To Main Menu (Type 0) : ");
                                                                view_notice = sc.next().charAt(0);
                                                                switch(view_notice)
                                                                {
                                                                
                                                                }
                                                            }
                                                            while(view_notice != '0');
                                                        }

                                                        else
                                                        {
                                                            System.out.println("Oops!!! Nothing Found :(");
                                                        }


                                                        break;
                                                //======================================================= USER ANNOUNCEMENTS CLOSING ===================================================================== 
                                                
                                                
                                                //======================================================= USER COMPLAIN ===================================================================== 

                                                    case '2':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("__________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tMy Complains");
                                                        System.out.println("___________________________________________");
                                                        System.out.println();
                                                        char user_complain_choice = '~';
                                                        do{
                                                            System.out.println("1. Write Complain");
                                                            System.out.println("2. View Complain");
                                                            System.out.println("3. Update Complain");
                                                            System.out.println("4. Delete Complain");
                                                            System.out.println("0. Back");
                                                            System.out.print("Select An Option : ");
                                                            user_complain_choice = sc.next().charAt(0);
                                                            switch(user_complain_choice)
                                                            {
                                                            //=============================================== WRITING COMPLAIN ===================================================    
                                                                case '1':
                                                                    System.out.print("\033[H\033[2J");

                                                                    

                                                                    Boolean complain_check = false;
                                                                    user_list = user.listIterator();
                        
                                                                    while(user_list.hasNext())
                                                                    {
                                                                        User user_acc = (User)user_list.next();
                                                                       
                                                                        if(login_username.equals(user_acc.User_Name))
                                                                        {
                                                                            System.out.print("Complain Number :");
                                                                            String Number =sc1.nextLine();
                                                                            System.out.print("Write Complain : ");
                                                                            String Complain = sc1.nextLine();
                                                                            
                                                                            complain.add(new Complain(login_username, Number,Complain));
                                                                            complain_check = true;
                                                                        }
                                                                    }
                                                                    if(complain_check == true)
                                                                    {
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file_02));
                                                                        oos.writeObject(complain);
                                                                        oos.close();
                                                                    }

                                                                break;
                                                            //================================================ WRITING COMPLAIN CLOSED ================================================
                                                            
                                                            
                                                            //================================================ VIEWING COMPLAIN =======================================================
                                                                case '2':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________________________________________________");
                                                                    System.out.println("\t\t\t\t\tMy Complains");
                                                                    System.out.println("____________________________________________________________________________________________");
                                                                        
                                                                    if(file_02.isFile())
                                                                    {
                                                                        
                                                                        

                                                                        complain_list = complain.listIterator();
                                                                        int i = 1;
                                                                        while(complain_list.hasNext())
                                                                        {
                                                                            Complain user_Complain = (Complain)complain_list.next();
                                                                            if(login_username.equals(user_Complain.User_name))
                                                                           {
                                                                                System.out.println(i+". "+user_Complain);
                                                                                i++;
                                                                            }
                                                                        } 
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Oops!!! Nothing Found :(");
                                                                    }
                                                                break;
                                                            //============================================ VIEWING COMPLAIN CLOSED=====================================================


                                                            //============================================ UPDATE COMPLAIN ============================================================
                                                                case '3':
                                                                    if(file_02.isFile())
                                                                    {
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.flush();  
                                                                        System.out.println("______________________________________________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\t\t\tUpdate Complain");
                                                                        System.out.println("______________________________________________________________________________________");
                                                                        System.out.println("______________________________________________________________________________________");
                                                                        System.out.println();
                                                                        Boolean update_complain_check = false;
                                                                        
                                                                        System.out.print("Enter Complain Number : ");
                                                                        String update_number = sc1.nextLine();
                                                                        complain_list = complain.listIterator();

                                                                        while(complain_list.hasNext())
                                                                        {
                                                                            Complain user_complain= (Complain)complain_list.next();
                                                                            
                                                                           
                                                                            if(update_number.equals(user_complain.Number))
                                                                            {
                                                                                System.out.print("Update Complain : ");
                                                                                String update_Complain = sc1.nextLine();
                                                                                complain_list.set(new Complain(login_username,update_number, update_Complain));
                                                                                update_complain_check = true;
                                                                            }
                                                                        }
                                                                        if(update_complain_check == true)
                                                                        {
                                                                            oos = new ObjectOutputStream(new FileOutputStream(file_02));
                                                                            oos.writeObject(complain);
                                                                            oos.close();
                                                                            System.out.println("Complain Successfully Updated :) ");
                                                                        } 
                                                                        else 
                                                                        {
                                                                            System.out.println("Invalid Number :( ");
                                                                        }
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Oops!!! Nothing Found :(");
                                                                    }

                                                                break;

                                                            //============================================ UPDATE COMPLAIN CLOSED======================================================
                                                           
                                                            //============================================= DELETE COMPLAIN ===========================================================

                                                                case '4':
                                                                if(file_02.isFile())
                                                                    {
                                                                        System.out.print("\033[H\033[2J");
                                                                        Boolean update_complain_check = false;
                                                                        
                                                                        System.out.print("Enter Complain Number : ");
                                                                        String update_number = sc1.nextLine();
                                                                        complain_list = complain.listIterator();

                                                                        while(complain_list.hasNext())
                                                                        {
                                                                            Complain user_complain= (Complain)complain_list.next();
                                                                            
                                                                           
                                                                            if(update_number.equals(user_complain.Number))
                                                                            {
                            
                                                                                complain_list.remove();
                                                                                update_complain_check = true;
                                                                            }
                                                                        }
                                                                        if(update_complain_check == true)
                                                                        {
                                                                            oos = new ObjectOutputStream(new FileOutputStream(file_02));
                                                                            oos.writeObject(complain);
                                                                            oos.close();
                                                                            System.out.println("Complain Successfully Deleted :) ");
                                                                        } 
                                                                        else 
                                                                        {
                                                                            System.out.println("Invalid Number :( ");
                                                                        }
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Oops!!! Nothing Found :(");
                                                                    }
                                                                break;

                                                            //============================================ DELETE COMPLAIN CLOSED======================================================
                                                            }

                                                        }while(user_complain_choice!='0');

                                                    break;
                                                //============================================================================== USER COTTAGE ===================================================
                                                    case '3':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tCottages");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        if(file2.isFile())
                                                        {
                                                            char user_cottage = '~';
                                                            do
                                                            {
                                                                System.out.println("1 .View Cottages");
                                                                System.out.println("2 .Rent Cottage");
                                                                System.out.println("0 .Back");
                                                                System.out.print("Select An Option : ");
                                                                user_cottage = sc.next().charAt(0);
                                                                switch(user_cottage)
                                                                {
                                                                    //========================================================== USER VIEWING COTTAGES ==========================================
                                                                    case '1':
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\tView Cottages");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        char user_views_cottages = '~';
                                                                        do
                                                                        {
                                                                            cottage_list = cottage.listIterator();
                                                                                int i = 1;
                                                                                while(cottage_list.hasNext())
                                                                                {
                                                                                    System.out.println(i+". "+cottage_list.next());
                                                                                    i++;
                                                                                }
                                                                                System.out.print("Back To Main Menu (Press 0) : ");
                                                                                user_views_cottages = sc.next().charAt(0);
                                                                                switch(user_views_cottages)
                                                                                {
        
                                                                                }
                                                                        }while(user_views_cottages!='0');
                                                                    break;

                                                                    //=========================================================== USERS VIEWING COTTAGES ===============================================


                                                                    //===========================================================USERS RENT COTTAGES ===================================================

                                                                    case '2':
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\tView Cottages");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                
                                                                                    int x = -1;
                                                                                    do
                                                                                    {cottage_list = cottage.listIterator();
                                                                                    int i = 1;
                                                                                    while(cottage_list.hasNext())
                                                                                    {
                                                                                        System.out.println(i+". "+cottage_list.next());
                                                                                        i++;
                                                                                    }

                                                                                    System.out.print("Enter Cottage Code : ");
                                                                                    String select_cottage_code = sc1.nextLine();
                                                                                    cottage_list = cottage.listIterator();
                                                                                    Boolean rent_cottage_check = false;
                                                                                    while(cottage_list.hasNext())
                                                                                    {

                                                                                        Cottage cottage_acc = (Cottage)cottage_list.next();

                                                                                        if(select_cottage_code.equals(cottage_acc.Cottage_Code))
                                                                                        {
                                                                                            System.out.print("Rent For (Days) : ");
                                                                                            String rent_days1 = sc1.nextLine();
                                                                                            int rent_days = Int_Check(rent_days1);
                                                                                            
                                                                                            int Price = rent_days*cottage_acc.Cottage_Price;

                                                                                            
                                                                                            if(Price==0)
                                                                                            {
                                                                                                System.out.println("Please Try Again !!!");
                                                                                                System.out.println();
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                System.out.println("Tottal Price : "+Price+"TK");

                                                                                                System.out.print("Paying Ammount : ");
                                                                                                String pay_tk1 = sc1.nextLine();
                                                                                                int pay_tk = Int_Check(pay_tk1);

                                                                                                if(pay_tk==Price)
                                                                                                {
                                                                                                    
                                                                                                    System.out.print("\033[H\033[2J");
                                                                                                    System.out.println("____________________________________________________");
                                                                                                    System.out.println();
                                                                                                    System.out.println("Congratulations!!! You Have Successfully Rented the\nCottage For "+rent_days+" Days :)");
                                                                                                    System.out.println();
                                                                                                    System.out.println("Cottage Code :"+select_cottage_code);
                                                                                                    System.out.println("Paid Tk : "+pay_tk);
                                                                                                    System.out.println("____________________________________________________");
                                                                                                    System.out.println();
                                                                                                }
                                                                                                else{
                                                                                                    System.out.println();
                                                                                                    System.out.print("\033[H\033[2J");
                                                                                                    System.out.println("____________________________________________________");
                                                                                                    System.out.println();
                                                                                                    System.out.println("You Have to Pay the Exact Ammount ");
                                                                                                    System.out.println("____________________________________________________");
                                                                                                }
                                                                                                rent_cottage_check = true;
                                                                                            }

                                                                                        }
                                                                                    }
                                                                                    if(rent_cottage_check != true)
                                                                                    {
                                                                                            System.out.println("Wrong Cottage Code :{");
                                                                                    }


                                                                                    System.out.println();
                                                                                    System.out.print("Back To Main Menu (Pres 0) : ");
                                                                                    x=sc.nextInt();
                                                                                    }while(x!=0);

                                                                    break;
                                                                    //=======================================================USERS RENT COTTAGES CLOSED=================================================

                                                                }



                                                            }while(user_cottage!='0');

                                                        }
                                                        else 
                                                        {
                                                            System.out.println("File Not Found :/ ");
                                                        }
                                                    break;
                                                        
                                                //============================================================================== USER COTTAGE CLOSED ===================================================
                                                    
                                                    
                                                //=============================================================================== USER NEWSPAPER =======================================================
                                                    case '4':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tSubscribe To Newspaper");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        if(file3.isFile())
                                                        {
                                                            char user_newspaper_select = '~';
                                                            do{

                                                                System.out.println("1 .View Newspaper Subscription Packages ");
                                                                System.out.println("2 .Buy Subscription");
                                                                System.out.println("0 .Back");
                                                                System.out.print("Select An Option : ");
                                                                user_newspaper_select = sc.next().charAt(0);
                                                                switch(user_newspaper_select)
                                                                {
                                                                    //========================================== USER VIEWS SUBSCRIPTION PACKAGES ==========================================
                                                                    case '1':
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\tView Cottages");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        char ad_views_newspaper = '~';
                                                                        do
                                                                        {
                                                                            if(file3.isFile())
                                                                            {
                                                                                newspaper_list = newspaper.listIterator();
                                                                                int i = 1;
                                                                                while(newspaper_list.hasNext())
                                                                                {
                                                                                    System.out.println(i+". "+newspaper_list.next());
                                                                                    i++;
                                                                                }
                                                                                System.out.print("Back To Main Menu (Press 0) : ");
                                                                                ad_views_newspaper = sc.next().charAt(0);
                                                                                switch(ad_views_newspaper)
                                                                                {

                                                                                }
                                                                            }
                                                                            else 
                                                                            {
                                                                                System.out.println("Oops!!! Nothing Found :( ");
                                                                            }


                                                                        }while(ad_views_newspaper != '0');
                                                                        break;

                                                                        //================================================================ USER VIEWS SUBSCRIPTION CLOSED ==================================================
                                                                        //================================================================ USER BUYS SUBSCRIPTION ==========================================================


                                                                        case '2':
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\tSelect Newspaper");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        

                                                                        if(file3.isFile())
                                                                        {
                                                                                
                                                                                char x = '~';
                                                                                do{
                                                                                newspaper_list = newspaper.listIterator();
                                                                                int i = 1;
                                                                                while(newspaper_list.hasNext())
                                                                                {
                                                                                    System.out.println(i+". "+newspaper_list.next());
                                                                                    i++;
                                                                                }

                                                                                System.out.print("Enter Newspaper Name :");
                                                                                String buy_newspaper = sc1.nextLine();
                                                                                
                                                                                newspaper_list = newspaper.listIterator();
                                                                                Boolean user_selecting_newspaper = false;
                                                                                while(newspaper_list.hasNext())
                                                                                {
                                                                                    Newspaper newspaper_acc = (Newspaper)newspaper_list.next();
                                                                                    if(buy_newspaper.equals(newspaper_acc.Newspaper_Name))
                                                                                    {
                                                                                        System.out.print("Subscribe For (Months) : " );
                                                                                        String subscribe_months1 = sc1.nextLine();
                                                                                        int subscribe_months = Int_Check(subscribe_months1);

                                                                                        int newspaper_total_ammount = subscribe_months*newspaper_acc.Newspaper_Price;

                                                                                        if(newspaper_total_ammount==0)
                                                                                        {
                                                                                            System.out.println("Please Try Again !!! ");
                                                                                            System.out.println();
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            System.out.println("Total Amount : "+newspaper_total_ammount+"TK");

                                                                                            System.out.print("Payment : ");
                                                                                            String newspaper_payment1 = sc1.nextLine();
                                                                                            int newspaper_payment = Int_Check(newspaper_payment1);
                                                                                            
                                                                                            if(newspaper_total_ammount==newspaper_payment)
                                                                                            {
                                                                                                
                                                                                                System.out.print("\033[H\033[2J");
                                                                                                System.out.println("____________________________________________________");
                                                                                                System.out.println();
                                                                                                System.out.println("Congratulaitons !!! You are Successfully Subscribed \nto "+newspaper_acc.Newspaper_Name+" :)");
                                                                                                System.out.println("You Subscribed For "+subscribe_months+" Months And Paid "+newspaper_payment+"TK :)");
                                                                                                System.out.println("____________________________________________________");
                                                                                                
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                System.out.print("\033[H\033[2J");
                                                                                                System.out.println("____________________________________________________");
                                                                                                System.out.println();
                                                                                                System.out.println("Sorry You Failed To Subscribed :(");
                                                                                                System.out.println("You Have To Pay Exact "+newspaper_total_ammount+"TK");
                                                                                                System.out.println("____________________________________________________");
                                                                                            }
                                                                                        }

                                                                                        user_selecting_newspaper = true;
                                                                                    }
                                                                                }
                                                                                if(user_selecting_newspaper == false)
                                                                                {
                                                                                    System.out.println("No News Paper Found :( ");
                                                                                }

                                                                                System.out.println();
                                                                                System.out.print("Back To Main Menu (Press 0) : ");
                                                                                x= sc.next().charAt(0);

                                                                            }while(x!='0');



                                                                        }
                                                                        else 
                                                                        {
                                                                            System.out.println("Oops!!! Nothing Found :(");
                                                                        }




                                                                        break;

                                                                        //================================================================ USER BUYS SUBSCRIPTION CLOSED ===================================================
                                                                    }
                                                                    

                                                                }while(user_newspaper_select != '0');
                                                            }
                                                            else 
                                                            {
                                                                System.out.println("Oops!!! Nothing Found :( ");
                                                            }
                                                    
                                                    
                                                    break;
                                                //=============================================================================== USER NEWSPAPER CLOSED =======================================================
                                                //=============================================================================== USER BUS TICKET =======================================================
                                                    case '5':
                                                    System.out.print("\033[H\033[2J");
                                                    System.out.println("____________________________________________________");
                                                    System.out.println();
                                                    System.out.println("\t\t Bus Tickets");
                                                    System.out.println("____________________________________________________");
                                                    System.out.println();
                                                       
                                                    if(file4.isFile())
                                                    {
                                                        char bus_choice = '~';
                                                        do{
                                                            System.out.println("1 .View Tickets ");
                                                            System.out.println("2 .Buy Ticket ");
                                                            System.out.println("0 .Back");
                                                            System.out.print("Select An Option : ");
                                                            bus_choice = sc.next().charAt(0);
                                                            switch(bus_choice)
                                                            {
                                                            ////==========================================================USER VIEWING BUS TICKETS=============================================    
                                                                case '1':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tViewing Bus Tickets");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    if(file4.isFile())
                                                                    {
                                                                        char view_bus_tickets = '~';
                                                                        do{
                                                                            bus_list = bus.listIterator();
                                                                            int i = 1;
                                                                            while(bus_list.hasNext())
                                                                            {
                                                                                System.out.println(i+". "+bus_list.next());
                                                                                i++;

                                                                            }

                                                                            System.out.println();
                                                                            System.out.print("Back To Main Menu (Press 0) : ");
                                                                            view_bus_tickets = sc.next().charAt(0);
                                                                            switch(view_bus_tickets)
                                                                            {

                                                                            }

                                                                        }while(view_bus_tickets != '0');
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Oops!!! Nothing Found :(");
                                                                    }
                                                                    
                                                                break;
                                                                ////========================================================== USER VIEWING BUS CLOSED =============================================
                                                                
                                                                ////========================================================== USER BUYING BUS =====================================================

                                                                case '2':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\tBuying Bus Tickets");
                                                                    System.out.println("____________________________________________________");
                                                                    System.out.println();
                                                                    
                                                                    if(file4.isFile())
                                                                    {
                                                                        int x = -1;
                                                                        do{
                                                                        bus_list = bus.listIterator();
                                                                        int i = 1;
                                                                        while(bus_list.hasNext())
                                                                        {
                                                                            System.out.println(i+". "+bus_list.next());
                                                                            i++;

                                                                        }

                                                                        System.out.print("Enter Ticket Code : ");
                                                                        String enter_code =sc1.nextLine();

                                                                        bus_list = bus.listIterator();
                                                                        Boolean ticket_buying_check = false;
                                                                        
                                                                        while(bus_list.hasNext())
                                                                        {
                                                                            Bus_Ticket ticket_acc = (Bus_Ticket)bus_list.next();
                                                                            if(enter_code.equals(ticket_acc.Ticket_Code))
                                                                            {

                                                                                System.out.print("Enter The Amount of Ticket : ");
                                                                                String amount_of_ticket1= sc1.nextLine();
                                                                                int amount_of_ticket = Int_Check(amount_of_ticket1);

                                                                                int tottal_amount = amount_of_ticket*ticket_acc.Ticket_Price;
                                                                                if(tottal_amount==0)
                                                                                {
                                                                                    System.out.println("Invalid Amount Of Tickets");
                                                                                }
                                                                                else
                                                                                {
                                                                                System.out.println("Total Amount : "+tottal_amount+"TK");
                                                                                
                                                                                System.out.print("Pay TK : ");
                                                                                String pay_ticket_tk1 = sc1.nextLine();
                                                                                int pay_ticket_tk = Int_Check(pay_ticket_tk1) ;
                                                                                if(tottal_amount==pay_ticket_tk)
                                                                                {
                                                                                    System.out.print("\033[H\033[2J");
                                                                                    System.out.println("____________________________________________________");
                                                                                    System.out.println();
                                                                                    System.out.println("You Have Successfully Purchased "+amount_of_ticket+" Tickets");
                                                                                    System.out.println("Of "+pay_ticket_tk+"TK of "+ticket_acc.DateAndTime+" Of "+ticket_acc.Destination);
                                                                                    System.out.println("Please Be On Time And Don't Be Late.");
                                                                                    System.out.println("____________________________________________________");
                                                                                    
                                                                                }
                                                                                else{
                                                                                    System.out.print("\033[H\033[2J");
                                                                                    System.out.println("____________________________________________________");
                                                                                    System.out.println();
                                                                                    System.out.println("You Must Have To Pay The Exact Ammount Of Tk !!! ");
                                                                                    System.out.println("____________________________________________________");
                                                                                }                 
                                                                                }
                                                                                
                                                                                ticket_buying_check = true;
                                                                            }
                                                                            
                                                                        }

                                                                        if(ticket_buying_check == false)
                                                                        {
                                                                            System.out.println("Invalid Ticket Code :{");
                                                                            System.out.println("____________________________________________________");
                                                                        }
                                                                        System.out.println();
                                                                        System.out.print("Back To Main Menu (Press 0 ): ");
                                                                        x = sc.nextInt();
                                                                        
                                                                        }while(x != 0);

                                                                        }
                                                                        else 
                                                                        {
                                                                            System.out.println("Oops!!! Nothing Found :(");
                                                                        }
                                                                    

                                                                break;

                                                                ////========================================================== USER BUYING BUS CLOSED ==============================================

                                                                
                                                            }


                                                        }while(bus_choice !='0');



                                                    }
                                                    else 
                                                    {
                                                        System.out.println("Oops!!! Nothing Found :( ");
                                                    }  
                                                    


                                                    
                                                    break;
                                                //=============================================================================== USER BUS TICKET CLOSED =======================================================
                                                
                                                
                                                //=============================================================================== USER TRANSPORTATION SERVIE=======================================================
                                                    case '6':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tTransprotations");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        if(file5.isFile())
                                                        {
                                                            char user_vehicle_choice = '~';
                                                            do
                                                            {
                                                                System.out.println("1 .View Vehicles ");
                                                                System.out.println("2 .Rent Vehicle");
                                                                System.out.println("0 .Back");
                                                                System.out.print("Select An Option : ");
                                                                user_vehicle_choice = sc.next().charAt(0);
                                                                switch(user_vehicle_choice)
                                                                {
                                                                //=================================================================== USER VIEWS VEHICLES SERVICES ===================================================================    
                                                                    case '1':
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\tView Vehicle");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        if(file5.isFile())
                                                                        {
                                                                            int x = -1;
                                                                            do{
                                                                                vehicle_list = vehicle.listIterator();
                                                                                int i = 1;
                                                                                while(vehicle_list.hasNext())
                                                                                {
                                                                                    System.out.println(i+". "+vehicle_list.next());
                                                                                    i++;
                                                                                }
                                                                                
                                                                                System.out.print("Back To Main Menu (Press 0): ");
                                                                                x = sc.nextInt();
                                                                            }while(x!=0);
                                                                        }
                                                                    break;
                                                                //=================================================================== USER VIEWS VEHICLES CLOSED====================================================================== 
                                                                    
                                                                    
                                                                
                                                                //=================================================================== USER RENTS VEHICLES =============================================================================     
                                                                    case '2':
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\tView Vehicle");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        if(file5.isFile())
                                                                        {
                                                                            int xyx = -1;
                                                                            do{
                                                                                vehicle_list = vehicle.listIterator();
                                                                                int i = 1;
                                                                                while(vehicle_list.hasNext())
                                                                                {
                                                                                    System.out.println(i+". "+vehicle_list.next());
                                                                                    i++;
                                                                                }

                                                                                System.out.print("Enter Vehicle Code Number : ");
                                                                                String vehicle_code_number = sc1.nextLine();
                                                                                vehicle_list = vehicle.listIterator();
                                                                                Boolean user_choose_vehicle = false;
                                                                                while(vehicle_list.hasNext())
                                                                                {
                                                                                    Transportation vehicle_acc = (Transportation)vehicle_list.next();
                                                                                    if(vehicle_code_number.equals(vehicle_acc.Vehicle_Code))
                                                                                    {
                                                                                        System.out.print("Enter Number Of Rent Days : ");
                                                                                        String vehicle_rent_days1 = sc1.nextLine();
                                                                                        int vehicle_rent_days = Int_Check(vehicle_rent_days1);

                                                                                        int tottal_rent_ammount = vehicle_rent_days*vehicle_acc.Rent_Cost;

                                                                                        if(tottal_rent_ammount == 0)
                                                                                        {
                                                                                            System.out.print("Try Again !!! ");
                                                                                            System.out.println();
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            System.out.println("Total Rent Cost : "+tottal_rent_ammount+"TK");

                                                                                            System.out.print("Pay Rent Cost : ");
                                                                                            String pay_rent_cost1 = sc1.nextLine();
                                                                                            int pay_rent_cost = Int_Check(pay_rent_cost1);

                                                                                            if(tottal_rent_ammount==pay_rent_cost)
                                                                                            {
                                                                                                System.out.print("\033[H\033[2J");
                                                                                                System.out.println("____________________________________________________");
                                                                                                System.out.println();
                                                                                                System.out.println("Congratulations You Have Successfully Rented The Car");
                                                                                                System.out.println("You Have Rented The Vehicle For "+vehicle_rent_days+" Days");
                                                                                                System.out.println("Paid Tottal : "+pay_rent_cost+"TK");
                                                                                                System.out.println("Driver Name : "+vehicle_acc.Driver_Name);
                                                                                                System.out.println("Driver Number : "+vehicle_acc.Driver_Number);
                                                                                                System.out.println("Vehicle Code : "+vehicle_acc.Vehicle_Code);
                                                                                                System.out.println("Vehicle Type : "+vehicle_acc.Vehicle_Type);
                                                                                                System.out.println("Vehicle Model : "+vehicle_acc.Vehicle_Model);
                                                                                                System.out.println("Vehicle Number : "+vehicle_acc.Vehicle_Number);
                                                                                                System.out.println("____________________________________________________");
                                                                                               
                                                                                            }
                                                                                            else 
                                                                                            {
                                                                                                System.out.print("\033[H\033[2J");
                                                                                                System.out.println("____________________________________________________");
                                                                                                System.out.println();
                                                                                                System.out.println("You Have To Pay The Exact Ammount Of Tk");
                                                                                                System.out.println("____________________________________________________");

                                                                                            }
                                                                                        }
                                                                                        
                                                                                        
                                                                                        user_choose_vehicle = true;
                                                                                    }
                                                                                }
                                                                                if(user_choose_vehicle!=true)
                                                                                {
                                                                                    System.out.println("Wrong Vehicle Code :{ ");
                                                                                }
                                                                                System.out.println();
                                                                                System.out.print("Back To Main Menu (Press 0): ");
                                                                                xyx = sc.nextInt();
                                                                            }while(xyx!=0);
                                                                        }
                                                                    
                                                                    break;
                                                                //=================================================================== USER RENTS VEHICLES CLOSED=============================================================================
                                                                }


                                                            }while(user_vehicle_choice != '0');

                                                        }
                                                        else
                                                        {
                                                            System.out.println("Oops!!! Nothing Found :(");
                                                        }


                                                    break;
                                                //=============================================================================== USER Transprotations SERVIE CLOSED=======================================================
                                                //=============================================================================== USER SHOPING SERVIE =======================================================

                                                    case '7':
                                                        if(file6.isFile())
                                                        {
                                                            System.out.print("\033[H\033[2J");
                                                            System.out.println("____________________________________________________");
                                                            System.out.println();
                                                            System.out.println("\t\tOnline Shop");
                                                            System.out.println("____________________________________________________");
                                                            System.out.println();

                                                            char user_shop_select = '~';
                                                            do{

                                                                System.out.println("1 .View Products ");
                                                                System.out.println("2 .Buy Prodcuts");
                                                                System.out.println("0 .Back");
                                                                System.out.print("Select An Option : ");
                                                                user_shop_select = sc.next().charAt(0);

                                                                switch(user_shop_select)
                                                                {
                                                                
                                                                //=======================================================USER VIEWS PRODUCTS ==========================================================
                                                                    case '1':
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\tUser Viewing Products");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        product_list = product.listIterator();
                                                                        char product_view_check = '~';
                                                                        do
                                                                        {
                                                                        int i = 1;
                                                                        while(product_list.hasNext())
                                                                        {
                                                                            System.out.println(i+". "+product_list.next());
                                                                            i++;
                                                                        }

                                                                        System.out.println();
                                                                        System.out.print("Back To Main Menu (Press 0 ) : ");
                                                                        product_view_check = sc.next().charAt(0);
                                                                        switch(product_view_check)
                                                                        {

                                                                        }
                                                                        }while(product_view_check!='0');

                                                                    break;
                                                                //=======================================================USER VIEWS PRODUCTS CLOSED ==========================================================


                                                                //=======================================================USER VIEWS BUYS PRODUCTS ==========================================================
                                                                    case '2':
                                                                        System.out.print("\033[H\033[2J");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        System.out.println("\t\tBuy Product");
                                                                        System.out.println("____________________________________________________");
                                                                        System.out.println();
                                                                        product_list = product.listIterator();
                                                                        char product_buying_check = '~';
                                                                        do
                                                                        {
                                                                        int i = 1;
                                                                        while(product_list.hasNext())
                                                                        {
                                                                            System.out.println(i+". "+product_list.next());
                                                                            i++;
                                                                        }


                                                                        
                                                                        
                                                                        int tottal_cost = 0;
                                                                        Boolean buy_product_check = false;
                                                                        int count = 0;
                                                                        System.out.print("Enter The Number Of The Product : ");
                                                                        String number_of_products1 = sc1.nextLine();
                                                                        int number_of_products = Int_Check(number_of_products1);
                                                                        if(number_of_products==0)
                                                                        {
                                                                            System.out.println("Try Again !!! ");
                                                                        }

                                                                        else 
                                                                        {
                                                                            for(int j = 0 ; j < number_of_products ;j++)
                                                                            {
                                                                                System.out.print("Enter The Code Of The Products : ");
                                                                                String buy_product_code = sc1.nextLine();
                                                                                product_list = product.listIterator();
                                                                                
                                                                                while(product_list.hasNext())
                                                                                {
                                                                                    Shop shop_acc = (Shop)product_list.next();
                                                                                    if(buy_product_code.equals(shop_acc.Product_Code))
                                                                                    {
                                                                                        tottal_cost+=shop_acc.Product_Price;
                                                                                        buy_product_check = true;
                                                                                        count++;
                                                                                    }

                                                                        
                                                                                }
                                                                            }
                                                                        }
                                                                       
                                                                        if(buy_product_check == true)
                                                                        {
                                                                            System.out.println("You Have Selected Total : "+count+" Products ");
                                                                            System.out.println("Your Total Bill : "+tottal_cost+"TK");
                                                                            System.out.print("Pay : ");
                                                                            String pay_tk1 = sc1.nextLine();
                                                                            int pay_tk = Int_Check(pay_tk1);
                                                                            if(pay_tk==tottal_cost)
                                                                            {
                                                                                System.out.print("You Have Successfully Paid "+pay_tk+"Tk Of "+count+" Products");
                                                                                System.out.println();
                                                                                
                                                                            }
                                                                            else 
                                                                            {
                                                                                System.out.println("You Have To Pay The Exact Ammount Of TK");
                                                                            }
                                                                        }
                                                                        else 
                                                                        {
                                                                            System.out.println("Invalid Choice ");
                                                                        }


                                                                        

                                                                        System.out.print("Back To Main Menu (Press 0 ) : ");
                                                                        product_buying_check = sc.next().charAt(0);
                                                                        switch(product_buying_check)
                                                                        {

                                                                        }
                                                                        }while(product_buying_check!='0');

                                                                        

                                                                    break;
                                                                //=======================================================USER VIEWS BUYS PRODUCTS CLOSED ==========================================================
                                                                }

                                                            }while(user_shop_select !='0');

                                                        }
                                                        else 
                                                        {
                                                            System.out.println("Oops!!! Nothing Found :( ");
                                                        }

                                                    break;
                                                //=============================================================================== USER SHOPING SERVIE CLOSED =======================================================

                                                //================================================= USERS ACCOUNTS SETTINGS ==================================================
                                                    case '8':
                                                        System.out.print("\033[H\033[2J");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();
                                                        System.out.println("\t\tUser Accounts Settings");
                                                        System.out.println("____________________________________________________");
                                                        System.out.println();

                                                        char user_acc_settings_choice = '~';

                                                        do
                                                        {
                                                            System.out.println("1 .View Account Information");
                                                            System.out.println("2 .Update Account");
                                                            System.out.println("0 .Back");
                                                            System.out.print("Selec An Option : ");
                                                            user_acc_settings_choice = sc.next().charAt(0);

                                                            
                                                            switch(user_acc_settings_choice)
                                                            {
                                                            //================================================== USERS VIEWING ACCOUNT INFORMAITON ================================================================   
                                                                case '1':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.flush();  
                                                                    System.out.println("______________________________________________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\t\t\tMy Account Informations");
                                                                    System.out.println("______________________________________________________________________________________");
                                                                    System.out.println("______________________________________________________________________________________");
                                                                    System.out.println();
                                                                    
                                                                    user_list = user.listIterator();
                                                                    while(user_list.hasNext())
                                                                    {
                                                                        User user_acc = (User)user_list.next();
                                                                        
                                                                        if(login_username.equals(user_acc.User_Name) )
                                                                        {
                                                                            System.out.println(" "+user_acc);
                                                                            
                                                                        }
                                                                    }
                                                                    

                                                                break;
                                                            //================================================== USERS VIEWING ACCOUNT INFORMATION CLOSED================================================================
                                                            
                                                            
                                                            
                                                            //================================================== USERS UPDATE ACCOUNT INFORMATION ===========================================================================
                                                                
                                                               case '2':
                                                                    System.out.print("\033[H\033[2J");
                                                                    System.out.flush();  
                                                                    System.out.println("______________________________________________________________________________________");
                                                                    System.out.println();
                                                                    System.out.println("\t\t\t\t Account Update");
                                                                    System.out.println("______________________________________________________________________________________");
                                                                    System.out.println("______________________________________________________________________________________");
                                                                    System.out.println();
                                                                    
                                                                    System.out.print("Enter User Name : ");
                                                                    String username_up = sc1.nextLine();

                                                                    System.out.print("Enter Password : ");
                                                                    String user_pass_up = sc1.nextLine();

                                                                    user_list = user.listIterator();
                                                                    Boolean user_acc_update_check = false;
                                                                    while(user_list.hasNext())
                                                                    {
                                                                        User user_acc = (User)user_list.next();
                                                                        
                                                                        if(username_up.equals(user_acc.User_Name) || user_pass_up.equals(user_acc.Pass))
                                                                        {
                                                                                System.out.print("\033[H\033[2J");
                                                                                System.out.flush();  
                                                                                System.out.println("______________________________________________________________________________________");
                                                                                System.out.println();
                                                                                System.out.println("\t\t Enter Your All New Informations");
                                                                                System.out.println("______________________________________________________________________________________");
                                                                                System.out.println("______________________________________________________________________________________");
                                                                                System.out.println();
                                                                                
                                                                                System.out.print("Enter New Name : ");
                                                                                String new_user_name = sc1.nextLine();
                                                                                
                                                                                System.out.print("Enter New Email : ");
                                                                                String user_new_email = sc1.nextLine();

                                                                                System.out.print("Enter New Occupassion : ");
                                                                                String new_user_occupassion = sc1.nextLine();

                                                                                
                                                                                System.out.print("Enter New Phone : ");
                                                                                String new_user_phone = sc1.nextLine();

                                                                                System.out.print("Enter New Password : ");
                                                                                String new_user_pass = sc1.nextLine();

                                                                                user_list.set(new User(new_user_name,username_up, user_new_email, new_user_occupassion, new_user_phone, new_user_pass));

                                                                                user_acc_update_check =true;
                                                                        }
                                                                    }
                                                                    if(user_acc_update_check == true)
                                                                    {
                                                                        oos = new ObjectOutputStream(new FileOutputStream(file_01));
                                                                        oos.writeObject(user);
                                                                        oos.close();
                                                                        System.out.println("Your Account Successfully Updated :) ");

                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Wrong User Name and Password :/ ");
                                                                    }
                                                                            
                                                                        break;

                                                            //================================================== USERS UPDATE ACCOUNT INFORMATION CLOSED================================================================
                                                            }

                                                        }while(user_acc_settings_choice !='0');
   
                                                    break;
                                                }

                                                }while(user_options!='0');
                                             
                                                login_check =true;
                                        }
                                        
                                    }
                                    if(login_check==false)
                                    {
                                        System.out.println("Wrong User Name And Password :( .Try Again :| ");
                                    }



                                }
                                else 
                                {
                                    System.out.println("Oops!!! Nothing Found :(");
                                }
                            
                            break;
                        //=================================================== USER LOGING CLOSED ================================================================ 
                        }



                    }while(user_choice!='0');
                    break;
            }
     }while(choice!='0');
     }
 }
//===================================================================== PROGRAM CLOSED ===================================================================