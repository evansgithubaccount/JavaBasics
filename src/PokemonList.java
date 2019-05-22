
class Pikachu extends Pokemon {
    public Pikachu(int level){  //this is the Constructor that sets all of the base stats for Pikachu
        this.setName("Pikachu");
        this.setType("Electric");
        this.setHP(10*level);
        this.setmaxHP(10*level);
        this.setATT(80.0+(level-5));
        this.setDEF(50.0+(level-5));
        this.setLevel(level);
        this.setMoveSet("Thunderbolt");
        this.setMoveSet("Scratch");
        this.setMoveStrengths(80);
        this.setMoveStrengths(25);
    }
}

class Charmander extends Pokemon{
    public Charmander(int level){
        this.setName("Charmander");
        this.setType("Fire");
        this.setHP(52+(level*2));
        this.setATT(52.0+(level-10));
        this.setDEF(43.0+(level-5));
        this.setLevel(level);
        this.setMoveSet("Ember");
        this.setMoveSet("Scratch");
        this.setMoveStrengths(40);
        this.setMoveStrengths(25);
    }
}

class Meowth extends Pokemon {
    public Meowth(int level){
        this.setName("Meowth");
        this.setType("Normal");
        this.setHP(40+(level*2));
        this.setATT(45+(level+10));
        this.setDEF(35+(level+10));
        this.setLevel(level);
        this.setMoveSet("Scratch");
        this.setMoveSet("Growl");
        this.setMoveStrengths(25);
        this.setMoveStrengths(1);
    }
}

class Stitch extends Pokemon{
    public Stitch(int level){
        this.setName("Stitch");
        this.setType("Dragon");
        this.setHP(100+(level*2));
        this.setATT(100+(level+10));
        this.setDEF(100+(level+10));
        this.setLevel(level);
        this.setMoveSet("Scratch");
        this.setMoveSet("Tornado");
    }
    public double move1(int pwrLevel,int oppDEF,String oppType){
        Move scratch = new Move(pwrLevel,25,this.getATT(),oppDEF,"Scratch","Stitch");
        double damage = scratch.doMove();
        return damage;
    }
    public double move2(int pwrLevel,int oppDEF,String oppType){
        Move tornado = new Move(pwrLevel,100,this.getATT(),oppDEF,"Tornado","Stitch");
        double damage = tornado.doMove();
        return damage;
    }

}
