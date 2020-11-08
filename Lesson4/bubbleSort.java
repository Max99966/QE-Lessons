package Lesson4;

public class bubbleSort {
    public static void main(String[] args) {
        int[] bubbleArray = {5, 2, 10, -10, 3, 0, 1};
        for (int i = 0; i < bubbleArray.length; i++) {
            for (int j = 0; j < bubbleArray.length - i - 1; j++) {
                if (bubbleArray[j] > bubbleArray[j + 1]) {
                    int t = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = t;
                }
            }
        }
        for (int x : bubbleArray) {
            System.out.print(x + " ");
        }
    }
}
