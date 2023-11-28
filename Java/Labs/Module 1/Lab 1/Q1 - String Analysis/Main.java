import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.next();
        doSomething(str);
    }
    
    public static void doSomething(String str) {
        float u=0,l=0,d=0,s=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                u++;
            }
            else if (Character.isLowerCase(str.charAt(i))){
                l++;
            }
            else if (Character.isDigit(str.charAt(i))){
                d++;
            }
            else{
                s++;
            }
        }
        float t=100/(u+l+d+s);
        DecimalFormat df=new DecimalFormat("#.###");
        System.out.println(df.format(u*t)+"%");
        System.out.println(df.format(l*t)+"%");
        System.out.println(df.format(d*t)+"%");
        System.out.println(df.format(s*t)+"%");
    }
}
                                                                                                                            