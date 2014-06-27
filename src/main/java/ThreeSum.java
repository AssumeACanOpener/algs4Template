public class ThreeSum {

  public static int count(int[] a) {
    int N = a.length;
    int cnt = 0;
    // Count how many sets of 3 elements in the input sum to zero
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        for (int k = j + 1; k < N; k++) {
          if (a[i] + a[j] + a[k] == 0) {
            cnt++;
          }
        }
      }
    }
    return cnt;
  }

  public static double timeTrial(int N) {
    // Initialize a with N random integers in the range of -MAX to MAX
    int MAX = 1000000;
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniform(-MAX, MAX);
    }

    // Time how long it takes to run ThreeSum.count() with the given input
    Stopwatch timer = new Stopwatch();
    int cnt = ThreeSum.count(a);
    return timer.elapsedTime();
  }

  public static void main(final String[] args) {
    // Run time trials, doubling the size of the input each time
    for (int N = 128; true; N += N) {
      double time = timeTrial(N);
      StdOut.printf("%7d %5.1f\n", N, time);
      if (N == 4096) {
        break;
      }
    }
  }
}
