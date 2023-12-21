import java.util.*;
public class Tax {
    public static void main(String[] args) {
        Double Salary, Result;
        Scanner sc = new Scanner(System.in);
        Salary = sc.nextDouble();
        if (Salary > 50000.00){
            Result = Salary * (0.10);
        } else{
            Result = Salary * (0.05);
        }
        System.out.println(Result);
    }
    
}
