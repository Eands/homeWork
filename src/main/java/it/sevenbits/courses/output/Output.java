package it.sevenbits.courses.output;

/**
 * Output array of type integer.
 */
public class Output <T> {
    /**
     *
     * @param array introduced an array
     * @return returns an array of inferential
     */
    public T[] outputArray(final T[] array) {
        for (T anArray : array) {
            System.out.print(anArray + " ");
        }
        return array;
    }
}
