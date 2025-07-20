import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //import randomizer
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        //declare the array task 1
        final int DATA_SIZE = 100;
        int dataPoints[] = new int[DATA_SIZE];

        //add random values over a for loop task 2
        for (int i = 0; i < DATA_SIZE; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; //Add 1 to make it 1-100 instead of 0-99

        }

        //For loop that prints the values with | between task 3
        for (int i = 0; i < DATA_SIZE; i++) {
            System.out.printf("%5d  |", dataPoints[i]);
            if((i+1)%20 == 0){
                System.out.println("");
            }
        }

        //Task 4 sum and ave of the array
        //initialize ave and sum
        int sum = 0;
        for (int i = 0; i < DATA_SIZE; i++) {
            sum = sum + dataPoints[i];
        }
        double ave = (double) sum / DATA_SIZE;

        System.out.printf("For my random array of integers the sum is %d and the average is %.2f.\n\n", sum, ave);

        //Part 2 Task 5 let's get a value from the user
        int userSelect = SafeInput.getRangedInt(in,"Choose a value", 1, 100);

        //Task 6 search the whole array for the user's value
        System.out.printf("Searching for %d.\n", userSelect);
        int foundCount = 0;
        for (int i = 0; i < DATA_SIZE; i++) {
            if (dataPoints[i] == userSelect){
                foundCount++;
                System.out.printf("I found %d at position %d.\n", userSelect, i);
            }
        }
        if (foundCount == 0){
            System.out.printf("I did not find %d in the array.\n", userSelect);
        } else if (foundCount == 1) {
            System.out.printf("I found %d %d time in the array.\n", userSelect, foundCount);

        } else {
            System.out.printf("I found %d %d times in the array.\n", userSelect, foundCount);
        }

    }
}
