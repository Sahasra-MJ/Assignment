package Day1;

public class q2 {
    public static void main(String[]args){
        int b=250;
        if(b>0){
            System.out.println("Positive Balance");
        }else if(b<0){
            System.out.println("Overdraft");
        }else{
            System.out.println("Zero Balance");
        }
    }
}
