class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int leftp=0;
        int rightp=height.length-1;

        while(leftp<rightp){
            int width=rightp-leftp;
             int minheight=Math.min(height[leftp],height[rightp]);
            int currentwater=width * minheight;
             maxwater=Math.max(maxwater,currentwater);
             if(height[leftp]<height[rightp]){
                leftp++;
             }
             else{
                rightp--;
             }
        }
           return maxwater;
    }
}