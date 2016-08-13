
/**
 * Created by Billy on 8/6/2016.
 */
public class SixthTaskDigitsByOrder {
    public static void main(String[] args) {

        int numbers[] = new int[args.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            if (isDigitsByOrder(numbers[i])) System.out.println(numbers[i]);
        }
    }

    public static boolean isDigitsByOrder(int number) {
        int pointer = 1;
        int[] digits = splitNumberToDigits(number);
        for (int i = 0; i < digits.length - 1; i++){
            if(digits[i] <= digits[i + 1])pointer++;
            else break;
        }
        return pointer == digits.length;
    }

    public static int[] splitNumberToDigits(int number) {
        String numberAsArrayOfStrings[] = String.valueOf(number).split("");
        int[] numberAsArray = new int[Integer.toString(number).length()];
        for (int i = 0; i < Integer.toString(number).length(); i++)
            numberAsArray[i] = Integer.parseInt(numberAsArrayOfStrings[i]);
        return numberAsArray;
    }
}
