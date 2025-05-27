package Problems;

public class DivisibleandNondivisibleSumsDifference {
    
    public static int solution(int n, int m) {
        
        int answer = 0;
        for(int i = 1; i <= n; i++){
            
            if(i % m != 0){
                answer += i;
            }else{
                answer -= i;
            }
        }
 
        return answer;
        }
    
}
