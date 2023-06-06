package Day2;

public class kadanesAlgo {
    long maxi = Long.MIN_VALUE; // maximum sum
    long sum = 0;

    for (int i = 0; i < n; i++) {
        sum += nums[i];

        if (sum > maxi) {
            maxi = sum;
        }

        // If sum < 0: discard the sum calculated
        if (sum < 0) {
            sum = 0;
        }
    }
	if(maxi<0){
		maxi=0;
	}

    return maxi;
}

}
