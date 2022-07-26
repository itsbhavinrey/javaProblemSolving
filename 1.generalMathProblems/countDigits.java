import java.util.*;
 public class countDigits {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //count number of digits in a number
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
        scn.close();
    }
}
 