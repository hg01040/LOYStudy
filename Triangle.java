import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("밑변의 길이를 입력하세요: ");
        double baseline = scanner.nextDouble();
        System.out.print("높이를 입력하세요: ");
        double High = scanner.nextDouble();
        double area = 0.5 * (baseline * High);
        System.out.println("삼각형의 면적은: " + area);

    }
}
