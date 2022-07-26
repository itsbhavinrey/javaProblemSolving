import java.util.*;
public class primeUptoN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

    //print all prime numbers till n
    for(int i=low; i<=high; i++ ){
        int count=0;

        // check for every i that is it prime or Not
        for(int j=2; j*j<=i; j++){
            if(i%j==0){
                count++;
                break;
            }
        }
        
        if(count==0){
            System.out.println(i);
        }
    }        

        scn.close();
    }
}
