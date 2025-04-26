package Problems;

/*
 *Problem
 https://leetcode.com/problems/add-two-numbers/description/
 */

public class AddTwoNumbers {
    
    public static void solution(){
        
        int algo[] = {0,1,2,3,4,5,6};
        int algo2[] = new int[algo.length];
    
        int counter = 0;
        for(int i = algo.length; i > 0 ; i--){
    
            algo2[counter++] = algo[i-1];
        }
    
        for(int i = 0; i < algo2.length; i++){
            System.out.print(algo2[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < algo2.length; i++){
            System.out.print(algo[i] + " ");
        }
        System.out.println("");
    }
    

    
}
