
class Animal {
    private int age;
    void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class Bird extends Animal{  //'extends Animals' means that 'Bird' will be able to access all of the methods and variables inside of 'Animal'
    private int eggs;  //Bird has its own variable 'eggs' that Animal doesn't have.

    void setEggs(int eggs){
        this.eggs = eggs;
    }
    int getEggs(){
        return eggs;
    }
}

class Albatross extends Bird{  //Albatross will be able to access all of the methods and variables inside of Bird and Animal
    public static void main(String[] args){
        Albatross alb = new Albatross();  //create a new Albatross object

        alb.setAge(5); //we use the setAge() method from the 'Animal' class
        alb.setEggs(3);  //we use the setEggs() method from the 'Bird' class

        int age = alb.getAge();
        int eggs = alb.getEggs();

        System.out.println("This albatross is " + age + " years old");
        System.out.println("This albatross has laid " + eggs + " eggs");
    }
}

class Pig extends Animal{  //Pig will be able to access the methods and variables inside of Animal, but not the ones inside of Bird

}