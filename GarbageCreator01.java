public class GarbageCreator01 {
    public static void main(String[] args) {
        int iterations = 50_000; // Reduced iterations for testing
        System.out.println("Starting comparison of String and StringBuilder...\n");

        // Test String
        long startTimeString = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < iterations; i++) {
            str += " World"; // Creates excessive garbage
            if (i % 10_000 == 0) {
                System.out.println("String progress: " + i + " iterations");
            }
        }
        long endTimeString = System.currentTimeMillis();
        System.out.println("String operation completed.");
        System.out.println("Time taken with String: " + (endTimeString - startTimeString) + " ms");

        // Test StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(" World");
            if (i % 10_000 == 0) {
                System.out.println("StringBuilder progress: " + i + " iterations");
            }
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("StringBuilder operation completed.");
        System.out.println("Time taken with StringBuilder: " + (endTimeStringBuilder - startTimeStringBuilder) + " ms");

        // Request garbage collection
        System.out.println("\nRequesting garbage collection...");
        System.gc();
        System.out.println("Garbage collection requested. Program complete.");
    }
}
