public class DigitalVideoDisc {
    private static int currentId = 1; // Static variable for auto-incrementing ID
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id = currentId++; // Auto-increment ID
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    // Method to check if the title matches (case-insensitive)
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
}
