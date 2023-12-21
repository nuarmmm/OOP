import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        int num, countEven, countOdd;
        countEven = 0;
        countOdd = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num == -1) {
                System.out.println("Odd number = " + countOdd + " and Even number = " + countEven);
                break;
            }
            if (num%2 == 0) {
                countEven += 1;
            } else if(num%2 != 0){
                countOdd += 1;
            }
        }
    }
}
