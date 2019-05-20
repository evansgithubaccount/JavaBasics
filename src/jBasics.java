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

    public static void TBD(){
        String newString = "33";
        int x = Integer.parseInt(newString);  //turn a string into an integer
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

    public static void basicObjectCreator(){
        Pokemon charizard = new Pokemon();  //creates a new Pokemon object using the Pokemon.java file that we have in the same folder as this file
        charizard.setName("Charizard");
        charizard.setLevel(4);  //references the setLevel method in our charizard object that we just created
        charizard.setCaught(true);
        charizard.setType("Fire, Dragon");
        System.out.println("The name of this Pokemon is " + charizard.getName());
        System.out.println(charizard.getName() + " is level " + charizard.getLevel());  //references the getLegs method that returns the number of legs
        System.out.println("Have you caught this pokemon?: " + charizard.getCaught());
        System.out.println(charizard.getName() + " is a " + charizard.getType() + " type");
    }

    public static void main(String[] args){
        basicObjectCreator();
    }
}
