import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    // Add a DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered.add(disc);
        System.out.println("Added DVD: " + disc.getTitle());
    }

    // Print the contents of the cart
    public void printCart() {
        System.out.println("*********** CART CONTENTS ***********");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc disc = itemsOrdered.get(i);
            System.out.println((i + 1) + ". DVD - " + disc.getTitle() + " - " + disc.getCategory() + 
                               " - " + disc.getDirector() + " - " + disc.getLength() + " minutes - " + 
                               disc.getCost() + "$");                  
        }
        System.out.printf("Total cost: %.2f$\n", totalCost());
        System.out.println("*********************************************"); 
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... discs) {
        for (DigitalVideoDisc disc : discs) {
            addDigitalVideoDisc(disc);
        }
    }

    // Search for a DVD by ID
    public DigitalVideoDisc searchById(int id) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.getId() == id) {
                return disc;
            }
        }
        System.out.println("No DVD found with ID: " + id);
        return null;
    }

    // Search for a DVD by title
    public DigitalVideoDisc searchByTitle(String title) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.isMatch(title)) {
                return disc;
            }
        }
        System.out.println("No DVD found with title: " + title);
        return null;
    }

    // Calculate the total cost of the cart
    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }
}
