// 🥷 the class ninja is an example of encapsulation : attributes and methods are wrapped in one unit

public class Ninja{
    // 🥷 Attributes 
     /*-Member variables: These are attributes or fields that belong to a class.
       -we can put initial values or not as we wish 
       -the private(scope) we can access only from this file */ 

   private String name;
   private int stars;
   private double health;
     // 🥷 Constructor : in java is a (specific ) method used to initialize objects.
    // 🥷 in python def __init__(self,parms) / in js : constructor(name){this.name = name}
    // 🥷 in java No return type: Constructors do not have a return type, not even void

    // 🥷  //use always this keyword as standard // //use this to point always to something in the class instance    
 public Ninja(String name){
    this.name=name;
    this.stars=10;
    this.health=100.0;
 }



 // 🥷 when we use the private access modifier for the attributes we should declare our getters and setters to 
 // 🥷 Access them : to show or to modify them
// 🥷  Getter in Java: Getter returns the value
// 🥷 Setter in Java: While Setter sets or updates the value
 // 🥷 Getters and setters are methods 


 // 🥷 Name getter
 public String getName(){
    return this.name;
 }
// 🥷 Name setter
public void setName(String newName){
    this.name=newName;
}

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    // 🥷 Attack method
    public void attack(Ninja target){
        // 🥷 the stars of the attacker will decrease by 1
        this.setStars(this.getStars()-1);
        // 🥷 the health of the target will decrease by 10
        target.setHealth(target.getHealth()-10.0);
    }
    // 🥷 display info method
    public String displayInfos(){
        String infos=String.format("Ninja Name: %s \n Stars : %s \n Health: %s",this.getName(),this.stars,health );
        return infos;
    }
// 🥷 Restart Method
public void restart(){
    // 🥷 reset the health to 100.0
    this.setHealth(100.0);
    // 🥷 reset the stars to 10
    this.setStars(10);
}

// 🥷 Restart Method overload : with different params
public void restart(String msg){
    System.out.println(msg);
    // 🥷 reset the health to 100.0
    this.setHealth(100.0);
    // 🥷 reset the stars to 10
    this.setStars(10);
}

// 🥷 Static method : A method that belongs to the class not the instances 
// 🥷 PS : we can access it from instance but it's not a good practice ; it can cause conflicts

public static void staticDemo(String name1,String name2){
    Ninja n1=new Ninja(name1);
    Ninja n2=new Ninja(name2);
    n1.attack(n2);
   System.out.println( n1.displayInfos());
   System.out.println( n2.displayInfos());
    System.out.println("this is a static method !! ^^");
}

}