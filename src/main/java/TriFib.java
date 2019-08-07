public class TriFib {
    public static void main(String[] args)
    {
        System.out.println("The missing number is "+validateFibonacci(new int[] {1,2,3,6,11}));
    }

    private static int complete(int[] numbers) {

        return -1;
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
