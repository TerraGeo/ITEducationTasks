

/**
 * Created by Billy on 8/6/2016.
 */
public class FourthTaskVariousDigits {
    public static void main(String[] args) {
        checkForSameDigets(args);
    }
    public static void checkForSameDigets(String [] arrayOfString){
        int counter = 0;
        for (int i = 0; i < arrayOfString.length; i++)
            for (int j = 0; j < arrayOfString[i].length() - 1; j++) {
                if (arrayOfString[i].charAt(j) == arrayOfString[i].charAt(j + 1)) {
                    counter++;
                    if (arrayOfString[i].length() - counter == 0 || arrayOfString[i].length() - counter == 1) {
                        System.out.println(arrayOfString[i]);
                    }
                }
            }
    }
}
