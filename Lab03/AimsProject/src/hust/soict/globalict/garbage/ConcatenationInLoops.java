package hust.soict.globalict.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        // Sử dụng String (+ operator)
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with String (+ operator): " + (endTime - startTime) + " ms");

        // Sử dụng StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(i); // Nối trực tiếp vào bộ nhớ đệm
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ms");

        // Sử dụng StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i); // Nối trực tiếp vào bộ nhớ đệm
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");
    }
}
