import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class ThreeSumTest {

  public int MAX = 3;
  public ThreeSum testThreeSum = new ThreeSum();

  @Test
  public void thisAlwaysPasses() {
  }

  @Test
  @Ignore
  public void thisIsIgnored() {
  }

  @Test
  public void assertExamples() {
    assertTrue("Test 1 failure: should be true.", true);
    assertFalse("Test 2 failure: should be false.", false);
    assertEquals("Test 3 failure: 0 should equal 0.", 0, 0);
  }

  @Test
  public void simpleThreeSum() {
    // Generate some data to feed to ThreeSum.count()
    int[] a = new int[MAX];
    for (int i = 0; i < MAX; i++) {
      a[i] = StdRandom.uniform(-MAX, MAX);
    }

    int cnt = testThreeSum.count(a);
    // This should always be true
    assertTrue("Test 1 failure: count should never be negative.", (cnt >= 0));
    // If MAX == 3 then this should always be true
    assertTrue("Test 2 failure: count should never be more than one.", (cnt < 2));
  }

  //@Test
  //public void willAlwaysFail() {
  //  fail("An error message");
  //}
}
