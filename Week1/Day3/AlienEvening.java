import java.util.ArrayList;
public class AlienEvening {
    // we wil lstart with the attributes || member variables : belong to the class (traits that define the properties of the object)
    // 🥷  By Convintion they should be private 
    private String name;
    private double health;
    private ArrayList<String> attacks;

    // 🥷 Constructor 
    // 🥷 Special Method with no return type / that will be invoked in object instantiation
    // 🥷 Converts Class Attributes into Object or instance Attributes

    public AlienEvening(String name){
        this.name=name;
        this.health=100.0;
        this.attacks=new ArrayList<>();
    }
// generate the getters and setters : 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public ArrayList<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<String> attacks) {
        this.attacks = attacks;
    }

    // 🥷 Create a method that display all the Alien infos
    public void displayInfo(){
        System.out.println("Alien's name : "+name);
        System.out.println("Aliens's health : "+health);
        System.out.println("Alien's attacks : "+attacks);
    }

    // 🥷 add alien Attack method
public ArrayList<String> addAttack(String newAttack){
    // 🥷 we will add the new attack to our array List
    attacks.add(newAttack);
    // 🥷 return the attacks list after add 
    return attacks;
}
// 🥷 Remove attack 

public ArrayList<String> removeAttack(String attack){
    // 🥷 we will add the new attack to our array List
    attacks.remove(attack);
    // 🥷 return the attacks list after add 
    return attacks;
}
// 🥷 remove method overload 
// 🥷  OverLoad method => same method name and return types but different params (args)
public ArrayList<String> removeAttack(int index){
    // 🥷 we will add the new attack to our array List
    attacks.remove(index);
    // 🥷 return the attacks list after add 
    return attacks;
}

// 🥷 Attack method
public void attack(AlienEvening victim){
    String atatckName=attacks.get(0);
    System.out.println(this.name+" perform "+atatckName+" on : "+victim.getName());
    victim.takeDamage(20.0);

}
// 🥷 attack overload that take the atatck index from the user input 

public void attack(AlienEvening victim,int index){
    // 🥷 we will test for the index first
    if(index>=0 && index<attacks.size()){
    String atatckName=attacks.get(index);
    System.out.println(this.name+" perform "+atatckName+" on : "+victim.getName());
    double damage=calculateDamage(atatckName);

    victim.takeDamage(damage);} else {
        System.out.println("Invalid Attack Index !!! ");
    }

}
    // 🥷 take damage method that will decrease the health of the victim 
      public void takeDamage(double damage){
        this.health-=damage;
      }
  // 🥷 Calculate Damage method
  public double calculateDamage(String attackName){
// 🥷 declare the initial damage 
double damage=0.0;
// 🥷 switch cases 
switch(attackName){
    case "Force Push":
    damage=30.0;
    break;
    case "Lazer Cannon":
    damage =45.5;
    break;
    case "test":
    damage =0;
    break;
    default:
    System.out.println("Unknown attack ! no damage will happen ");
    break;
}
return damage;
  }

// 🥷 Attack method with calculate Damage 



      // 🥷 Reset method
      public void reset(){
        this.health=100.0;
        this.attacks=new ArrayList<>();
      }

}
