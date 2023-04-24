package Maxproduct3numbers;

class Solution {
    public static int maximumProduct(int[] nums) {
        // find min1,min2,max1,max2,max3
        int min1 = Integer.MAX_VALUE;
        int min2 = min1;

        int max1 = Integer.MIN_VALUE;
        int max2 = min1;
        int max3 = min1;

        for(int i=0; i < nums.length;i++){
            //max check
            int val = nums[i];
            if(val >= max1){
                max3=max2;
                max2=max1;
                max1=val;
            } else if(val >= max2){
                max3=max2;
                max2=val;
            } else if(val >= max3){
                max3 = val;
            }
            //min check
            if(val <= min1){
                min2=min1;
                min1=val;
            } else if(val <= min2){
                min2=val;
            }

        }
        //compare
        return Math.max(min1*min2*max1,max1*max2*max3);

    }

    public static void main(String[] args){
        int[] a = {1,2,3,4};
        System.out.println(maximumProduct(a));
    }
}
