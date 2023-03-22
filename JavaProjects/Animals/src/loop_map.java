import java.util.Scanner;
import java.util.Arrays;

public class loop_map {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int myarray[] = new int[5];
        int sum = 0;
        int product = 1;

        for (int i = 0; i < 5; i++) {
            myarray[i] = input.nextInt();
            sum = sum + myarray[i];
            product = product * myarray[i];
        }

        for (int i = 0; i < myarray.length; i++) {
            System.out.println("you entered " + myarray[i]);
        }
        Arrays.sort(myarray);
        System.out.println("Sum is " + sum);
        System.out.println("product is " + product);
        System.out.println("the smallest number is " + myarray[0]);
    }
}
