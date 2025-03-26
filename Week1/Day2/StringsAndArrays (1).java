
import java.util.ArrayList;
public class StringsAndArrays {
    public static void main(String args []){
        /*put at the begining all the others will be arrays 
        int [] scores,test,hello;*/
        //fixed array declaration specify the capacity from the start ; if we want t ochange it we change directly or array List instead 
         String[] strArray = new String[6];
        System.out.println(Arrays.toString(strArray));

        int[] numArray = { 1, 2, 3, 4, 5, 6 };

        System.out.println(numArray.length);
         int scores []= new int[5];
         ArrayList<Integer> listOfScores = new ArrayList<>();
         //adding numbers
         scores[0]=100;
         listOfScores.add(100);
         scores[1]=200;
         listOfScores.add(200);
         scores[3]=300;
        
        ArrayList<Integer> dynamicNumArray = new ArrayList<>();

        // Add to ArrayList - .add()
        dynamicNumArray.add(10);
        dynamicNumArray.add(20);
        dynamicNumArray.add(30);
        dynamicNumArray.add(40);
        dynamicNumArray.add(50);
        dynamicNumArray.add(0, 100);

        System.out.println(dynamicNumArray.size());

        // Changing values in an ArrayList
        dynamicNumArray.set(2, 300);

        // Remove a value from an ArrayList
        dynamicNumArray.remove(2);

        // get value in ArrayList
        dynamicNumArray.get(0);

        System.out.println(dynamicNumArray);
         System.out.println("Scores :" +scores.length);
         System.out.println("listOfScores :" +listOfScores.size());

         String name = "Alien";
         System.out.println(name.length());
         System.out.println(name.indexOf("l"));
    }
}
