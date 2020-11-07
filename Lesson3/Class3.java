package Lesson3;
import java.util.Arrays;
public class Class3 {
    public static void main(String[] args) {
//        int row = 3;
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int[] reverseArray = {14, 56, 78, 567};
//        int[] result = new int[reverseArray.length];
//        for (int i = 0; i < reverseArray.length; i++) {
//            int el = reverseArray[i];
//            int s = 0;
//            while (el != 0) {
//                s = s * 10 + el % 10;
//                el = el / 10;
//            }
//            result[i] = s;
//            System.out.print(el + " ");
//        }

        int[] ar = {46, 7, 4, 46, 7};
        int xo;
        for (int i = 0; i < ar.length - 1; i++) {
            boolean xor = true;
            xo = ar[i] ^ ar[i+1];
            if (xo == 0){
                System.out.println("Ar[" + i + "] is not a duplicate");
            }
        }

//        for (int i = 0; i < ar.length; i++) {
//            boolean duplicate = false;
//            for (int k = 0; k < ar.length; k++) {
//                if (i != k && ar[i] == ar[k]) {
//                    duplicate = true;
//                    System.out.println("Ar[" + i + "] is a duplicate");
//                }
//            }
//            if (!duplicate){
//                System.out.println("Ar[" + i + "] is not a duplicate");
//            }
//        }

    }
}
