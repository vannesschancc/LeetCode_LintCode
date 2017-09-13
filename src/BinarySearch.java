import java.util.Arrays;

public class BinarySearch {
    public BinarySearch(){}
    public int binarySearchIterative(int[] nums, int target){
        if (nums == null || nums.length == 0) {
            return -1;
        }

        Arrays.sort(nums);
        int lp = 0;
        int rp = nums.length - 1;
            while(lp + 1 < rp){
            //int mid = ( lp + rp ) / 2; //bad idea as lp + rp will over flow easily;
            int mid = lp + (rp - lp)/2;
            if (nums[mid] == target) {
                rp = mid;
            }else if (nums[mid] > target) {
                rp = mid;
            }else if (nums[mid] < target) {
                lp = mid;
            }
        }

        if (nums[lp] == target) {
            return lp;
        }

        if(nums[rp] == target){
            return rp;
        }
        return -1;
    }

    public int binarySearchRecursion(int[] nums, int target){
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        int res = recursiveBody(nums, 0, nums.length - 1, target);
        return res;
    }

    public int recursiveBody(int[] nums, int lp, int rp, int target){
        if(lp <= rp){
            int mid = lp + (rp - lp)/2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target){
                return recursiveBody(nums,lp, mid-1, target);
            } else {
                return recursiveBody(nums,mid+1, rp, target);
            }
        }
        return -1;
    }

    public int binarySearchFirst(int [] nums, int target){
        if (nums == null || nums.length == 0) {
            return -1;
        }

        Arrays.sort(nums);
        int result = -1;
        int lp = 0;
        int rp = nums.length - 1;

        while(lp + 1 < rp){
            //int mid = ( lp + rp ) / 2; //bad idea as lp + rp will over flow easily;

            int mid = lp + (rp - lp)/2;
            if (nums[mid] == target) {
                rp = mid;
                //result = mid;
            }else if (nums[mid] > target) {
                rp = mid;
            }else if (nums[mid] < target) {
                lp = mid;
            }
        }

        if (nums[lp] == target) {
            return lp;
        }

        if(nums[rp] == target){
            return rp;
        }
        return -1;

    }
}
