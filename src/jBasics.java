import javax.swing.*;  //import for JFrame
import java.util.Scanner;  //import the scanner class for taking user input

public class jBasics {

    public static int arrayBasics(){
        char[] letters = {'j','a','v','a'};
        int[] numbers = new int[100];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = i;
        }
        return numbers[42];
    }

    public static void manipulateData(){
        String newString = "33";
        int AYY = Integer.parseInt(newString);  //turn a string into an integer
        String title = "Game of Thrones";
        int BEE = title.charAt(8); //gets the character at the 8th index of the string
    }

    public static void basicInput(){
        Scanner myObj = new Scanner(System.in);  //create scanner object
        System.out.println("Enter Username");

        String userName = myObj.nextLine();  //Read user input (nextLine reads Strings)
        //OTHER METHODS: nextBoolean, nextDouble, nextFloat, nextInt, nextLong
        System.out.println("Username is: " + userName);  //Output the user input
    }

    public static void basicJFrame(){
        JFrame frame = new JFrame();  //create a JFrame variable
        frame.setSize(800,600);  //set the window width and height in pixels
        frame.setTitle("New Window Title");  //set the window title
        frame.setVisible(true);  //make the window visible
    }

    public static void basicTryCatch(){
        try {  //will run the below code
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }catch(Exception e){  //if the above code returns an error, the below code will run
            System.out.println("Something went wrong");
        }finally{  //will execute after try...catch, regardless of the result
            System.out.println("The 'try catch' is finished.");
        }
    }

    public static void throwKeyword(int age){  //throw will actually show up as an error. Instead of just printing to the console.
        if(age<18){
            throw new ArithmeticException("Access Denied - Must be at least 18 years old");
        }else{
            System.out.println("Access Granted");
        }
    }

    public static void basicObjectCreator(String name,int level,String type){
        Pokemon charizard = new Pokemon("Red");  //creates a new Pokemon object using the Pokemon.java file that we have in the same folder as this file
        charizard.setName(name);
        charizard.setLevel(level);  //references the setLevel method in our charizard object that we just created
        charizard.setCaught(true);
        charizard.setType(type);
        System.out.println("The name of this Pokemon is " + charizard.getName());  //references the getName method that returns the name variable of the pokemon object
        System.out.println(charizard.getName() + " is level " + charizard.getLevel());
        System.out.println("Have you caught this pokemon?: " + charizard.getCaught());
        System.out.println(charizard.getName() + " is a " + charizard.getType() + " type");
    }

    public static void main(String[] args){
        basicObjectCreator("Charizard",28,"Fire, Dragon");
    }
}
