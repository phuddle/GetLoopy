public class partB {
    public static void main(String[] args) {
        for (int a = 0; a <= 5; a++) //a starts at 0 and counts up to 30
        {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int c = 5; c >= 1; c--) //c starts at 0 and counts up to 30
        {
            for (int d = 1; d <= c; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int e = 1; e <= 5; e++) //c starts at 0 and counts up to 30
        {
            for (int f = 1; f <= 5; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
