
public class Variables {
    public static void main(String[] args) {
        // 🥷 Primitive data Types : Can not be null // more efficient in memory term 
      // 🥷  in JS : var age = 20 
      // 🥷  in JAVA: (access modifier OPTional) type name = value;
      int age=20; // default value : 0;
      boolean test=false; // default : false 
      double double1=20.25; // default value : 0.0 
      char firstChar = 'a'; // default vlue ''
      System.out.println(age+" "+firstChar+ " "+test+double1);

      // 🥷 Non-primitive DataType : wrapper class (for primitive dataType) / Can be null / has build in methods / more memory space 
      // 🥷 Integer / Boolean / Double /String

      Integer age1 = 20;
      Long id =523626L;
      String name ="Hamza";
      int lengthhh=name.length();
      System.out.println(lengthhh);
 // 🥷 Type casting : Make sure to take in consideration the precison loss 
 double d =123.6545446545655;
 float f =(float) d;
 System.out.println(f);

 // 🥷 Overflow and underflow 
 int int1=-199;
 byte b = (byte)int1;
 System.out.println(b);

 // 🥷 Operators
       // 🥷 Math  : 
         // 🥷 * ,+,-,/ ,%
       //comparaison: 
         // 🥷 <,>,==;<=;>=;!==
       //Logical : && , ||, ! 
       
   // 🥷 Conditions in JAVA
   // 🥷 if condition then DoInstructions else DoOtherInstructions
 if(age< 20){
    System.out.println("Hello Boy !! ");
   } else{
    System.out.println("Hello Big-Boy !! ");

   }
boolean isHumain=false;
// 🥷 Declaration => condition ? result if true : resulkt if false
String message=isHumain?"He is Humain !!":"HE is Alien From Mars";
System.out.println(message);

// 🥷 Switch Case 
int month =78;
switch(month){
    case 1:
    case 3:
    case 5:
    case 7: 
    case 8:
    case 10: 
    case 12:
    System.out.println("31 Days");
    break;
    case 4 :
    case 6: 
    case 9: 
    System.out.println("30 Days");
    break;
    default: System.out.println("There is no month In earth ");
    
}

// 🥷  Format a string 
String nameI="Idriss";
int ageI = 25;
System.out.println("My name is "+nameI+" and my age is "+ageI);
String outPut=String.format("My name is %s , and my age is %s",nameI,ageI);
System.out.println(outPut);
    }

    
      
}
