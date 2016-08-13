import java.util.Arrays;
import static utilsForNinthTask.SubTaskHelper.*;

/**
 * Created by Billy on 8/6/2016.
 */
public class NinthTaskVariousOperationsWithMatrix {
    public static void main(String[] args) {
        int matrix[][] = getMatrix(args[0]);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(sortArrayLines(matrix)));
        getArithmeticalMeanOfTheLine(matrix);
        System.out.println(Arrays.deepToString(rotateMatrixBy90(matrix)));
        System.out.println(Arrays.deepToString(rotateMatrixBy180(matrix)));
        System.out.println(Arrays.deepToString(rotateMatrixBy270(matrix)));
        System.out.println(Arrays.deepToString(pushZerosToTheEnd(matrix)));
    }
}
