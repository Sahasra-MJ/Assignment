package Day2;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[]args){
        int arr[] = {5,8,6,1,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
