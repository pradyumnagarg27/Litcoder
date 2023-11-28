import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String pattern = input.nextLine();
        int res=0,c1=0,c2=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==pattern.charAt(1)){
                res+=c1;
                c2++;
            }
            if(text.charAt(i)==pattern.charAt(0)){
                c1++;
            }
        }
        if(c1>c2){
            System.out.print(res+c1);
        } else {
            System.out.print(res+c2);
        }
    }
}
                                                                                                                            