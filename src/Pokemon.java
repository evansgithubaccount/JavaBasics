
public class Pokemon {  //this class 'Pokemon' can be called on later to create a 'Pokemon' object

    //this will give every Pokemon object its own 'name', 'level', and 'type' variables;
    private String name;
    private int level;
    private String type;


    //CONSTRUCTOR
    public Pokemon(int level,String type){ //this is the constructor, it runs when we create a new Pokemon object
        //this is where we can set all of the initial values for our Object
        this.level = level;
        this.type = type;
        //we use 'this.level' and 'this.type' in order to distinguish
        // between the 'level' variable of the Pokemon object and the parameter 'level' that we're taking in
    }


    //GETTERS AND SETTERS
    public String getName(){ //this is a 'getter' method. It will allow us to access the 'name' variable of this Pokemon in other files.
        return name;
    }
    public void setName(String name){  //this is a 'setter' method. It will allow us to assign a value to the 'name' variable after we create a Pokemon object.
        this.name = name;
    }

    public int getLevel(){return level;}
    public void setLevel(int level){this.level=level;}

    public String getType(){return type;}
    public void setType(String type){this.type = type;}


    //any non-private method that we create in this Pokemon class can be called on later when we create a new Pokemon object
    public void useMove(){
        switch(type.toUpperCase()){
            case "WATER": System.out.println(name + " used Water Gun!");break;

            case "GRASS": System.out.println(name + " used Vine Wip!");break;

            case "FIRE": System.out.println(name + " used Ember!");break;

            case "ELECTRIC": System.out.println(name + " used Thunderbolt!");break;

            default: System.out.println(name + " used Tackle!");break;
        }
    }

}
