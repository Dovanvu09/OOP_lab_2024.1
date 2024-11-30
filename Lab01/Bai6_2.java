import java.util.Scanner;

public class Bai6_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Tên của bạn là gì?");
        String strName = keyboard.nextLine();
        System.out.println("Bạn bao nhiêu tuổi?");
        int iAge = keyboard.nextInt();
        System.out.println("Chiều cao của bạn là bao nhiêu?");
        double dHeight = keyboard.nextDouble();
        System.out.println("Cô/Chị " + strName + ", " + iAge + " tuổi. " + "Chiều cao của bạn là " + dHeight + " mét.");
    }
}
