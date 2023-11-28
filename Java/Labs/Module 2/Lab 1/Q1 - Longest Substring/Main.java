import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int maxLength=0;
        Set<Character> charSet=new HashSet<>();
        int left=0;
        for(int right=0;right<n;right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
            } else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        System.out.print(maxLength);
    }
}
                                                                                                                            