public class Q2_MaximumSumPath {
    public static int maxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        
        int sumX = 0;
        int sumY = 0;
        int i = 0;
        int j = 0;
        int result = 0;

        
        while (i < m && j < n) {
            // If current elements are equal, updating the result
            if (X[i] == Y[j]) {
                result += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
            
            else if (X[i] < Y[j]) {
                sumX += X[i];
                i++;
            }
            
            else {
                sumY += Y[j];
                j++;
            }
        }

        // Add remaining elements from X, if any
        while (i < m) {
            sumX += X[i];
            i++;
        }

        // Add remaining elements from Y, if any
        while (j < n) {
            sumY += Y[j];
            j++;
        }

        // Add the maximum of the remaining sums to the result
        result += Math.max(sumX, sumY);

        return result;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        System.out.println("Maximum sum path: " + maxSumPath(X, Y));
    }
}