import java.util.*;

class Result{
    public static int legoBlocks(int a,int b){
        if(a<2||b<1) return 0;
        if(b==1) return 1;
        long[] c=new long[b+1];
        for(int i=0;i<c.length;i++){
            c[i]=-1;
        }
        d(c,b);
        for(int i=0;i<c.length;i++){
            long e=1;
            for(int j=0;j<a;j++){
                e=(e*c[i])%MOD;
            }
            c[i]=e;
        }
        long[] f=new long[b+1];
        for(int i=0;i<f.length;i++){
            f[i]=-1;
        }
        g(c,f,b);
        return (int)(f[b]%MOD);
    }
    static long MOD=1000000000+7;
    static long g(long[] c,long[] f,int i){
        if(f[i]==-1){
            if(i==1){
                f[i]=1;
            }
            else{
                f[i]=c[i];
                for(int j=1;j<i;j++){
                    f[i]-=(g(c,f,j)*c[i-j])%MOD;
                }
            }
        }
        return f[i];
    }
    static long d(long[] c,int i){
        if (i<0) return 0;
        if(c[i]==-1){
            if(i==0||i==1)
                c[i]=1;
            else
                c[i]=(d(c,i-1)+d(c,i-2)+d(c,i-3)+d(c,i-4))%MOD;
        }
        return c[i];
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        System.out.print(Result.legoBlocks(n,m));
    }
}
                                                                                                                            