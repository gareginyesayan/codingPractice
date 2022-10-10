package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static leetcode.LongestPrefix.returnLongestPrefix;
import static org.testng.Assert.*;

public class LongestPrefixTest {

    @Test
    public void test001(){
        String[] strs = {"flower", "flow", "flight"};
        String prefix = returnLongestPrefix(strs);
        Assert.assertEquals(prefix, "fl");
    }

}