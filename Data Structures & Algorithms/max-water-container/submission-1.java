class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int start =0;
        int end = n-1;
        int max =0;
        //hi


        while(start<end){

            max = Math.max(Math.min(heights[start],heights[end]) * (end - start),max);
            if(heights[start]<heights[end]){
                start++;
            }else{
                end--;
            }

        }
        return max;
        
    }
}
