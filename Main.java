public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(sum(arr, 0)+"\n");

        int n = 1;
        int d = 1;

        System.out.println(div(n, d) + "\n");

        n = 123;
        System.out.println(sumaDigitos(n) + "\n");

        System.out.println(multi(arr, 0) + "\n");

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumaMat(mat, 0, 0) + "\n");
        
        int[] vector = {4, 2, 5, 1, 3, 6, 6};
        System.out.println(minimVector(vector, 0));
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

    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumaDigitos(n / 10);
    }

    public static int multi(int[] arr, int pos) {
        if (pos == arr.length) {
            return 1;
        }
        return arr[pos] * multi(arr, pos + 1);
    }

    public static int sumaMat(int[][] mat, int posX, int posY) {
        if (posX == mat.length) {
            return 0;
        }
        if (posY == mat[posX].length) {
            return sumaMat(mat, posX + 1, 0);
        }
        return mat[posX][posY] + sumaMat(mat, posX, posY + 1);
    }

    public static int minimVector(int[] vector, int pos) {
        if (pos < vector.length) {
            int min = minimVector(vector, pos + 1);
            if (vector[pos] < min) {
                return vector[pos];
            }
            return min;
        }
        return Integer.MAX_VALUE;
    }
}