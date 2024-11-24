public class Aims {
    public static void main(String[] args) {                    //Từ Vi Tuệ MSSV: 20225944
        Cart anOrder = new Cart();

        // Tạo các đối tượng DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", null, 0, 18.99f);

        // Thêm các DVD vào giỏ hàng
        anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        // In giỏ hàng
        anOrder.printCart();
    }
}
