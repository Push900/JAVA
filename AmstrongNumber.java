import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        int num, originalNum, remainder, result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3); // cube of the digit
            originalNum /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
