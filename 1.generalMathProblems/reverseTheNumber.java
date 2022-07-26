import java.util.*;
 public class reverseTheNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //reverse the number ie 560 will get 65
          //first count no of digits
          int count=0;
          int temp=n;
          while(temp>0){
            temp/=10;
            count++;
          }

          //now reverse it using count variable
        int rev=0;
        while(n>0){
            rev+=n%10 * (int)Math.pow(10, count-1);
            n/=10;
            count--;
        }
        System.out.println(rev);
        scn.close();
    }
}
