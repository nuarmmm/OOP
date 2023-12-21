import java.util.*;
public class Bank {
    public static void main(String[] args) {
        int Money, Result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        Money = sc.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char Kind = sc.next().charAt(0);
        Result = 0;
        if ((Kind == 'A') | (Kind == 'C')){
            Result += (Money * 0.015) + Money;
        } else if (Kind == 'B'){
            Result += (Money * 0.02) + Money;
        } else if (Kind == 'D') {
            Result += (Money * 0.05) + Money;
        }
        System.out.println("Your total money in one year = " + Result);
    }
    
}
