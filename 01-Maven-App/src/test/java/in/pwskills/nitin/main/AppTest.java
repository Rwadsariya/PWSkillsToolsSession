package in.pwskills.nitin.main;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testwithPositiveNumber()
    {
        Arthematic a = new Arthematic();
        int actual = a.sum(10, 20);
        int expected = 30;

        assertEquals( actual,expected ); // PASS
    }

    // public void testwithNegativeNumber()
    // {
    //     Arthematic a = new Arthematic();
    //     int actual = a.sum(-10, -20);
    //     int expected = -31;

    //     assertEquals( actual,expected ); // FAIL
    // }

    public void testSumWithMixedNumber()
    {
        Arthematic a = new Arthematic();
        int actual = a.sum(-10,20);
        int expected = 10;

        assertEquals( actual,expected ); // PASS
    }


}
