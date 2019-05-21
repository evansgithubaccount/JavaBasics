class superClass {
    int num = 20;

    //display method of superclass
    public void display(){
        System.out.println("This is the display method of the superclass");
    }
}

public class subClass extends superClass{

    int num = 10;

    //display method of sub class
    public void display(){
        System.out.println("This is the display method of the subclass");
    }

    public void myMethod(){
        //Instantiating subclass
        subClass sub = new subClass();

        //Invoking the display() method of the sub class
        sub.display();

        //Invoking the display() method of the superclass
        super.display();

        //printing the value of the variable num of subclass
        System.out.println("Sub Class variable value: " + sub.num);

        //printing the value of the variable num of the superclass
        System.out.println("Super Class variable value: " + super.num);
    }

    public static void main(String[] args){
        subClass obj = new subClass();
        obj.myMethod();
    }

}
