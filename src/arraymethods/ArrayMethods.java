
package arraymethods;
import java.util.Scanner;

public class ArrayMethods {

    public static int max(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        return max;
    }

    public static int min(int[] a) {
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }

        return min;
    }

    public static int sum(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = input.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = input.nextInt();
        }

        System.out.println("Max = " + max(a));
        System.out.println("Min = " + min(a));
        System.out.println("Sum = " + sum(a));

        double avg = (double) sum(a) / n;
        System.out.println("Average = " + avg);

        System.out.print("Array Elements: ");
        print(a);
    }
}