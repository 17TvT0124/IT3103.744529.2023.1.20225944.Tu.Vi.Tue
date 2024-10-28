public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Tạo và thêm một số DVD vào giỏ
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("TenkiNoKo", "Anime", "ShinkaiMakoto", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Interstella", "Science Fiction", "Sir Christopher Nolan", 124,
                100f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        cart.removeDigitalVideoDisc(dvd2);
        // Hiển thị tổng chi phí
        System.out.println("Total cost: " + cart.totalCost());
    }
}
