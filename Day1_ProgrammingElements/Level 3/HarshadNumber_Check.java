import java.util.Scanner;
public class HarshadNumber_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to check as Harshad Number :");
        int Number = sc.nextInt();

        int Original =Number;
        int Sum=0;

        while(Number!=0){
            int x = Number%10; // here , x is the last extracted  digit ;
             Sum += x ;
             Number=Number/10;
        }
        if(Original%Sum==0){
            System.out.println(Original+" is a Harshad Number");
        } else {
            System.out.println(Original+" is not a Harshad Number");
        }


    }
}
