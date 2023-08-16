import java.util.Scanner;

public class exam_percentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your MATHS marks: ");
        float a = s.nextFloat();
        System.out.print("Enter your ENGLISH marks: ");
        float b = s.nextFloat();
        System.out.print("Enter your HINDI marks: ");
        float c = s.nextFloat();
        System.out.print("Enter your SCIENCE marks: ");
        float d = s.nextFloat();
        System.out.print("Enter your SOCIALSTUDIES marks: ");
        float e = s.nextFloat();

        float total =((a + b + c + d + e)/500)*100;
        System.out.print("Your percentage is: " + total + "%");
    }
}
