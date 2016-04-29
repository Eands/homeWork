package it.sevenbits.courses.invert.implementation;

import it.sevenbits.courses.invert.IInvert;

/**
 * Inverted array of type integer
 */
public class Invert<T> implements IInvert {
    /**
     *
     * @param array invert obtained array
     */
    public <T> void invertArray(final T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            T temp;
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
