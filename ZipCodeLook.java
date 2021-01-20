package Assignment2;

/**
 * A user-interactive program that reads in a file
 * searches for zipcode to match user input
 * gets town name and state name associated with the zipcode
 * @author mhernan
 * Created: Sep 20 2020
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Run to begin program
 */
public class ZipCodeLook {

    public static void main(String[] args) throws FileNotFoundException {
        String input = "11111"; 
        String file = "C:/Users/maggi/Desktop/cs206/uszipcodes.csv";

        Scanner scnr = new Scanner(System.in);
        Places readFile = new Places();
        readFile.readZipCodes(file);

        while (input != "00000") {
            System.out.print("zipcode: ");
            input = scnr.nextLine();

            Place p = readFile.lookupZip(input);
            if (input.equals("00000")) {
                System.out.println("Goodbye!");
                break;
            }
            if (p == null) {
                System.out.println("No such zipcode");
            }
            else {
                System.out.println(p.getTown() + ", " + p.getState());
            }
            
        }
        scnr.close();
    }
}
