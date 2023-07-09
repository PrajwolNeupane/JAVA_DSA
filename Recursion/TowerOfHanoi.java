package Recursion;

public class TowerOfHanoi {
    static int step = 0;

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        step = step + 1;
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 7;
        towerOfHanoi(n, "src", "help", "dest");
        System.out.println(step);

    }
}
