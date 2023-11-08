import java.lang.reflect.Array;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        double[] fractionalNums = {1.5,2.3,-8.4,3.6,-2.1,1.3,-5.5,-6.3,2.6,-7.4,5.1,-8.2,9.6,-1.7,1.4,};
        double result = 0;
        int lenght = 0;

        for (double middleNum: fractionalNums
        ){
           if(middleNum > 0){
               result += middleNum;
               lenght++;
               System.out.println(lenght);
               System.out.println(result);
               System.out.println("Значение среднеарифмитических чисел" + result/lenght);
            }
        }
    }
}