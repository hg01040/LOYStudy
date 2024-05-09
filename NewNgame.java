import java.util.Random;
import java.util.Scanner;

public class NewNgame {
    public static void main(String[] args) {
        Random a = new Random();
        Scanner scanner = new Scanner(System.in);
        int [] Exam = new int[10];
        int [] Guess = new int[10];
        int wrong[][] = new int[2][10];
        while (true) {
            int correct = 0;
            for (int n = 0; n < Exam.length; n++) {
                int b = a.nextInt(10, 100);
                int c = a.nextInt(10, 100);
                Exam [n] = b + c;
                System.out.println("문제 " + (n + 1));
                System.out.println("값을 맞춰보세요.");
                System.out.print(b + " + " + c + " = " + " ? " + "--> ");
                Guess [n] = scanner.nextInt();
                if (Exam[n] == Guess[n]) {
                    correct++;
                }
            }
            System.out.println("성적 " + correct +"/10" + "점");
            System.out.println("오답");
            System.out.print("다시 시작하시겠습니까?(y/n) >> ");
            if (scanner.next().equals("n")) break;
        }
    }
}