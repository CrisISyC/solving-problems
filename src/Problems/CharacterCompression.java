package Problems;

public class CharacterCompression {
    

    public static String solution(String string){
        
        if(string == ""){
            return "The input is empty"; 
        }
   
        char prev = string.charAt(0);
        int counter = 1;
        String solution = "(";
        for (int i = 1; i < string.length(); i++){

            if(prev == string.charAt(i)){
                counter++;
            }else{
                solution += "[" + prev + ": " + counter + "]"; 
                prev = string.charAt(i);
                counter = 1;
            }

        }
        solution += "[" + prev + ": " + counter + "]"; 
        
        solution+=")";
        
        return solution;
    }
    
            
}

