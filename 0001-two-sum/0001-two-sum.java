class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[nums.length];

        for(int i=0;i<arr.length;i++){
            arr[i] = nums[i];
        }

        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        int left =0; int right = nums.length -1;
        while(left<right){
            int sum = nums[left]+nums[right];    
            if(sum == target){
                break;
            }
            if(sum< target){
                left ++;
            }else{
                right--;
            }
        }
        int v1 = nums[left]; int v2 = nums[right];
        int i1=0;int  i2 =0; 
        for( int i=0;i< arr.length;i++){
            if(v1 == arr[i]){
                i1 = i;
            }
        }
         for( int i=0;i< arr.length;i++){
            if(v2 == arr[i] && i1!=i){
                i2 = i;
            }
        }
        return new int[]{i1,i2};
    }
}