import java.util.Scanner;

public class sum_by_taking_inputs {
    
    public static void main(String[] args) {
        System.out.println("Taking input from user");

        Scanner s = new Scanner(System.in);        //read from the keyboard

        System.out.print("Enter your name: ");
        String str = s.next();                     //reading string
        System.out.println("Your name is : " + str);

        System.out.print("Enter num 1: ");
        int a = s.nextInt();                       //to take int value from user

        System.out.print("Enter num 2: ");
        int b = s.nextInt();

        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
