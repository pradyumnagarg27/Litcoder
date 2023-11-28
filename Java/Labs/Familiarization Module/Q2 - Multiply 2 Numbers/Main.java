import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ret = mul(a,b);        
        System.out.println(ret);
    }
    
    public static int mul(int x, int y) {
        return x * y;
    }
}
                                                                                                                            