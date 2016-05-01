package it.sevenbits.courses.invert.implementation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvertTest {

    //private Invert invert;
    //private Output output;

    @Before
    public void setUp() throws Exception {
        //this.invert = new Invert();
        //this.output = new Output();

    }

    @Test
    public void invertArrayString() throws Exception {
        String[] original = {"1", "2", "3"};
        Invert<String> stringInvert = new Invert<>();
        stringInvert.invertArray(original);
        //Output<String> stringOutput = new Output<String>();
        //String[] inv = stringOutput.outputArray(original);
        assertArrayEquals("wrong reverse", new String[] {"3","2","1"},original);

    }

    @Test
    public void invertArrayObject() throws Exception {
        Object[] original = {1, 2, 3};
        Invert<Object> objectInvert = new Invert<>();
        objectInvert.invertArray(original);
        assertArrayEquals("wrong reverse", new Object[]{3, 2, 1}, original);
    }
}
