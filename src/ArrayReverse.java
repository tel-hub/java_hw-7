import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] oddArr = new int[50];
        int[] reverseArr = new int[50];

        for (int i = 0; i < 50; i++) {
            oddArr[i] = (i * 2 + 1);
        }

        for (int k = 0; k < oddArr.length; k++) {
            reverseArr[k] = oddArr[oddArr.length - k - 1];
        }

        System.out.println("Reversed array " + Arrays.toString(reverseArr));
    }
}
