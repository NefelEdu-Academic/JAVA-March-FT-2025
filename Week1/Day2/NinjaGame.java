
public class NinjaGame {
    // 🥷 Memeber Variables / attributes: fields or properties that belong to the class 
    // 🥷 we can initialize them or not in our constructor  
    private String name;
    private Integer health;
    private Integer stars;

    // 🥷 Constructor 
    // 🥷 py : def __init__(self,param1)
    // 🥷 JS: construcor(param){this.param=param}
    
    // 🥷 In java the constructor is a special method (that does not have a return type )
    // 🥷 it takes the name of the class 
   public NinjaGame (String name){
    this.name=name;
    this.health=100;
    this.stars=10;
   }
   // 🥷 Constructor Overload : to give multiple ways to initiate our object 
   public NinjaGame (String name,Integer stars){
    this.name=name;
    this.health=100;
    this.stars=stars;
   }

   // 🥷 Method greet
   public void greet(){
    System.out.println("Hello! ; " +this.name);
   }
   public void greet(String test){
    System.out.println("Hello! ; " +this.name + " "+test);
   }
 // 🥷  method to get ninja name (because the attribute is private)
 public void getName(){
    System.out.println(this.name);
 }
 // 🥷 method to set the new ninja name 
 public void setName(String newName){
    this.name=newName;
 }
public Integer getHealth() {
    return health;
}
public void setHealth(Integer health) {
    this.health = health;
}
public Integer getStars() {
    return stars;
}
public void setStars(Integer stars) {
    this.stars = stars;
}

// 🥷 Attack function 
// 🥷  the star count will decrease by 5 
public void attack(){
    // 🥷 setStars(getStars-5)
    this.stars-=5;
}
public void attack(NinjaGame victim){
    // 🥷 setStars(getStars-5)
    if( this.stars<5){
        System.out.println("You don't have enough stars ");
        
    } else{
        this.stars-=5;
        // 🥷 we will decrease the victim'health by 25
           // 🥷 get the victim health before the attack (we will use the getter for health)
           Integer instantHealth = victim.getHealth();
           Integer healthAfterAttack = instantHealth-25;
        // 🥷 we use the setter to change the victim's health 
        victim.setHealth(healthAfterAttack);
        
        // 🥷  victim.setHealth(victim.getHealth()-25);
    }
    
}
public static void greet1(){
System.out.println("This method belongs to the class directly ; we don't need to initiate");
}
 
}
