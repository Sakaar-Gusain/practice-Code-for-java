//pattern matching
import java.util.*;

class SubSt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        int i = 0;
        int j = 0;
        int len = p.length();
        while(i < s.length() && j < p.length()){
            if(s.charAt(i) == p.charAt(j)){
                String str = s.substring(i,len+i);
                if(str.equals(p)){
                    System.out.println(i);
                    break;
                }
                else{
                    i++;
                }
            } 
            else{
                i++;
            } 
        }   
    }
}