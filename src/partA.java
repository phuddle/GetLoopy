public class partA {
    public static void main(String[] args) {
        for (int a = 0; a <= 30; a++) //a starts at 0 and counts up to 30
        {
            System.out.printf("%3d |", a); //prints value of a w/ 3 digit padding and a separator
        }
        System.out.println("\n"); //new line

        for (int b = 30; b >= 0; b--) //b starts at 30 and counts down to 0
        {
            System.out.printf("%3d |", b); //prints value of b w/ 3 digit padding and a separator
        }
        System.out.println("\n"); //new line

        for (int c = 0; c <= 18; c += 3) //c starts at 0 and counts up to 18 by 3
        {
            System.out.printf("%3d |", c); //prints value of c w/ 3 digit padding and a separator
        }
        System.out.println("\n"); //new line

        for (int d = 10; d >= 0; d -= 2) //d starts at 10 and counts down to 0 by 2
        {
            System.out.printf("%3d |", d); //prints value of d w/ 3 digit padding and a separator
        }
        System.out.println("\n"); //new line

    }
}