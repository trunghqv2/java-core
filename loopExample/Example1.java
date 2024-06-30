// vẽ hình vs ky tự *
public class Example1 {
    public static void main(String[] args) {
        Ex4();
    }

    // hcn
    public static void Ex1() {
        int h = 3;
        int w = 5;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // tam giac vuong botton-left
    public static void Ex2() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // tam giac vuong top-left
    public static void Ex3() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // tam giac vuong can
    public static void Ex4() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + i -1 ; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
