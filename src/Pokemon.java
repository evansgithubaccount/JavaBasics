public class Pokemon {

    private int level;  //private means that they can only be used inside of the dog object
    private boolean caught;
    private String type;

    public Pokemon(){

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
