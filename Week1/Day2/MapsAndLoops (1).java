import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
public class MapsAndLoops {
    public static void main(String[] args) {
        HashMap<String,String> studentHash = new HashMap<>();
        //object include some methods 
        studentHash.put("student1@mail.com", "student1");
        studentHash.put("student2@mail.com", "student2");
        studentHash.put("student3@mail.com", "student3");
        System.out.println(studentHash);
        System.out.println(studentHash.get("student1@mail.com"));

        // return Set<String>
        Set<String> keys = studentHash.keySet();
        System.out.println(keys);
        for(String key:keys){
           System.out.println(studentHash.get(key)); 
        }

        int nums[] = {1,2,3,4,5};

        //loops for loop 
        for (int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        //while loop
         int j =0;
         while(j<nums.length){
            System.out.println(nums[j]);  
            j++;
         }
//foreach
         ArrayList<String> listOfKeys = new ArrayList<>();
         listOfKeys.add("Ali");
         listOfKeys.add("Yaya");
         listOfKeys.add("Wael");
         listOfKeys.add("Testa");

         for (String string : listOfKeys) {
            System.out.println(string);  
         }
         
         // Hashmaps = Objects = Dictionaries 
    public void displayHashMap() {
        HashMap<String, String> names = new HashMap<>();

        // Add to HashMap
        names.put("0", "Java");
        names.put("1", "C#");
        names.put("2", "Javascript");
        names.put("3", ".net");
        names.put("4", "C");

        // Getting value by keys
        String java = names.get("0");
        System.out.println(java);
        System.out.println(names);

        // keySet
        names.keySet(); // returns a set of the key names
   //enhanced for loop
        for (String key : names.keySet()) {
            System.out.println(names.get(key));
        }

    }
}
