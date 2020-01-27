package FastModularExpo;


public class FastModularExpo {

    public static long fastModularExpo(long a, long n, int MOD) {

      /***

      a =2, n=6, MOD=5
      iteration
      1 ans->1, a->4 n->3
      2 ans->4, a->4 n->2
      3 ans->4, a->1 n->1
      ***/
      System.out.println(a);
      System.out.println(n);
      System.out.println(MOD);


        long ans = 1;

        while(n>=1) {
            if(n%2==0) {
                a = (a*a)%MOD;
                n /= 2;
            } else {
                ans = (ans * a)%MOD;
                n -= 1;
            }
        }

        return ans;
    }
}