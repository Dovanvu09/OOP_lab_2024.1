package Ti_do;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo cửa hàng
        Store store = new Store();

        // Tạo các DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Avengers", "Action", "Joss Whedon", 143, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Avatar", "Adventure", "James Cameron", 162, 21.99f);

        // Thêm DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // In danh sách DVD trong cửa hàng
        store.printStore();

        // Xóa một DVD khỏi cửa hàng
        store.removeDVD(dvd2);

        // In lại danh sách DVD trong cửa hàng
        store.printStore();

        // Thử xóa một DVD không tồn tại
        store.removeDVD(new DigitalVideoDisc("Titanic", "Drama", "James Cameron", 195, 9.99f));
    }
}
