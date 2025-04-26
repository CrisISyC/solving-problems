package Problems;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("holi");
        
        String string = "aaabbbccas";
        ArrayList<Integer> Mylist = new ArrayList();
        ArrayList<Character> Mylist1 = new ArrayList();
        char prev = string.charAt(0);
        int counter = 1;
        
        for (int i = 1; i < string.length(); i++){
            
            if(prev == string.charAt(i)){
                counter++;
            }else{
                Mylist.add(counter);
                Mylist1.add(prev);
                prev = string.charAt(i);
                counter = 1;
            }
        
        }
        Mylist.add(counter);
        Mylist1.add(prev);
        for (int i = 0; i < Mylist.size(); i++){
            
            System.out.print("[" + Mylist1.get(i) + ":" + Mylist.get(i) + "]");
        }
        
        
    }
}
