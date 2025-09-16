package Day2;
public class ElementFrequency {
    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 6, 2, 9, 6};
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            int freq = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    visited[j] = true;
                }
            }
            System.out.printf("%d appears %d times\n", arr[i], freq);
        }
    }
}
