import java.util.*;
public class inverseTheNumber {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //inverse the number for eg 2314 is 1342
           int figure=1;
           int inverse=0;
           while(n>0){
            inverse+= figure* (int)Math.pow(10, n%10-1);
            n/=10;
            figure++;
           }
           System.out.println(inverse);

        scn.close();
    }
}
