package Assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class represents the information in the file
 */
public class Places {

    public Place[] allZips;
    public String zipCode;

    /**
     * Reads a zip code file, parsing and storing every line
     * 
     * @param fileName the zip code file
     * @throws FileNotFoundException if the file does not exist
     */
    public void readZipCodes(String fileName) throws FileNotFoundException {
        String line;
        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
            String lineOne = br.readLine();
            String[] sizeLineOne = lineOne.split(",");
            int length = Integer.parseInt(sizeLineOne[0]);
            allZips = new Place[length];
            
            while (null != (line = br.readLine())) {
                String[] data = line.split(",");
                Place storeZip = new Place(data[0], data[1], data[2]);
                allZips[i] = storeZip;
                i++;
            }
            
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error in opening the file: " + fileName);
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
            System.exit(1);
        }
        

    }


    /**
     * Find a Place record given a zip code
     * 
     * @param zipCode the zip code to find.
     */
    public Place lookupZip(String zipCode) {  //changed Place to void
        for (int j = 0; j < allZips.length; j++) {
            if (allZips[j].getZip().equals(zipCode)) {
                return allZips[j];
            }
        }
        return null;
    }
}
