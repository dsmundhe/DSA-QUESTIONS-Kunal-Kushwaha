public class RobotToOrigin {
    static int i = 0, j = 1;
    static int[] initPos = {0,0};
    static int[] afterOperation = {0,0};
    public static void up(int[] a ){
        a[i] = a[i] - 1;
        
    }
    public static void down(int[] a){
        //operation
        a[i] = a[i] + 1; 
        // main kaam 
        a[j] = - a[j];
        a[i] = - a[i];
    }
    public static void right(int[] a){
        //operation
        a[j] = a[j] + 1;
        //main kaam 
        int temp = a[j];
        a[j] = a[i];
        a[i] = - temp;
    }
    public static void left(int[] a){
        //operation
        a[j] = a[j] - 1;
        //main kaam
        int temp = a[j];
        a[j] = - a[i];
        a[i] =  temp;
    }

    public static void main(String[] args) {
        String input = "";
        for(int z= 0; z<input.length(); z++){
            char temp = input.charAt(z);
            switch (temp) {
                case 'R':
                    right(afterOperation);
                    break;
                
                    case 'U':
                    up(afterOperation);
                    break;
                
                    case 'L':
                    left(afterOperation);
                    break;
                
                    case 'D':
                    down(afterOperation);
                    break;
                
            
                default:
                    break;
            }
        }
        if(  initPos[i] == afterOperation[i]  && initPos[j] == afterOperation[j]  ){
            System.out.println("Success !");
        }else{
            System.out.println("Failure !");
        }
    }
    
}