public class AlienTest {
    public static void main(String[] args) {
        // 🥷 Create an Alien instance 
        Alien a1 = new Alien("Yoda");
        // 🥷 we will display the infos 
        a1.displayInfo();

        // 🥷 adding an attack
        a1.addAttack("Force Push");
        a1.addAttack("Lazer Cannon");
        // a1.addAttack("Force Push");
        // a1.addAttack("test");
        
        a1.displayInfo();
        // a1.removeAttack(3);
        // a1.displayInfo();
        // a1.removeAttack("Force Push");
        // a1.displayInfo();
        Alien victim=new Alien("Darth vadre");
        int index = Integer.parseInt(System.console().readLine()) ;
        
        // a1.attack(victim);
        a1.attack(victim,index);
        victim.displayInfo();
    }
}
