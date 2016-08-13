import java.util.LinkedList;
import java.util.List;

/**
 * Created by Billy on 8/6/2016.
 */
public class FifthTaskPairDigitNumbers {
    public static void main(String[] args) {
        List<String> pairNumbers = new LinkedList<String>();
        for (int i = 0; i < args.length; i++) {
            if (isPairDigit(args[i]))
                pairNumbers.add(args[i]);
        }
        System.out.println(pairNumbers);
    }
    public static boolean isPairDigit(String string){
        return string.matches("[24680]*");
    }
}
