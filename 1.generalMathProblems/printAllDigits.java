import java.util.*;
 public class printAllDigits {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //print all digits in reverse order but for eg 560 will give 065 not 65 for that refer reverseTheNumber.java
        while(n>0){
            System.out.print(n%10);
            n/=10;
        }
        scn.close();
    }
}
 