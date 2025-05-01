package Problems;

public class FindNumbersWithEvenNimberOfDigits {
 
    
    
    public static int solution(){
        int num[] = {555,901,482,1771};
        int solution = 0;
        for(int i = 0; i<num.length;i++){
            
            String length = Integer.toString(num[i]);
            int digits = length.length();
            
            if(digits % 2 == 0){
                solution++;
            }
        }
        
        return solution;
    }

}
