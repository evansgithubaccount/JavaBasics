public class Animal {
    int age;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class Bird extends Animal{
    int eggs;
    public void setEggs(int eggs){
        this.eggs = eggs;
    }
    public int getEggs(){
        return eggs;
    }
}

class Albatross extends Bird{
    public static void main(String[] args){
        Animal a = new Animal();
        Bird b = new Bird();
        Albatross alb = new Albatross();

        alb.setAge(5);
        alb.setEggs(3);
        int age = alb.getAge();
        int eggs = alb.getEggs();

        System.out.println("This albatross is " + age + " years old");
        System.out.println("This albatross has laid " + eggs + " eggs");

        System.out.println(b instanceof Animal);
        System.out.println(alb instanceof Bird);
        System.out.println(alb instanceof Animal);
    }
}