package Day1;

public class q5 {
    public static void main(String[]args){
        int yr=2020;
        if(yr%400==0 || (yr%4==0 && yr%100!=0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
