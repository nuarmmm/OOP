import java.util.*;
public class Zen {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        num = sc.nextInt();
        for (int i=1;i<=num;i++){
            if (i%5 == 0){
                System.out.print('/');
            } else {
                System.out.print("|");
            }
        }
    }
}

