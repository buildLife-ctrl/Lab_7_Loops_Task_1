import java.util.Scanner;

public class LoopsAsCounters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //counts up by 1 from 0 to 30 and prints it
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }

        //counts down by 1 from 30 to 0
        System.out.println();
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }

        //counts up by 3 from 0 to 18
        System.out.println();
        for (int i = 0; i <= 18; i++) {
            System.out.print(i + " ");
            i += 2;
        }

        //counts down by 2 from 10 to 0
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
            i -= 1;
        }
    }
}