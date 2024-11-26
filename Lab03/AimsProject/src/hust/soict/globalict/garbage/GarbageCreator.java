package hust.soict.globalict.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create garbage: " + (endTime - startTime) + " ms");

        // Tối ưu bằng StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder efficient = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            efficient.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");
    }
}
