import java.util.Scanner;
/**
 * Bai2_2_5
 * Chương trình tính toán các phép toán cơ bản giữa hai số thực.
 */
public class Bai2_2_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();  // Nhập số thực thứ nhất
        double b = sc.nextDouble();  // Nhập số thực thứ hai
        System.out.println("Tổng = " + (a + b));  // In ra tổng của hai số
        System.out.println("Hiệu = " + (a - b));  // In ra hiệu của hai số
        System.out.println("Tích = " + (a * b));  // In ra tích của hai số
        System.out.println("Thương = " + (a / b));  // In ra thương của hai số
    }
}
