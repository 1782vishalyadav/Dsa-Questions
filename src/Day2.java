import java.util.*;

class Day2 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num: nums){
             result ^= num;
        }
       return result;
    }
    public static void main(String[] args) {
        Day2 obj = new Day2();
        int[] nums = {4,1,2,1,2};
        System.out.println(obj.singleNumber(nums));
    }
}