package Day1;

public class q4 {
    public static void main(String[]args){
        int a=50,b=100,c=75;
        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=a && b>=c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
