
import java.util.*;
public class HashMapTest {
    public static void main(String[] args) {
         // 🥷 HashMap : is a part of java.util package 
    // 🥷 similar to dictionnary in python // or object in javascript 
    // 🥷 HashMap<type(key),type(value)> name = new HashMap<>();
    HashMap<String,Integer> studentHash = new HashMap<>();
    studentHash.put("Idriss", 6253425);
    studentHash.put("Wael", 20202020);
    studentHash.put("Malek", 1111111111);
  
    // studentHash.put("Malek", 202020222);
    
    System.out.println(studentHash);
    System.out.println(studentHash.get("Malek"));
    
    // 🥷  the Set : in java is a collection that does not allow duplication

    Set<String> keys=studentHash.keySet();
    System.out.println(keys);
    // 🥷 forEach in Java
    for (String oneKey :keys){
        System.out.println(studentHash.get(oneKey));
    }
}
    }
   
