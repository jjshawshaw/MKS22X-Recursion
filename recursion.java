public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
        if (n == 0) return 0;
        return sqrtH(n, 1.0);
    }
    private static double sqrtH(double n, double g){
      if (Math.abs(((g * g) - n) / n) < 0.00001) return g;
      else return sqrtH(n, (n / g + g) / 2);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
    }

}