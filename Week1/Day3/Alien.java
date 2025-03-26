import java.util.ArrayList;
public class Alien {
    // we wil lstart with the attributes || member variables : belong to the class (traits that define the properties of the object)
    // 🥷  By Convintion they should be private 
    private String name;
    private double health;
    private ArrayList<String> attacks;

    // 🥷 Constructor 
    // 🥷 Special Method with no return type / that will be invoked in object instantiation
    // 🥷 Converts Class Attributes into Object or instance Attributes

    public Alien(String name){
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
public void attack(Alien victim){
    String atatckName=attacks.get(0);
    System.out.println(this.name+" perform "+atatckName+" on : "+victim.getName());
    victim.takeDamage();

}
// 🥷 attack overload that take the atatck index from the user input 

public void attack(Alien victim,int index){
    String atatckName=attacks.get(index);
    System.out.println(this.name+" perform "+atatckName+" on : "+victim.getName());
    victim.takeDamage();

}
    // 🥷 take damage method that will decrease the health of the victim 
      public void takeDamage(){
        this.health-=20.0;
      }

}
