public class FibCompleter {
    public static int complete(int[] numbers) {
        int indexOfMissingNumber= indexOf(numbers);
        int missingDigit=-1;
        if(indexOfMissingNumber>=3)
        {
            int[] generatedFibonacci= FibGeneratorValidator.generateFibonacci(numbers);
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
            if(FibGeneratorValidator.validateFibonacci(numbers))
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
        int sum=0;
        for(int j=0;j<=2;j++){
            if(j==i){continue;}
            sum=sum+numbers[j];
        }
        return sum;
    }
    private static int indexOf(int[] numbers)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==-1) { return i; }
        }
        return 0;
    }
}
