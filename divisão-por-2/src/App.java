public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println("Int:   " + i + "/2 = " + i / 2);
                System.out.println("Float: " + i + "/2 = " + (float) i / 2);
            }
        }
    }
}
