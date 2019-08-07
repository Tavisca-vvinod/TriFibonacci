public class FibGeneratorValidator {
    public static boolean validateFibonacci(int [] numbers)
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
    public static int[] generateFibonacci(int[] numbers)
    {
        for(int i=3;i<numbers.length;i++)
        {
            numbers[i]=numbers[i-1]+numbers[i-2]+numbers[i-3];

        }
        return numbers;
    }
    public static int sumOfOtherTwoNumbers(int[] numbers, int i) {
        int sum=0;
        for(int j=0;j<=2;j++){
            if(j==i){continue;}
            sum=sum+numbers[j];
        }
        return sum;
    }
    public static int indexOf(int[] numbers)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==-1) { return i; }
        }
        return 0;
    }
}
