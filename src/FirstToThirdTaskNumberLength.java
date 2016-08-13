import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Billy on 8/5/2016.
 */
public class FirstToThirdTaskNumberLength {
    public static void main(String[] args) {
        int arrayOfNumbers[] = new int[args.length];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers));
        lengthOfNumberChecking(arrayOfNumbers);
    }

    public static void lengthOfNumberChecking(int array[]) {
        double middleLength = 0;
        String arrayOfStrings[] = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOfStrings[i] = Integer.toString(array[i]);
            middleLength += arrayOfStrings[i].length();
        }
        middleLength /= array.length;
        System.out.println("Middle length is " + middleLength);
        for (int i = 0; i < arrayOfStrings.length; i++) {
            if ((double) arrayOfStrings[i].length() < middleLength) {
                System.out.println("Middle length of current number is shorter " + arrayOfStrings[i]);
            }
        }
    }
}
