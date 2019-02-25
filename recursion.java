import java.util.List;
import java.util.ArrayList;


public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      if (n < 0) throw new IllegalArgumentException();
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
      if (n < 0) throw new IllegalArgumentException();
        return fib(0, 1, n);
    }
    private static int fib(int current, int next, int n){
        if (n == 0) return current;
        else return fib(next, current + next, n - 1);
    }

    /*As Per classwork*/

    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> ans = new ArrayList<Integer>();
       return makeAllSums(n, 0, ans);
    }
    private static ArrayList<Integer> makeAllSums(int n, int sum, ArrayList<Integer> ans){
      if (n == 0){
        ans.add(sum);
      }
      else {
        makeAllSums(n - 1, sum, ans);
        makeAllSums(n - 1, sum + n, ans);
      }
      return ans;
    }

    public static void main(String[] args){
      System.out.println(makeAllSums(3));
    }

}
