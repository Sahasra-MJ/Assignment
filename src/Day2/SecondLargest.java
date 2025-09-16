package Day2;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[]args){
        int arr[] = {14, 28, 19, 33, 45, 12};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
