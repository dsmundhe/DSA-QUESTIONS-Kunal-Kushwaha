import java.util.Arrays;

public class DigonalPattern {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                arr[i][arr.length - 1 - i] = 1;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
               if(arr[i][j] ==1){
                System.out.print("*");
               }
               System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}
