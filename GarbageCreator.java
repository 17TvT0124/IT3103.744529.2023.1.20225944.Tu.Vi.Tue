public class GarbageCreator {
    public static void main(String[] args) {
        int iterations = 100_000; // Number of iterations for string operations

        System.out.println("Starting comparison of String and StringBuilder...\n");

        // Test String (Garbage-prone)
        long startTimeString = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < iterations; i++) {
            str += " World"; // Generates new objects in each iteration
        }
        long endTimeString = System.currentTimeMillis();
        System.out.println("String operation completed.");
        System.out.println("Time taken with String: " + (endTimeString - startTimeString) + " ms");

        // Test StringBuilder (Garbage-efficient)
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(" World"); // Modifies the same object
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("\nStringBuilder operation completed.");
        System.out.println("Time taken with StringBuilder: " + (endTimeStringBuilder - startTimeStringBuilder) + " ms");

        // Explicit garbage collection request
        System.out.println("\nRequesting garbage collection...");
        System.gc();

        // Final message
        System.out.println("Garbage collection requested. Program complete.");
    }
}
