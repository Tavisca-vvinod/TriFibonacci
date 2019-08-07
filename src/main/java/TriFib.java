public class TriFib {
    public static void main(String[] args)
    {
        System.out.println("The missing number is "+complete(new int[] {1,2,3,-1,11,20}));
    }
    private static int complete(int[] numbers) {

        int indexOfMissingNumber= indexOf(numbers);
        if(indexOfMissingNumber>=3)
        {
            int[] generatedFibonacci= generateFibonacci(numbers);
            for(int i=0;i<generatedFibonacci.length;i++)
            {
                if(generatedFibonacci[i]!=numbers[i] && i!=indexOfMissingNumber) {
                    return -1;
                }
            }
            return generatedFibonacci[indexOfMissingNumber];
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
