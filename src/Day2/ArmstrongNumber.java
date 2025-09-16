package Day2;

public class ArmstrongNumber {
    public static void main(String[]args){
        int n=153;
        int temp=n;
        int count=0,sum=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        temp=n;
        while(temp>0){
            int unit=temp%10;
            sum+= (int)Math.pow(unit,count);
            temp/=10;
        }
        if(sum==n){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("not an Armstrong Number");
        }
    }
}
