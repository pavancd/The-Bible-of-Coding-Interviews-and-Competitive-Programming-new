package PigeonHolePrinciple;

public class PigeonHolePrinciple {

  public static void findNumb(int n) {
     System.out.println("execution started ...");
        int num = 100005;
        int[] fa = new int[num];
        int rem = 0;
        for(int i=0; i<=n; i++) {
            rem = (rem * 10 + 1) % n;

            if (rem == 0) {
                for(int j=0; j<=i; j++) {
                    System.out.print(1);
                }
                return;

            }

            if(fa[rem] != 0) {
                for(int j=0; j<=i - fa[rem]; j++) {
                    System.out.print(1);
                }
                for(int j=0; j<=fa[rem]; j++) {
                    System.out.print(0);
                }
                return;
            }
            fa[rem]= i;
        }
        System.out.println("execution finished ...");
  }
}

