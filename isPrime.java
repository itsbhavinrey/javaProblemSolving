import java.util.*;
public class isPrime {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        //isPrime
        int count = 0;
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                count++;
                break;
            }
        }

        if(count == 0){
            System.out.println("Prime");
        }
        else System.out.println("Not a Prime");
        scn.close();
    }
}
