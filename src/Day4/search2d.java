import java.util.ArrayList;
public class search2d {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        if (mat == null || mat.isEmpty() || mat.get(0).isEmpty()) {
            return false; // Matrix is empty or invalid
        }
    
        int rows = mat.size();
        int cols = mat.get(0).size();
    
        int left = 0;
        int right = rows * cols - 1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mat.get(mid / cols).get(mid % cols);
    
            if (midValue == target) {
                return true; // Found the target
            } else if (midValue < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
    
        return false; // Target not found
    }
    
}
