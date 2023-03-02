import java.util.Arrays;
import java.util.Random;

public class ArrayMax {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 9);
        }


        System.out.println("Max value is " +  Arrays.stream(arr).max().getAsInt() + " in " + Arrays.toString(arr));


    }
}
