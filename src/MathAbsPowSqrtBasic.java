public class MathAbsPowSqrtBasic {
    public static void main(String[] args) {
        System.out.println("=== Math.abs() ===");
        System.out.println("abs(-15)   = " + Math.abs(-15));
        System.out.println("abs(7)     = " + Math.abs(7));
        System.out.println("abs(-3.14) = " + Math.abs(-3.14));
        System.out.println("abs(0)     = " + Math.abs(0));

        System.out.println("\n=== Math.pow() ===");
        System.out.println("pow(2,10) = " + (int)Math.pow(2,10));
        System.out.println("pow(3,3)  = " + (int)Math.pow(3,3));
        System.out.println("pow(5,0)  = " + (int)Math.pow(5,0));
        System.out.printf( "pow(2,0.5)= %.6f (= sqrt(2))%n", Math.pow(2,0.5));

        System.out.println("\n=== Math.sqrt() ===");
        double[] nums = {1, 4, 9, 16, 25, 2, 3};
        for (double n : nums) System.out.printf("sqrt(%.0f) = %.6f%n", n, Math.sqrt(n));

        // Practical: Pythagorean theorem
        System.out.println("\n=== Pythagorean Theorem (c = sqrt(a²+b²)) ===");
        int[][] sides = {{3,4},{5,12},{8,15},{7,24}};
        for (int[] s : sides) {
            double c = Math.sqrt(Math.pow(s[0],2) + Math.pow(s[1],2));
            System.out.printf("a=%2d b=%2d → c=%.4f%n", s[0], s[1], c);
        }

        // Distance between two points
        System.out.println("\n=== Distance Formula ===");
        double x1=1,y1=2, x2=4,y2=6;
        double dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("(%g,%g) → (%g,%g) = %.4f%n", x1,y1,x2,y2,dist);
    }
}
