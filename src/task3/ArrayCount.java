package task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayCount {


    @Test
    void countTest() {

        ArrayCount arrayCount = new ArrayCount();

        String[] array = {"aaaa", "bbbb", "ccc", "dddd", "aaaa"};
        String str = "aaaa";

        assertEquals(2,arrayCount.count(array,str),"Not consistent with the expected results");
    }


    public int count(String[] array, String target) {
        //store count num
        int count = 0;

        //use for loop to across whole array
        for (String s : array) {
            //If the string in this loop is equal to the string to be compared, count + 1
            if (s.equals(target)) {
                count++;
            }
        }
        //return count 
        return count;
    }
}
