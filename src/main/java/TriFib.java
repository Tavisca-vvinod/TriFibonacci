import java.io.FileInputStream;
import java.util.Arrays;

public class TriFib {
    public static void main(String[] args)
    {
        System.out.println("{1,2,3,-1} ::: 6 --> "+(FibCompleter.complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
        System.out.println("{10, 20, 30, 60, -1 , 200} ::: 110 --> "+(FibCompleter.complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
        System.out.println("{1, 2, 3, 5, -1}  ::: -1 -->  "+(FibCompleter.complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
        System.out.println("{1, 1, -1, 2, 3} ::: -1 --> "+(FibCompleter.complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
        System.out.println("{-1, 7, 8, 1000000}  ::: 999985 --> "+(FibCompleter.complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
    }
}
