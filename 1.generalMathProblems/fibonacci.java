import java.util.*;
 public class fibonacci {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //this is a fibonacci where 1st term is 0 an 2nd term is 1
        int a=0;
        int b=1;
        int c;
        for(int k=1; k<=n; k++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
        scn.close();
    }
}
 
