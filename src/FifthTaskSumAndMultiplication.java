
/**
 * Created by Billy on 8/4/2016.
 */
public class FifthTaskSumAndMultiplication {
    public static void main(String[] args) {
        int sum = 0;
        int multiplication = 1;
        for (int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
            multiplication *= Integer.parseInt(args[i]);
        }
        System.out.println(sum + " " + multiplication);
    }
}
