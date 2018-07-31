import java.util.Arrays;
import java.lang.Math;

public class ThirdTaskOne {
    public static void main(String [] args){
        int arr[]= new int[5];
        for(int i=0; i < 5; i++){
            arr[i] =  (int)(Math.random()*73);
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSorted: ");
        Arrays.sort(arr);
        for(int i=0; i < 5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
