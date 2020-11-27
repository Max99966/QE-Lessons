package Lesson8;

import java.io.IOException;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        String[] read = FileService.read("C:\\Users\\Administrator\\Desktop\\QE Classes\\Homeworks\\test.txt");
        System.out.println(Arrays.toString(read));

        

    }


}
