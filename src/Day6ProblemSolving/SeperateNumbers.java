package Day6ProblemSolving;

public class SeperateNumbers {
    public static void main(String[] args) {
        int arr[]={0,-1,9,-4,8,2,-3};
        int j=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
