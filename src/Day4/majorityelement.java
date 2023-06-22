package Day4;

public class majorityelement {
     int count = 0;
    int majorityElement = 0;
    
    for (int num : nums) {
        if (count == 0) {
            majorityElement = num;
            count++;
        } else if (majorityElement == num) {
            count++;
        } else {
            count--;
        }
    }
    
    return majorityElement;
}
