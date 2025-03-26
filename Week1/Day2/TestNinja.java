public class TestNinja{
    public static void main(String[] args) {
        Ninja ninja1=new Ninja("Yassine");
        System.out.println(ninja1.getName());
        ninja1.setName("Helmi");
        System.out.println(ninja1.getName());
        Ninja ninja2=new Ninja("Aziz");
     System.out.println(ninja1.displayInfos());   
        System.out.println("*************");
       System.out.println(ninja2.displayInfos()); 
        ninja1.attack(ninja2);
        System.out.println(ninja1.displayInfos());   
        System.out.println("*************");
       System.out.println(ninja2.displayInfos()); 
 ninja1.attack(ninja2);
        System.out.println(ninja1.displayInfos());   
        System.out.println("*************");
       System.out.println(ninja2.displayInfos());
       ninja1.restart();
         ninja2.restart();
       System.out.println("*************");
       System.out.println(ninja1.displayInfos());  
       System.out.println("*************");
       System.out.println(ninja2.displayInfos());  
       Ninja.staticDemo("static test","test");
        System.out.println("*************"); System.out.println("*************"); System.out.println("*************");
       ninja1.staticDemo("esta","lafiesta");
       int asciiValue = 65; // ASCII value for 'A' 
       char character = (char) asciiValue; 
       System.out.println("The character for ASCII value " + asciiValue + " is: " + character);
       
    }
}