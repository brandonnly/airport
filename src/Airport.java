import java.util.Scanner;

/**
 * @author Brandon Ly
 */

public class Airport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Runway runway = new Runway();

        // loop menu
        while (true) {
            // send options
            String[] options = {"[L] - Landing",
                                "[R] - Runway",
                                "[T] - Take Off",
                                "[P] - Print",
                                "[exit] - exit"};
            System.out.println(options[0] + "\n" + options[1] + "\n" + options[2] + "\n" + options[3] + "\n" + options[4] + "\n" + "Please select an option:");

            // grab option
            String option = input.nextLine();

            // check if valid option
            if (option.equalsIgnoreCase("L") ||
                option.equalsIgnoreCase("R") ||
                option.equalsIgnoreCase("T") ||
                option.equalsIgnoreCase("P") ||
                option.equalsIgnoreCase("EXIT")) {

                // exit option
                if (option.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for using the airport.");
                    break;
                }

                // check if print option
                else if (option.equalsIgnoreCase("P")) {
                    runway.print();
                    System.out.println("\n");
                    continue;
                }


                // grab flight number
                System.out.println("Please enter a flight number:");
                int flightNumber = Integer.parseInt(input.nextLine());

                // landing option
                if (option.equalsIgnoreCase("L")) {
                    System.out.println("Flight " + flightNumber + " has landed, and joined its appropriate terminal. \n\n");
                }

                // runway option
                else if (option.equalsIgnoreCase("R")) {
                    runway.addToQueue(new Plane(flightNumber));
                    System.out.println("FLight " + flightNumber + " has joined the runway at the rear. \n\n");
                }

                // take off option
                else if (option.equalsIgnoreCase("T")) {
                    // set the head to the current heads link if flight numbers match
                    if (runway.head.getFlightNumber() == flightNumber) {
                        runway.head = runway.head.link;
                        System.out.println("Flight " + flightNumber + " has departed from the runway at the front. \n\n");
                    // otherwise its not ready for take off
                    } else {
                        System.out.println("Flight " + flightNumber + " is not the lane ready for takeoff. \n\n");
                    }
                }
                
            // loop again if not an option
            } else {
                System.out.println("That was not an option. \n\n");
            }
        }
    }
}
