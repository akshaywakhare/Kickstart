import java.io.*;
import java.util.*;

public class water_container {

  // For fast input output
  static class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      try {
        br = new BufferedReader(new FileReader("input.txt"));
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);
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
    int n=sc.nextInt();
    int q=sc.nextInt();
    int[][] a=new int[n-1][2];
    for(int i=0;i<n;i++){
        a[i][0]=sc.nextInt();
        a[i][1]=sc.nextInt();
    }
    int[] water=new int[q];
    for(int i=0;i<q;i++){water[i]=sc.nextInt();}
    int ans=0;
    if(n>q)ans=n;
    else if(q%2==1)ans=Math.min(n,q);
    else {ans=q-1;
    if(n==q)ans++;}

    System.out.println("Case #" + m + ": " + ans);
    m++;
        
}
  }}
// }
// 1 2 2 2 2 2 2 2 
// 1 3 5 7 9


//         4             5
//         2           3
//             1
