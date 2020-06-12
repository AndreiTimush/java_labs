import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int f = 0;

        for (int i = 1; i < a; i++){
            if (b%i == 0 && c%i == 0 && a%i == 0 ) {
                f = i;
            }
        }
        System.out.println(f);
    }
}
