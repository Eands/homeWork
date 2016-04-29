package it.sevenbits.courses.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input array of type integer.
 */
public class Input {
    /**
     * @return returns an array of typed
     */
    public String[] inputArray() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = null;
        System.out.println("Enter the size of array!");
        int arraySize;
        try {
            arraySize = Integer.parseInt(reader.readLine());
            if (arraySize == 0) {
                System.out.println("BAD SIZE ARRAY!");
                System.exit(1);
            }
            String arrayValue;
            array = new String[arraySize];
            System.out.println("Enter array: ");
            for (int i = 0; i < array.length; i++) {
                arrayValue = reader.readLine();
                array[i] = arrayValue;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Bad");
            System.exit(1);
        }
        return array;
    }
}