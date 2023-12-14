
                                                                                                                                    import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        System.out.println(caesarCipher(a));
    }
    
    public static StringBuffer caesarCipher(String text) {
        StringBuffer result= new StringBuffer();
 
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + 4 - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) + 4 - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
}
                                                                                                                            