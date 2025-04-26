package Problems;
/*
 *Problem
 https://leetcode.com/problems/two-sum/
*/

public class TwoSum {
    
    //public static void solution(){
        
    public static int[] twoSum(int[] nums, int target) {
        
        int current = 0;
        int solution[] = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            
            if(current == i){
                continue;
            }
            
            if(nums[current] + nums[i] == target){
                solution[0] = current;
                solution[1] = i;
                return solution;
            }
            
            if(i == nums.length -1 ){
                i = -1;
                current +=1;
            }
            
        }
                        
        return solution;
    }
    
    //}
    
}
