package Day6ProblemSolving;

import java.util.Scanner;

public class ElementDeletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        int pos=sc.nextInt();
        int n=arr.length;
        for(int i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
