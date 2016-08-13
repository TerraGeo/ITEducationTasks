import java.util.Random;

/**
 * Created by Billy on 8/4/2016.
 */
public class ThirdTaskRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayOfRandomNumbers[] = new int[Integer.parseInt(args[0])];
        for (int i = 0; i < arrayOfRandomNumbers.length; i++){
            arrayOfRandomNumbers[i] = random.nextInt(10);
            System.out.print(arrayOfRandomNumbers[i] + " ");
        }
    }
}
