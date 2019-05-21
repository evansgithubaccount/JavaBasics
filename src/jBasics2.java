import java.util.*;
import java.text.*;

public class jBasics2 {

    public static void dateDemo(){
        //Create a Date object
        Date date = new Date();
        //Display time and date using toString()
        System.out.println(date.toString());

        //Use SimpleDateFormat to create a format that you want the date to output in
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(date));
    }

    public static void callTest(){
        Albatross tweety = new Albatross();
    }

    public static void main(String[] args){
        dateDemo();
    }
}
