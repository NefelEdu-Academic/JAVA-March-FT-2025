
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndArrayList{
public static void main(String[] args) {
    // 🥷 Fixed Array : How To declare it 
    // 🥷 : fixed length : / one data type /there is no push and pop 
    // 🥷 First declaration : type[] name=new type[length]
    int[] intArray=new int[5];

    // 🥷 second one  :  type[] name = {1,2,3}
    int[] secondArray = {1,2,5,74,5};
    System.out.println(intArray[0]);
    System.out.println(secondArray.length);
    // 🥷 if we want to print the array with square brackets
    System.out.println(Arrays.toString(secondArray));
    //System.out.println(intArray[12]);
// 🥷 forLoop in Java 
for(int i = 0;i<5;i++){
    System.out.println(secondArray[i]);
}

    // 🥷 ArrayList( dynamic array ) 
    // 🥷 declaration : ArrayList<type> name = new ArrayList<>();
    ArrayList<Integer> dynamicArray=new ArrayList<>();
    
    System.out.println(dynamicArray);
    // 🥷 how to add values to dynamic array 
    dynamicArray.add(10);
    dynamicArray.add(20);
    dynamicArray.add(30);
    System.out.println(dynamicArray);
    System.out.println(dynamicArray.size());
    dynamicArray.add(1,40);
    System.out.println(dynamicArray);
    dynamicArray.remove(2);
    System.out.println(dynamicArray);
    dynamicArray.set(1,100);
    System.out.println(dynamicArray);
   int gett0= dynamicArray.get(0);
   System.out.println(gett0);
}
}