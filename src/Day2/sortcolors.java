package Day2;

public class sortcolors {
    public static void sortArray(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers
    
        while (mid <= high) {
            if (arr[mid] == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
    
                low++;
                mid++;
    
            } else if (arr[mid] == 1) {
                mid++;
    
            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
    
                high--;
            }
        }
    }
    
}
