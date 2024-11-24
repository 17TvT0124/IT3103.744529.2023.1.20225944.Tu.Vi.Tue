public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create DVDs and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Print the cart contents
        cart.printCart();

        // Search for a DVD by ID
        System.out.println("\n********** SEARCH BY ID **********");
        int searchId = 2; // Search for DVD with ID 2
        DigitalVideoDisc foundById = cart.searchById(searchId);
        if (foundById != null) {
            System.out.println("Found DVD with ID " + searchId + ": " + foundById.getTitle());
        }

        // Search for a DVD by title
        System.out.println("\n********** SEARCH BY TITLE **********");
        String searchTitle = "Star Wars"; // Search for DVD with the title
        DigitalVideoDisc foundByTitle = cart.searchByTitle(searchTitle);
        if (foundByTitle != null) {
            System.out.println("Found DVD with title \"" + searchTitle + "\": " + foundByTitle.getTitle());
        }

        // Display the total cost of the cart
        System.out.println("\n********** TOTAL CART COST **********");
        System.out.println("Total cost: " + cart.totalCost() + "$");
    }
}
