import java.util.Arrays;

public class Q1_MergeArrays {
    
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Moving non-zero elements of X to the end
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k--] = X[i];
            }
        }
        
        
        int i = k + 1; // First index of X ,non-zero elements
        int j = 0;     // Index of Y
        int idx = 0;   // Index of merged array
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[idx++] = X[i++];
            } else {
                X[idx++] = Y[j++];
            }
        }
        
        while (j < n) {
            X[idx++] = Y[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);
        
        System.out.println("Merged Array: " + Arrays.toString(X));
    }
}