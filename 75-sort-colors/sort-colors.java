class Solution {
    public void swap(int nums[],int i,int j){
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
         int start=0;
         int end=nums.length-1;
         int middle=0;
         while(middle<=end){
            if(nums[middle]==0){
                swap(nums,middle,start);
                middle++;
                start++;
                
            }
            else if(nums[middle]==2){
                swap(nums,middle,end);
                end--;
            }
            else{
            middle++;//when 1
            }
         }
        
    }
}