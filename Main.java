public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(sum(arr, 0)+"\n");

        int n = 1;
        int d = 1;

        System.out.println(div(n, d));
    }

    public static int sum(int[] arr, int pos) {
        if (pos == arr.length) {
            return 0;
        }
        return arr[pos] + sum(arr, pos + 1);
        
    }

    public static int div(int n, int d) {
        if (n < d) {
            System.out.println("Residu:" + n);
            return 0;
        }
        return 1 + div(n - d, d);
    }
}