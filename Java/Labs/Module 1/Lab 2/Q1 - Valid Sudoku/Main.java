import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x=s.nextLine();
        int[][] b=new int[9][9];
        for(int i=0;i<9;i++){
            String[] r=s.nextLine().split(" ");
            for(int j=0;j<9;j++){
                if(r[j].equals(".")){
                    b[i][j]=0;
                } else{
                    b[i][j]=Integer.parseInt(r[j]);
                }
            }
        }
        System.out.println(v(b));
        s.close();
    }
    public static String v(int[][] b){
        for(int i=0;i<9;i++){
            if(!c(b,i,0,i,8)){
                return "NO";
            }
        }
        for(int j=0;j<9;j++){
            if(!c(b,0,j,8,j)){
                return "NO";
            }
        }
        for(int r=0;r<9;r+=3){
            for(int c=0;c<9;c+=3){
                if(!c(b,r,c,r+2,c+2)){
                    return "NO";
                }
            }
        }
        return "YES";
    }
    public static boolean c(int[][] b,int sr,int sc, int er,int ec){
        boolean[] v=new boolean[10];
        for(int i=sr;i<=er;i++){
            for(int j=sc;j<=ec;j++){
                int n=b[i][j];
                if(n!=0){
                    if(v[n]){
                        return false;
                    }
                    v[n]=true;
                }
            }
        }
        return true;
    }
}
                                                                                                                            