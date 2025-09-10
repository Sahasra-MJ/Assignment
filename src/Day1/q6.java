package Day1;

public class q6 {
    public static void main(String[]args){
        int m=45;
        if(m>=90) {
            System.out.println("A");
        }else if(m>=75 && m<90){
            System.out.println("B");
        }else if(m>=50 && m<75){
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }
    }
}
