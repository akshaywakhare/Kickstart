import java.io.*;
import java.util.*;

public class Main {

  // For fast input output
  static class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      try {
        br = new BufferedReader(new FileReader("input.txt"));
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        // System.setOut(out);
      } catch (Exception e) {
        br = new BufferedReader(new InputStreamReader(System.in));
      }
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }

  // end of fast i/o code
  public static void main(String[] args) {
    FastReader sc = new FastReader();
    int t = sc.nextInt();
    int m = 1;
    while (t-- > 0) {
      int n = sc.nextInt();
      List<String[]> fabric1 = new ArrayList<>();
      List<String[]> fabric2 = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        String[] s = sc.nextLine().split(" ");
        fabric1.add(new String[] { s[0], s[1], s[2] });

        fabric2.add(new String[] { s[0], s[1], s[2] });
      }
      Collections.sort(
        fabric1,
        (a, b) -> {
          if (a[0].equals(b[0])) return a[2].compareTo(b[2]);
          return a[0].compareTo(b[0]);
        }
      );

      Collections.sort(
        fabric2,
        (a, b) -> {
          if (a[1].equals(b[1])) return a[2].compareTo(b[2]);
          return a[1].compareTo(b[1]);
        }
      );
      int ans = 0;
      for (int i = 0; i < n; i++) {
           if (fabric1.get(i)[2].equals(fabric2.get(i)[2])) ans++;
      }
      System.out.println("Case #" + m + ": " + ans);
      m++;
    }
  }
}
