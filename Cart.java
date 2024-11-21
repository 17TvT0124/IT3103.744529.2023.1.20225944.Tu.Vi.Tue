import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> items = new ArrayList<>();

    // Thêm DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.size() < 20) {
            items.add(disc);
            System.out.println("The disc has been added: " + disc.getTitle());
        } else {
            System.out.println("The cart is full!");
        }
    }

    // Xóa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.remove(disc)) {
            System.out.println("The disc has been removed: " + disc.getTitle());
        } else {
            System.out.println("The disc is not in the cart.");
        }
    }

    // Tính tổng giá tiền của giỏ hàng
    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : items) {
            total += disc.getCost();
        }
        return total;
    }
}
