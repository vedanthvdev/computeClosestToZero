import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ZeroComputeTest {


@Test
public void testOnlyNegative(){
    int[] a = new int[]{-22, -22};
    assertEquals(-22, ZeroCompute.computeToZero(a));
}

@Test
public void testBasicPositive(){
    int[] b = new int[]{1, 2, 3, 4};
    assertEquals(1, ZeroCompute.computeToZero(b));
}

@Test
public void testClosestBothPositiveAndNegative(){
    int[] c = new int[]{-5,5,10};
    assertEquals(5, ZeroCompute.computeToZero(c));
}

@Test
public void testSingleNegative(){
    int[] d = new int[]{-224};
    assertEquals(-224, ZeroCompute.computeToZero(d));
}

@Test
public void testComplexNumbers(){
    int[] e = new int[]{-3,4,-8,7,9,5,76,2};
    assertEquals(2, ZeroCompute.computeToZero(e));
}
    
}
