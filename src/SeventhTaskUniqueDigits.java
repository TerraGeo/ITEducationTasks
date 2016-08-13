import java.util.*;

/**
 * Created by Billy on 8/6/2016.
 */
public class SeventhTaskUniqueDigits {
    public static void main(String[] args) {
        int numbers[] = new int[args.length];
        List<Integer> listOfUniqueDigits = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            if (isConsistsOfUniqueDigits(numbers[i]))
                listOfUniqueDigits.add(numbers[i]);
        }
        System.out.println(listOfUniqueDigits);
    }

    public static boolean isConsistsOfUniqueDigits(int number) {
        int array[] = splitNumberToDigits(number);
        Set <Integer> uniqueArray = new TreeSet<>();
        for (int i = 0; i < array.length; i++){
            uniqueArray.add(array[i]);

        }
        return uniqueArray.size() == array.length;
    }

    public static int[] splitNumberToDigits(int number) {
        String numberAsArrayOfStrings[] = String.valueOf(number).split("");
        int[] numberAsArray = new int[Integer.toString(number).length()];
        for (int i = 0; i < Integer.toString(number).length(); i++)
            numberAsArray[i] = Integer.parseInt(numberAsArrayOfStrings[i]);
        return numberAsArray;
    }
}
