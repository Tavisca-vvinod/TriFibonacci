import java.util.Arrays;

public class TriFib {
    public static void main(String[] args)
    {
        System.out.println("{1,2,3,-1} ::: 6 --> "+(complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
        System.out.println("{10, 20, 30, 60, -1 , 200} ::: 110 --> "+(complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
        System.out.println("{1, 2, 3, 5, -1}  ::: -1 -->  "+(complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
        System.out.println("{1, 1, -1, 2, 3} ::: -1 --> "+(complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
        System.out.println("{-1, 7, 8, 1000000}  ::: 999985 --> "+(complete(new int[]{-1, 7, 8, 1000000})==999985 ? "PASS" : "FAIL"));
    }
    private static int complete(int[] numbers) {

        int indexOfMissingNumber= indexOf(numbers);
        int missingDigit=-1;
        if(indexOfMissingNumber>=3)
        {
            int[] generatedFibonacci= generateFibonacci(numbers);
            for(int i=0;i<generatedFibonacci.length;i++)
            {
                if(generatedFibonacci[i]!=numbers[i] && i!=indexOfMissingNumber) {
                    return -1;
                }
            }
            missingDigit=generatedFibonacci[indexOfMissingNumber];
        }
        else
        {
            numbers[indexOfMissingNumber]= numbers[3]-(sumOfOtherTwoNumbers(numbers,indexOfMissingNumber));
            if(validateFibonacci(numbers))
            {
                missingDigit=numbers[indexOfMissingNumber];
            }
        }
        if(missingDigit>0)
        {
            return missingDigit;
        }
        return -1;
    }

    private static int sumOfOtherTwoNumbers(int[] numbers, int i) {
        if(i==0)
        {
            return numbers[1]+numbers[2];
        }
        if(i==1)
        {
            return numbers[0]+numbers[2];
        }
        if(i==2)
        {
            return numbers[0]+numbers[1];
        }
        return 0;
    }

    private static int[] generateFibonacci(int[] numbers)
    {
        int[] generatedFibonacci=new int[numbers.length];
        for(int i=0;i<numbers.length;i++)
        {
            if(i<3)
            {
                generatedFibonacci[i]=numbers[i];
            }
            else
            {
                generatedFibonacci[i]=generatedFibonacci[i-1]+generatedFibonacci[i-2]+generatedFibonacci[i-3];
            }
        }
        return generatedFibonacci;
    }
    private static int indexOf(int[] numbers)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==-1)
            {
                return i;
            }
        }
        return 0;
    }
    private static boolean validateFibonacci(int [] numbers)
    {
        boolean valid=true;
        for(int i=3;i<numbers.length;i++)
        {
            if(numbers[i]!=numbers[i-1]+numbers[i-2]+numbers[i-3])
            {
                valid=false;
                break;
            }
        }
        return valid;
    }
}
