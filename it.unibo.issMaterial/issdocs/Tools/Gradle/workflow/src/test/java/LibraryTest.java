import org.junit.Test;
import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'anatali' at '05/08/16 16.39' with Gradle 2.14.1
 *
 * @author anatali, @date 05/08/16 16.39
 */
public class LibraryTest {
    @Test 
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
  //Added by AN
    @Test 
    public void testGetTermInfo() {
    	Library classUnderTest = new Library();
    	 assertTrue("someLibraryMethod should return 'true'", classUnderTest.getTermInfo().equals("a(1)"));
    }
}
