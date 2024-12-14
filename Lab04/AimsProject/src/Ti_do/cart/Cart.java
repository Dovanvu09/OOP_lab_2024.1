// Đỗ Văn Vũ 20225956

package Ti_do.cart;

import Ti_do.media.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; // Số lượng tối đa đĩa DVD trong giỏ hàng

    // Mảng lưu các đĩa DVD được thêm vào giỏ hàng
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0; // Số lượng đĩa DVD hiện có trong giỏ hàng

    // Hàm thêm đĩa DVD vào giỏ hàng
    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more discs.");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The DVD \"" + disc.getTitle() + "\" has been added!");
            return 1;
        }
    }

    // Hàm thêm đĩa vào giỏ hàng theo List với số lượng tùy ý


    // Hàm thêm 2 đĩa DVD
    public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more discs.");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The DVD \"" + dvd1.getTitle() + "\" has been added!");

            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The DVD \"" + dvd2.getTitle() + "\" has been added!");

            return 2; // Trả về số đĩa DVD đã thêm được
        }
    }
    public int addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int addCount = 0;
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full. Can't add more discs.");
                break;
            } else {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The DVD \"" + disc.getTitle() + "\" has been added!");
                addCount++;
            }
        }
        return addCount; // Trả về số lượng DVD đã thêm vào giỏ hàng
    }
    
    

    // Hàm xóa đĩa DVD khỏi giỏ hàng
    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) { // Kiểm tra xem giỏ hàng có trống không
            System.out.println("Your cart is empty!");
            return 0;
        }

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) { // Tìm thấy DVD cần xóa
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1]; // Di chuyển các phần tử còn lại lên vị trí trước
                }
                itemsOrdered[qtyOrdered - 1] = null; // Xóa phần tử cuối cùng trong mảng sau khi di chuyển
                qtyOrdered--; // Giảm số lượng mặt hàng trong giỏ
                System.out.println("Remove DVD \"" + disc.getTitle() + "\" successfully!");
                return 1;
            }
        }

        System.out.println("No DVD match!");
        return 0;
    }

    // Hàm tính tổng giá tiền đĩa
    public float totalCost() {
        float sum = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    // Hàm in giỏ hàng
 // Method to print the cart details
public void printCartDetails() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (int i = 0; i < qtyOrdered; i++) {
        System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
    }
    System.out.println("Total cost: " + totalCost() + " $");
    System.out.println("***************************************************");
}

// Method to search DVDs by ID
public void searchDVDById(int id) {
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i].getId() == id) {
            System.out.println("DVD found: " + itemsOrdered[i].toString());
            return;
        }
    }
    System.out.println("No DVD found with ID: " + id);
}

// Method to search DVDs by title
public void searchDVDByTitle(String title) {
    boolean found = false;
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i].isMatch(title)) {
            System.out.println("Match found: " + itemsOrdered[i].toString());
            found = true;
        }
    }
    if (!found) {
        System.out.println("No match found for title: " + title);
    }
}

}
