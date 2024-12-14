
// Đỗ Văn Vũ 20225956

package Ti_do.store;



import Ti_do.media.DigitalVideoDisc;



public class Store {
    public static final int MAX_ITEMS = 50; // Số lượng tối đa DVD trong cửa hàng
    private DigitalVideoDisc[] itemsInStore; // Mảng chứa danh sách DVD
    private int qtyInStore; // Số lượng DVD hiện tại trong cửa hàng

    // Constructor
    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
        qtyInStore = 0;
    }

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore >= MAX_ITEMS) {
            System.out.println("The store is full. Cannot add more DVDs.");
            return;
        }
        itemsInStore[qtyInStore] = dvd;
        qtyInStore++;
        System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(dvd)) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1]; // Dịch các phần tử còn lại
                }
                itemsInStore[qtyInStore - 1] = null; // Xóa phần tử cuối
                qtyInStore--;
                System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
                return;
            }
        }
        System.out.println("The DVD \"" + dvd.getTitle() + "\" is not found in the store.");
    }

    // Phương thức in danh sách DVD trong cửa hàng
    public void printStore() {
        System.out.println("********************STORE********************");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        System.out.println("********************************************");
    }
}
