import java.util.Scanner;

public class Bai2_2_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chon bai toan can giai:");
        System.out.println("1. Phuong trinh (ax + b = 0)");
        System.out.println("2. He phuong trinh bac nhat hai an");
        System.out.println("3. Phuong trinh bac hai (ax^2 + bx + c = 0)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveFirstDegreeEquation(scanner);
                break;
            case 2:
                solveLinearSystem(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }

        scanner.close();
    }

    // Giải phương trình bậc nhất: ax + b = 0
    public static void solveFirstDegreeEquation(Scanner scanner) {
        System.out.println("Giai phương trinh bac nhat ax + b = 0");
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
    }

    // Giải hệ phương trình bậc nhất hai ẩn:
    // a11 * x1 + a12 * x2 = b1
    // a21 * x1 + a22 * x2 = b2
    public static void solveLinearSystem(Scanner scanner) {
        System.out.println("Giai he phuong trinh bac nhat hai an:");

        System.out.print("Nhap a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Nhap a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Nhap b1: ");
        double b1 = scanner.nextDouble();

        System.out.print("Nhap a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Nhap a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Nhap b2: ");
        double b2 = scanner.nextDouble();

        // Tính các định thức
        double D = a11 * a22 - a12 * a21;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            double x1 = Dx / D;
            double x2 = Dy / D;
            System.out.println("Nghiem cua he phương trinh la: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Giải phương trình bậc hai: ax^2 + bx + c = 0
    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("Giai phuong trinh bac hai ax^2 + bx + c = 0");
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("He so a phai khac 0 -> khong phai la phuong trinh bac hai.");
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem (khong co nghiem thuc).");
        }
    }
}
