public class Pokemon {
    private int level;  //private means that they can only be used inside of the Pokemon object
    private boolean caught;
    private String type;
    private String name;
    private String trainerName;

    public Pokemon(String trainerName){  //this is the Constructor. Constructors are called when an object of a class is created
        this.trainerName = trainerName;
    }

    public String getName(){  //we will use this to access the name variable when in other objects
        return name;
    }
    public void setName(String name){  //get and set aren't static, because static methods belong to the class, and not the object
        this.name = name;
    }

    public int getLevel(){  //getter allows other objects see the level variable
        return level;
    }
    //GETTERS AND SETTERS ARE NOT STATIC
    public void setLevel(int level){  //setter allows us to set the value from another object
        this.level = level;  //this.legs refers to the variable declared at the top
    }

    public boolean getCaught(){
        return caught;
    }
    public void setCaught(boolean caught){
        this.caught = caught;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
}


