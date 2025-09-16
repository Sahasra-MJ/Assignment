package Day2;

public class FrequencyOfElement {
    public static void main(String[]args){
        int arr[] = {2, 4, 2, 6, 2, 9, 6};
        for(int i=0;i<arr.length;i++){
            int found=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found=1;
                    break;
                }
            }
            if(found==1){
                continue;
            }
            int freq = 1;
            for (int k=i+1;k<arr.length;k++) {
                if (arr[i]==arr[k]) {
                    freq++;
                }
            }
            System.out.printf("%d appears %d times\n", arr[i], freq);
    }
}
}