public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(sum(arr, 0));
    }

    public static int sum(int[] arr, int pos) {
        if (pos == arr.length) {
            return 0;
        }
        return arr[pos] + sum(arr, pos + 1);
        
    }
}