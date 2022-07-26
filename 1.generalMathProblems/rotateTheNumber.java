import java.util.*;
 public class rotateTheNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        //count the number of digits
        int count=0;
        int temp=n;
        while(temp>0){
            temp/=10;
            count++;
        }
        //make k as simple as possible
        k=k%count;
        if(k<0){
            k+=count;
        }
        //rotate the number using k and count
        int rotnumber=0;
        int div=1;
        int mult=1;
        for(int i=1; i<=count; i++){
            if(i<=k){
                div*=10;
            }
            else{
                mult*=10;
            }
        }
        int q=n/div;
        int r=n%div;
        rotnumber=r*mult+q;
        System.out.println(rotnumber);
        scn.close();
    }
}
