import java.util.*;
public class Main{
    static int eggDrop(int n, int k)
    {
        if (k == 1 || k == 0)
            return k;
 
        if (n == 1)
            return k;
 
        int min = Integer.MAX_VALUE;
        int x, res;
        for (x = 1; x <= k; x++) {
            res = Math.max(eggDrop(n - 1, x - 1),eggDrop(n, k - x));
            if (res < min)
                min = res;
        }
 
        return min + 1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        System.out.print(eggDrop(n, k));
    }
}
                                                                                                                            