import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class ThreeSumTest {

  int MAX = 3;
  int[] a = new int[N];
  for (int i = 0; i < N; i++) {
    a[i] = StdRandom.uniform(-MAX, MAX);
  }
  public ThreeSum testThreeSum = new ThreeSum(a);
  cnt = testThreeSum.count();

  @Test
  public void thisAlwaysPasses() {
  }

  @Test
  @Ignore
  public void thisIsIgnored() {
  }

  @Test
  public void examples() {
    assertTrue("Test 1 failure: should be true.", true);
    assertFalse("Test 2 failure: should be false.", false);
    assertEquals("Test 3 failure: 0 should equal 0.", 0, 0);
  }

  @Test
  public void basicThreeSum() {
    assertTrue("Test 1 failure: count should never be negative.", (cnt >= 0));
    assertTrue("Test 2 failure: count should never be more than one.", (cnt < 2));
  }

  //@Test
  //public void willAlwaysFail() {
  //  fail("An error message");
  //}
}
