import org.junit.jupiter.api.Test;
import typelearn.Utils;

import static org.junit.jupiter.api.Assertions;

        

/**
 *
 * @author User
 */
public class UtilsTest {
    @Test
    void testspellingFaultPercentage(){
        System.out.println("Testing fault percentage calculator");
        String[] wordsArray = {"hello", "world"};
        String[] userWordsArray = {"buy", "world"};
        double faultPercentage = Utils.spellingFaultPercentage(wordsArray, userWordsArray);
        assertEquals((double)50, faultPercentage);
        System.out.println("fault percentage calculator PASSED");
    }
}
