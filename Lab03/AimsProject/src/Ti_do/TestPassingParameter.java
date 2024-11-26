package Ti_do;

public class TestPassingParameter {
    public static void main(String[] args) {
        // Tạo 2 đối tượng DVD
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // In tiêu đề trước khi gọi phương thức swap
        System.out.println("Before swapping:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Thực hiện hoán đổi
        swap(jungleDVD, cinderellaDVD);

        // In tiêu đề sau khi gọi phương thức swap
        System.out.println("After swapping:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Thay đổi tiêu đề của JungleDVD
        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        // In tiêu đề sau khi thay đổi tiêu đề
        System.out.println("After changing title:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
    }

    // Phương thức hoán đổi (không thành công vì Pass by Value)
    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
        DigitalVideoDisc temp = o1;
        o1 = o2;
        o2 = temp;
    }

    // Phương thức thay đổi tiêu đề của một DVD
    public static void changeTitle(DigitalVideoDisc dvd, String newTitle) {
        dvd.setTitle(newTitle);
    }
}
