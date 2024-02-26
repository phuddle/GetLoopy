public class partB {
    public static void main(String[] args) {
        for (int a = 0; a <= 5; a++) //a starts at 0 and counts up to 30
        {
            for (int b = 1; b <= a; b++) { //b starts at 1 and counts up to a
                System.out.print("*"); //outputs value of b as asterisks
            }
            System.out.println();
        }
        System.out.println("\n"); //new line
        for (int c = 5; c >= 1; c--) //c starts at 0 and counts up to 30
        {
            for (int d = 1; d <= c; d++) { //d starts at 1 and counts up to c
                System.out.print("*"); //outputs value of d as asterisks
            }
            System.out.println();
        }
        System.out.println("\n"); //new line
        for (int e = 1; e <= 5; e++) //c starts at 0 and counts up to 30
        {
            for (int f = 1; f <= 5; f++) { //f starts at 1 and counts up to 5
                System.out.print("*"); //outputs value of f as asterisks
            }
            System.out.println();
        }
    }
}
