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
}
