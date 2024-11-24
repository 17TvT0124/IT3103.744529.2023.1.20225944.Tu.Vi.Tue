public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // Try swapping titles of the two DVD objects
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("cinderella DVD title: " + cinderellaDVD.getTitle());

        // Change the title of jungleDVD
        changeTitle(jungleDVD, "New Jungle");
        System.out.println("jungle dvd Title after change: " + jungleDVD.getTitle());
    }

    // This method swaps the titles of two DigitalVideoDisc objects
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tmp = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tmp);
    }

    // This method changes the title of the DigitalVideoDisc object passed in
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title); // Modify the title of the object directly
    }
}

// DigitalVideoDisc class (with constructor)
class DigitalVideoDisc {
    private String title;

    // Constructor that initializes the title
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
