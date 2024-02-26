public class partA {
    public static void main(String[] args) {
        for (int a = 0; a <= 30; a++) //a starts at 0 and counts up to 30
        {
            System.out.printf("%3d |", a);
        }
        System.out.println("\n");

        for (int b = 30; b >= 0; b--) //b starts at 30 and counts down to 0
        {
            System.out.printf("%3d |", b);
        }
        System.out.println("\n");

        for (int c = 0; c <= 18; c += 3) //c starts at 0 and counts up to 18 by 3
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        for (int d = 10; d >= 0; d -= 2) //d starts at 10 and counts down to 0 by 2
        {
            System.out.printf("%3d |", d);
        }
        System.out.println("\n");

    }
}