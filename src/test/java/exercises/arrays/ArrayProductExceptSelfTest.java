package exercises.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayProductExceptSelfTest {

    @Test
    public void getProduct() {

        ArrayProductExceptSelf array = new ArrayProductExceptSelf();

        int[] expected = new int[] {24,12,8,6};

        int[] results = array.getProduct(new int[] {1,2,3,4});

        Assert.assertNotNull(results);
        Assert.assertArrayEquals(expected, results);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getProductWithException() {
        ArrayProductExceptSelf array = new ArrayProductExceptSelf();

        array.getProduct(new int[] {});
    }
}