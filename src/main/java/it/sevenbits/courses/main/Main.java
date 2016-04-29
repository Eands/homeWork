package it.sevenbits.courses.main;

import it.sevenbits.courses.input.Input;
import it.sevenbits.courses.invert.implementation.Invert;
import it.sevenbits.courses.output.Output;

/**
 * Enter and reversed array of type integer
 */
final class Main {

    /**
     * Default constructor
     */
    private Main(){}

    /**
     * @param args invert.invertArray
     */
    public static void main(final String[] args) {
        Input input = new Input();
        Output output = new Output();

        String[] array = input.inputArray();
        System.out.println("Injected array:");
        output.outputArray(array);

        Invert invert = new Invert();
        System.out.println("\nInverter array:");
        invert.invertArray(array);
        output.outputArray(array);
    }
}