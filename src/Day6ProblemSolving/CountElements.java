package Day6ProblemSolving;

public class CountElements {
    public static void main(String[] args) {
        int arr[]={1,3,3,3,3,4};
        int x=3;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(x+" occured "+count+" times");
    }
}
