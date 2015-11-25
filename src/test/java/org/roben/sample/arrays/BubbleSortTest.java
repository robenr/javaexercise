package org.roben.sample.arrays;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testLengthOfTheUniqueKey() {

        BubbleSort obj = new BubbleSort();
        Assert.assertArrayEquals(new char[]{'e', 'l', 'r', 'z'}, obj.sort(new char[]{'r', 'z', 'l', 'e'}));

    }

}
