import java.util.*;
public class Salary {
    public static void main(String[] args) {
        int age, weight, numDay1, numDay2, salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = sc.nextInt();
        System.out.println("Hi," + name);
        salary = 0;
        if (age >= 17 & age <= 30){
            salary += (numDay1 * 300) - (numDay2 * 50);
        } else if (age >= 31 & age <= 40){
            salary += (numDay1 * 500) - (numDay2 * 50);
        } else if (age >= 41 & age <= 50){
            salary += (numDay1 * 1000) - (numDay2 * 25);
        } else if (age >= 51 & age <= 60){
            salary += (numDay1 * 3000);
        }
        System.out.println("Your salary is " + salary + " Baht");
        if (weight >= 10 & weight <= 60){
            salary += 5000;
            System.out.println("Your salary and bonus is " + salary + " Baht");
        } else if (weight >= 61 & weight <= 90){
            salary += 5000 - ((weight - 60) * 10);
            System.out.println("Your salary and bonus is " + salary + " Baht");
        }
    }
}
