public class Methods {
    public void greeting() {
        System.out.println("Hello world");
    }
//Casting
    public void implicitTypeCastingExample() {

        int i = 10;
        double d = 20.25;

        double result = i + d; 
    }

    public void explicitTypeCastingExample() {

        Double dd = 10.35;
        // int i = (int) dd; 

        String doubleNum = dd.toString();

    }

    // Methods -> access (static) return type name (parameters)
    public int countAndSum(int end) {
        int result = 0;
        for (int i = 1; i < end; i++) {
            result+=i;
        }

        return result;
    }

    
    // Overloading - as long as the parameter types are different,you can use the same name
        public void countAndSum(int i, int j) {
            // I can loop through the array instead and get a similar result
            // return ;
            System.out.println(i + j);
        }
    // signatures -> name of the method and the arguments passed in
        

}
