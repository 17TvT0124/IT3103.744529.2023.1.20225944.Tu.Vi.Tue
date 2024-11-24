public class NoGarbage {
    public static void main(String[] args) {
        int iterations = 100_000; // Number of iterations for string operations

        System.out.println("Starting NoGarbage demonstration...\n");

        // Using StringBuilder to avoid garbage creation
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(" World"); // Modifies the same object without creating garbage
            if (i % 10_000 == 0) {
                System.out.println("Progress: " + i + " iterations");
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\nStringBuilder operation completed.");
        System.out.println("Final String: " + sb.substring(0, 50) + "..."); // Print a preview of the result
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println("\nGarbage creation minimized by using StringBuilder.");
    }
}
