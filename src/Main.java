import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int userNum;
        String keepGoing = "";

        do {
            System.out.println("Enter an integer: ");

            while (!scnr.hasNextInt()) {
                System.out.println("Invalid entry. Please enter an integer value.");
                scnr.next();
            }

            userNum = scnr.nextInt();

            //Formatting columns - padding
            System.out.printf("%-22s%-22s%-22s\n", "Number", "Squared", "Cubed");
            System.out.printf("%-22s%-22s%-22s\n", "======", "=======", "=====");


            int i = 0;
            if (userNum > 0) {
                for (i = 1; i <= Math.abs(userNum); i++) { //for loop for finding squares and cubes
                    int iSquared;
                    int iCubed;
                    iSquared = (int) Math.pow(i, 2);
                    iCubed = (int) Math.pow(i, 3);
                    System.out.printf("%-22d%-22d%-22d\n", i, iSquared, iCubed); //printing answers in columns
                }
            }
            else if (userNum < 0) {
                for (i = -1; i >= userNum; i--) { //for loop for finding squares and cubes
                    int iSquared;
                    int iCubed;
                    iSquared = (int) Math.pow(i, 2);
                    iCubed = (int) Math.pow(i, 3);
                    System.out.printf("%-22d%-22d%-22d\n", i, iSquared, iCubed); //printing answers in columns
                }
            }



        scnr.nextLine();
        System.out.println("Would you like to continue? (Y/N)");
        keepGoing = scnr.nextLine();
        //validation for continuing -- do while loop
    } while(keepGoing.equalsIgnoreCase("y")&&(!keepGoing.equalsIgnoreCase("N")));

        System.out.println("End of program.");
}
//finally works, not sure about the formatting lines on the for loops 
}

