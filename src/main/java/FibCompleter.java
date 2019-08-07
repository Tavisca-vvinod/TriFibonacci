public class FibCompleter {
    public static int complete(int[] numbers) {
        int indexOfMissingNumber= FibGeneratorValidator.indexOf(numbers);
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
            numbers[indexOfMissingNumber]= numbers[3]-(FibGeneratorValidator.sumOfOtherTwoNumbers(numbers,indexOfMissingNumber));
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
}
