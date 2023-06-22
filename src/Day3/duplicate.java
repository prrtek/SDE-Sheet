package Day3;

public class duplicate {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
  int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int element = arr.get(i);
            if (!set.add(element)) {
                ans[1] = element;
            }
        }

        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int element = arr.get(i);
            count[element]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                ans[0] = i;
                break;
            }
        }

        return ans;
    }
}
}
