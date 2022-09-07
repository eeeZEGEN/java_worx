import java.util.Scanner;

public class Harmony_row {

    public static void h_row(int num) {
        int n = 1;
        System.out.printf("Harmony row for number - %d is ", num);
        while (n <= num) {
            System.out.printf("%.5f ", 1.0 / n);
            n++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        h_row(n);
    }
}
