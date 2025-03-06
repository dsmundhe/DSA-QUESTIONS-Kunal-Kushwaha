import java.sql.SQLOutput;
import java.util.Arrays;

public class MinMaxNumRecursion {

    public static void main(String[] args) {
        int[] arr={5,8,7,100,4,6,3,0,-15};
        System.out.println("Min Num : "+minNum(arr,arr.length-1));
        System.out.println("Max Num : "+maxNum(arr,arr.length-1));
    }
public static int minNum(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n],minNum(arr,n-1));
}

public static int maxNum(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n],maxNum(arr,n-1));
}


}
