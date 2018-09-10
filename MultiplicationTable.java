package sample;
import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number \n");
        int num = keyboard.nextInt();

        for(int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + (i+1) + " = " + (num * (i+1)));
        }
    }
}
