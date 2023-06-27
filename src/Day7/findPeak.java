package Day7;

public class findPeak {
     int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (array[mid] < array[mid + 1]) {
                // We are ascending the mountain, move left pointer to mid + 1
                left = mid + 1;
            } else {
                // We are descending the mountain, move right pointer to mid
                right = mid;
            }
        }

        // At the end of the loop, left and right will be pointing to the peak
        return left;
}
