  
class FirstUpperCaseLatter {
    
public  static  void  main(String[] args){
    String str="dipAk";
    System.out.println(firstUpperCase(str,0));


}
public static char firstUpperCase(String str,int n){
    if(n==str.length()){
        return '-';
    }
    char ch=str.charAt(n);
    if(ch >= 'A' && ch <='Z'){
        return ch;
    }else{
        return firstUpperCase(str,n+1);
    }
}
    
}