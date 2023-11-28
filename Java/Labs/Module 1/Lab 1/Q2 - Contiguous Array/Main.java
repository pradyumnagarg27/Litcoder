import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        ArrayList<Integer> nums=new ArrayList<Integer>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                nums.add(0);
            }
            else if(str.charAt(i)=='1'){
                nums.add(1);
            }
        }
        int ret = doSomething(nums);        
        System.out.println(ret);
    }
    
    public static int doSomething(ArrayList<Integer> nums) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            int zero=0,one=0;
            for(int j=i;j<nums.size();j++){
                if(nums.get(j)==0){
                    zero++;
                }else{
                    one++;
                }
                if(zero==one){
                    count=Math.max(count,j-i+1);
                }
            }
        }
        return count;
    }
}
                                                                                                                            