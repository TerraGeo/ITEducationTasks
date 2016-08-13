import java.util.Arrays;

/**
 * Created by Billy on 8/6/2016.
 */
public class EighthTaskFillTheMatrix {
    public static void main(String[] args) {
        int number = 1;
        int matrix [][] = new int[Integer.parseInt(args[0])][Integer.parseInt(args[0])];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = number++;
                System.out.println(matrix[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
