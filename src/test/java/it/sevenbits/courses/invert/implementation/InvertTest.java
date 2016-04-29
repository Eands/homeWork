package it.sevenbits.courses.invert.implementation;

import it.sevenbits.courses.output.Output;
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
        Invert<String> stringInvert = new Invert<String>();
        stringInvert.invertArray(original);
        assertArrayEquals("wrong reverse", new String[] {"1","2","3"}, inverted);
    }

    /*@Test
    public void invertArrayObject() throws Exception {
        Object[] original = {1, 2, 3};
        Invert<Object> objectInvert = new Invert<Object>();
        assertArrayEquals("wrong reverse", new Object[]{1, 2, 3}, objectOutput.outputArray(original));
    }*/
}
