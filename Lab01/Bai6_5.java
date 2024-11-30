
import java.util.Arrays;
import java.util.Scanner;

public class Bai6_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        double[] a = new double[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }

        // Sắp xếp mảng
        Arrays.sort(a);

        // Tính tổng và trung bình
        double sum = 0;
        for (double num : a) {
            sum += num;
        }
        double average = sum / n;

        // In ra kết quả
        System.out.println("Sorted array: " + Arrays.toString(a));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);

        scanner.close();
    }
}
