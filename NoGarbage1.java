public class NoGarbage1 {
    public static void main(String[] args) {
        int iterations = 100_000; // Number of iterations for string operations

        System.out.println("Starting NoGarbage demonstration...\n");

        // Efficient string operations using StringBuilder
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(" World"); // Appends to the same object
            if (i % 10_000 == 0) {
                System.out.println("Progress: " + i + " iterations");
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\nStringBuilder operation completed.");
        System.out.println("Final String Length: " + sb.length()); // Display the length of the result
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

        // Confirm program completion
        System.out.println("\nProgram finished quickly. No unnecessary garbage created!");
    }
}
