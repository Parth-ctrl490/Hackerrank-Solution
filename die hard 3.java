import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int Test = obj.nextInt();
        for (int i = 0; i < Test; i++) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();
            System.out.println(solve(a, b, c));
        }
        obj.close();
    }

    static String solve(int a, int b, int c) {
        return (c <= Math.max(a, b) && c % gcd(a, b) == 0) ? "YES" : "NO";
    }

    static int gcd(int p, int q) {
        return (p == 0) ? q : gcd(q % p, p);
    }
}
