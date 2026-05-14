package Q6;

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i <= 49; i++) {
            System.out.print(i);
            if (i % 10 == 9) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
