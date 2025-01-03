
// Đỗ Văn Vũ 20225956

package Ti_do;

import Ti_do.cart.Cart;
import Ti_do.media.DigitalVideoDisc;

public class AIMS {
	public static void main(String[] args) {
		// Tạo giỏ hàng trống
		Cart anOrder = new Cart();

		// Thêm đĩa vào giỏ hàng
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);

		// Kiểm tra khi chưa thực hiện hàm xoá

		// Kiểm tra khi dã thực hiện hàm xoá
		anOrder.removeDigitalVideoDisc(dvd2);
		// Hàm System.out.printf() định dạng như ngôn ngữ C/C++
		System.out.printf("Total cost is: %.2f", anOrder.totalCost());
	}
}