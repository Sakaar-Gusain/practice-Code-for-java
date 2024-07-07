//13-06-2024
//longest parenthesis substring
import java.util.*;
class Par_Str{
    static int findMaxLen(String str){
        int n=str.length();
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int res = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '('){
                stk.push(i);
            }
            else{
                if(!stk.isEmpty()){
                    stk.pop();
                }
                if(!stk.isEmpty()){
                    res = Math.max(res,i-stk.peek());
                }
                else{
                    stk.push(i);
                }
            }
            
        }
    return res;
    }

    public static void main(String[] args)throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findMaxLen(str));

        sc.close();
    }
}
    
