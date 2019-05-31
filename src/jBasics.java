import javax.swing.*;  //import for JFrame
import java.awt.*;     //more JFrame stuff
import java.util.Scanner;  //import the scanner class for taking user input
import java.lang.Math;  //import in order to user Math.round() to round doubles
import java.math.BigDecimal;  //import for using BigDecimal to round doubles
import java.math.MathContext;  //import to round BigDecimal

public class jBasics {

    //CHANGING DATA TYPES
    public static void changeData(){

        //TURN A STRING INTO AN INT
        String newString = "33";
        int myInt = Integer.parseInt(newString);

        //TURN A STRING INTO A DOUBLE
        String pi = "3.1415";
        double pie = Double.parseDouble(pi);

        //TURN A DOUBLE INTO AN INTEGER
        double newDouble = 15.0;
        int newInt = (int) newDouble;
        //this is called 'casting'. It's used to tell the compiler that an Object of type 'A' is actually type 'B'.
        //Casting won't work if you try to tell the compiler that an value is a data type that it can't possibly be
        //like if you try to cast a String into an Integer, you'll probably get an error

        //TURN AN INTEGER OR DOUBLE INTO A STRING
        int x = 45;
        double y = 45.8;
        String xString = String.valueOf(x);
        String yString = String.valueOf(y);

        //GET A CHAR AT A SPECIFIC INDEX OF A STRING
        String title = "Game of Thrones";
        char ninthChar = title.charAt(8);
    }


    //ROUNDING A DOUBLE
    public static void roundDouble(){
        double myDouble = 3.1415926535;
        System.out.println("My Initial Double: " + myDouble);

        //ROUNDING TO NEAREST INTEGER
        //use Math.round() to return a 'long' data type that is equal to the double rounded to the nearest integer
        long newLong = Math.round(myDouble);
        System.out.println("My Rounded Long: " + newLong);

        //ROUNDING TO A SPECIFIC DECIMAL PLACE
        MathContext m = new MathContext(3);  //use MathContext to set up the precision to which you want to round your number
        BigDecimal bigPi = new BigDecimal(myDouble);  //create a BigDecimal object and set it equal to the double that we created
        bigPi = bigPi.round(m);  //round the BigDecimal using the MathContext precision that we set up earlier
        double roundedDouble = bigPi.doubleValue();  //turn the BigDecimal back into a double
        System.out.println("My Rounded Double: " + roundedDouble);
    }


    //GETTING BASIC USER INPUT
    public static void basicInput(){
        Scanner myScanner = new Scanner(System.in);  //create scanner object
        System.out.println("Enter Username");  //prompt the user to enter data

        String userName = myScanner.nextLine();  //Read user input (nextLine reads Strings) and set it to the variable 'userName'
        //OTHER METHODS: nextBoolean, nextDouble, nextFloat, nextInt, nextLong
        System.out.println("Username is: " + userName);  //Output the user input
    }


    //CREATING A BASIC JFRAME
    public static void basicJFrame(){
        JFrame frame = new JFrame();  //create a new JFrame object
        frame.setSize(400,300);  //set the window width and height in pixels
        frame.setTitle("New Window");  //set the window title

        //CREATING A MENU BAR FOR THE JFRAME
        JMenuBar menuBar = new JMenuBar();  //create a Menu Bar object
        JMenu file = new JMenu("FILE");  //Create a new Menu object and set its text to "FILE"
        JMenu help = new JMenu("Help");  //Create a new Menu object and set its text to "Help"

        menuBar.add(file);  //add the Menu objects 'file' and 'help' to the Menu Bar that we created earlier
        menuBar.add(help);

        JMenuItem open = new JMenuItem("Open");  //Create a Menu Item and set its text to "Open"
        JMenuItem saveAs = new JMenuItem("Save as");  //Create a Menu Item and set its text to "Save as"

        file.add(open); //add the Menu Items 'open' and 'saveAs' to the Menu object 'file' that we created earlier
        file.add(saveAs);

        frame.getContentPane().add(BorderLayout.NORTH, menuBar);  //add the Menu Bar object to the top of our JFrame window

        //so now we have two MenuItem objects, that are inside of a Menu object, that is inside of a MenuBar object, that is inside of a JFrame object.

        frame.setVisible(true);  //make the window visible
    }


    //BASIC TRY/CATCH METHOD  -- used to recognize and catch errors
    public static void basicTryCatch(){
        //the computer will run the code in the 'try' section, and if that returns an error, it will run the code in the 'catch' section.
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);//this will return an error because the array 'myNumbers' only has 3 values in it
        }catch(Exception e){
            System.out.println("Something went wrong");
        }finally{
            //the 'finally' section will run regardless of the result of the 'try' or 'catch' statements
            System.out.println("The 'try catch' is finished.");
        }
    }


    //USING THE 'THROW' KEYWORD
    public static void throwKeyword(int age){  //throw will actually show up as an error. Instead of just printing to the console.
        if(age<18){
            throw new ArithmeticException("Access Denied - Must be at least 18 years old");
        }else{
            System.out.println("Access Granted");
        }
        System.out.println("Hello");
    }


    //BASIC OBJECT CREATOR
    public static void basicObjectCreator(String name,int level,String type){
        Pokemon myPokemon = new Pokemon(level,type);  //creates a new Pokemon object using the Pokemon.java file that we created in the same folder as this file
        myPokemon.setName(name);  //this is referencing the setName() method that we created in the Pokemon class

        System.out.println("The name of this Pokemon is " + myPokemon.getName());
        System.out.println(myPokemon.getName() + " is level " + myPokemon.getLevel());
        System.out.println(myPokemon.getName() + " is a " + myPokemon.getType() + " type");

        myPokemon.useMove();  //call the useMove() method from the Pokemon class
    }


    public static void main(String[] args){
       //here is where you can call the above methods to see what they do.
        dataEditor stuff = new dataEditor();
        System.out.println("Is this number prime?: " + stuff.isPrime(333333333));
    }
}
