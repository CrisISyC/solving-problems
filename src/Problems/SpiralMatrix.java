package Problems;

import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix {
    
    public static List<Integer> solution(int[][] matrix) {
        
        List<Integer> solution = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
               
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){                
                System.out.print(matrix[i][j] + " ");
            }           
            System.out.println("");
        }        
        
        //System.out.println(m*n);
        int counterI = 0;
        int counterJ = 0;
        
        int counterIFinal = m-1;  //rows 3
        int counterJFinal = n-1;  //columns 4
        
        
        /*System.out.println(m);
        System.out.println(n);*/
        
        while(solution.size() < m*n){
            
            for(int j = counterJ; j <= counterJFinal; j++){                
                solution.add(matrix[counterI][j]);
            }          
            
            counterI++;
            if(solution.size() == m*n){
                break;
            }
            for(int i = counterI; i <= counterIFinal; i++){           
                solution.add(matrix[i][counterJFinal]);
            }
            counterJFinal--;
            if(solution.size() == m*n){
                break;
            }
            for(int j = counterJFinal; j >= counterJ; j--){               
                solution.add(matrix[counterIFinal][j]);
            }
            
            counterIFinal--;
            if(solution.size() == m*n){
                break;
            }
            for(int i = counterIFinal; i >= counterI; i--){
            
                solution.add(matrix[i][counterJ]);
                
            }
            counterJ++;
            if(solution.size() == m*n){
                break;
            }
        }
        
        return solution;
    }
    
    
}
