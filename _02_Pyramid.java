public class _02_Pyramid {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            for (int o=0; o < 10 - i; o++) {
                System.out.print(" ");
            }
            for(int j= 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
