import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //import randomizer
        Random rnd = new Random();

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

        System.out.printf("For my random array of integers the sum is %d and the average is %.2f.", sum, ave);

    }
}
