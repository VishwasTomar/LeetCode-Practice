class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left =0;
        int right = height.length-1;
        while(left<right){

                if(height[left]<=height[right]){
                    int area = height[left]*Math.abs(right-left);
                    if(maxArea<area){
                        maxArea = area;
                    }
                    left++;
                }else{
                    int area = height[right]*Math.abs(right-left);
                    if(maxArea<area){
                        maxArea = area;
                    }
                      right--;
                    
                }
        }
        return maxArea;
    }
}