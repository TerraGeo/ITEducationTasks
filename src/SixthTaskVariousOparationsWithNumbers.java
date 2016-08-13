import java.util.Arrays;

/**
 * Created by Billy on 8/4/2016.
 */
public class SixthTaskVariousOparationsWithNumbers {
    public static void main(String[] args) {
        int array[] = new int[args.length];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(args[i]);
        }
        arithmeticalMean(array);
        insertionSort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        uniqueThreeDigitNumber(array);
        divisionByKValue(args, 5);
        pairCheck(args);
    }

    public static void pairCheck(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0) {
                System.out.println(arr[i] + " isPair");
            } else System.out.println(arr[i] + " isUnpaired");
        }
    }

    public static void divisionByKValue(String arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if ((Integer.parseInt(arr[i]) - ((Integer.parseInt(arr[i]) / k) * k)) == 0) {
                System.out.println(arr[i] + " " + String.format("is Divided by %d", k));
            }
        }
    }

    public static void uniqueThreeDigitNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (Integer.toString(arr[i]).length() == 3) {
                if (((arr[i] / 100) != (arr[i] % 10) && (arr[i] / 100) != ((arr[i] % 100) / 10))
                        && ((arr[i] % 100) / 10) != (arr[i] % 10)) {
                    System.out.println(arr[i]);
                }
            }
        }
    }


    public static void arithmeticalMean(int array[]) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 1] == ((array[i] + array[i + 2]) / 2))
                System.out.println(array[i + 1]);
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElem){
                arr[prevKey+1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey+1] = currElem;
        }
    }
}
