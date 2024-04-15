import java.util.Random;
import java.util.Scanner;

public class Ngame {
    public static void main(String[] args) {
        Random a = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int b = a.nextInt(10, 100);
            int c = a.nextInt(10, 100);
            int d = b + c;
            System.out.println("값을 맞추어 보세요.");
            int e = 0;
            while (true) {
                System.out.print(b + " + " + c + " = " + (b + c) + "  --> ");
                e = scanner.nextInt();
                if (e == d) {
                    System.out.println("정답입니다. ");
                    break;
                } else {
                    System.out.println("오답입니다. ");
                }
            }
            System.out.print("다시 시작하시겠습니까?(y/n) >> ");
            if (scanner.next().equals("n")) break;
        }
    }
}