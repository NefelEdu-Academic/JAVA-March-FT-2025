

public class TestGame {
    public static void main(String[] args) {
        NinjaGame ninja1 = new NinjaGame("Eya");
        NinjaGame ninja2 = new NinjaGame("Malek", 250);
       ninja1.getName();
        ninja1.greet();
        ninja1.greet("this is  method overload ");
        ninja1.setName("Idriss");
        ninja1.getName();
        System.out.println(ninja1.getStars());
        ninja1.attack();
        System.out.println(ninja1.getStars());
        ninja1.attack(ninja2);
        System.out.println(ninja1.getStars());
        System.out.println(ninja2.getHealth());
        ninja1.attack(ninja2);
        System.out.println(ninja1.getStars());
        System.out.println(ninja2.getHealth());
       NinjaGame.greet1();  
     }
}
