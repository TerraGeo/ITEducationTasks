package utilsForNinthTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Billy on 8/11/2016.
 */
public class SubTaskHelper {
    public static void getArithmeticalMeanOfTheLine(int array[][]) {
        for (int subArray[] : array) {
            double arithmeticalMean = 0;
            for (int elementOfArray : subArray) {
                if (elementOfArray < 0) elementOfArray *= (-1);
                arithmeticalMean += elementOfArray;
            }
            arithmeticalMean = arithmeticalMean / subArray.length;
            System.out.println("Arithmetical mean of the line is " + arithmeticalMean);
        }
    }

    public static int[][] sortArrayLines(int array[][]) {
        for (int line[] : array) {
            Arrays.sort(line);
        }
        return array;
    }

    public static int[][] rotateMatrixBy90(int array[][]) {
        int turnedArray[][] = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++)
            for (int j = array.length - 1, k = 0; j >= 0 && k < array.length; j--, k++)
                turnedArray[i][k] = array[j][i];
        return turnedArray;
    }

    public static int[][] rotateMatrixBy180(int array[][]) {
        int turnedArray[][] = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                turnedArray[i][j] = array[array.length - 1 - i][array.length - 1 - j];
        return turnedArray;
    }

    public static int[][] rotateMatrixBy270(int array[][]) {
        return rotateMatrixBy180(rotateMatrixBy90(array));
    }

    public static int[][] pushZerosToTheEnd(int array[][]) {
        for (int line[] : array) {
            int index = 0;
            for (int i = 0; i < line.length; i++) {
                if (line[i] != 0)
                    line[index++] = line[i];
            }
            while (index < line.length)
                line[index++] = 0;
        }
        return array;
    }
    public static int[][] getMatrix(String string){
        int value = Integer.parseInt(string);
        int matrix[][] = new int[value][value];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(-value, value);
            }
        }
        return matrix;
    }
}
