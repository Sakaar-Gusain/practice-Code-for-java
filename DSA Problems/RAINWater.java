//max rainwater problem
import java.util.*;
public class RAINWater{
    static int res;
    public static int maxWater(int[] arr, int n){
        for(int i = 0;i<n;i++){
            int left = arr[i];
            for(int j = 0;j<i;j++){
                left = Math.max(left,arr[j]);
            }
            int right = arr[i];
            for (int j = 1;j<n;j++){
                right = Math.max(right,arr[j]);
            }  
            res += Math.min(left,right)-arr[i];
        }
        
        return res;
    }

    public static void main(String[] args){
        int[] arr = {3,0,2,0,4};
        int n = arr.length;
        System.out.println(maxWater(arr,n));
    }
}