package sample;
import static java.lang.System.out;
import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {

        int grid[][] = new int[4][7];

        grid[0][0] = 68;
        grid[0][1] = 70;
        grid[0][2] = 76;
        grid[0][3] = 70;
        grid[0][4] = 68;
        grid[0][5] = 71;
        grid[0][6] = 75;
        grid[1][0] = 76;
        grid[1][1] = 76;
        grid[1][2] = 87;
        grid[1][3] = 84;
        grid[1][4] = 82;
        grid[1][5] = 75;
        grid[1][6] = 83;
        grid[2][0] = 73;
        grid[2][1] = 72;
        grid[2][2] = 81;
        grid[2][3] = 78;
        grid[2][4] = 76;
        grid[2][5] = 73;
        grid[2][6] = 77;
        grid[3][0] = 64;
        grid[3][1] = 65;
        grid[3][2] = 69;
        grid[3][3] = 68;
        grid[3][4] = 70;
        grid[3][5] = 74;
        grid[3][6] = 72;

        int totalSum = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 7; column++) {
                totalSum = totalSum + grid[row][column];
            }
        }
        System.out.println("The total average of temperatures in a week is " + totalSum / 28);

        String[] times = {"7AM", "3PM", "7PM", "3AM"};
        int[] totalRow = {0, 0, 0, 0};
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 7; column++) {
                totalRow[row] = totalRow[row] + grid[row][column];
            }
            System.out.println(" The average temperature at " + times[row] + " is " + totalRow[row] / 4);

            String[] dayOfTheWeek = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
            int[] totalColumn = {0, 0, 0, 0, 0, 0, 0};
            //for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 7; column++) {
                totalColumn[column] = totalColumn[column] + grid[row][column];

                System.out.println(" The average temperature on " + dayOfTheWeek[column] + " is " + totalRow[row] / 7);
            }
        }
    }
}




