import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tar = input.nextInt();
        input.nextLine();
        String[] arr = input.nextLine().split(" ");
        int count=0;
        int[] a=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i]=Integer.parseInt(arr[i]);
        }
        for(int i=0;i<a.length-1;i++){
            boolean[] ch=new boolean[arr.length];
            int c=0;
            for(int j:a){
                if(j>tar){
                    ch[c]=true;
                } else{
                    ch[c]=false;
                }
                c++;
            }
            boolean check=true;
            for(boolean y:ch){
                if(!y){
                    check=false;
                }
            }
            if(!check){
                Arrays.sort(a);
                int ele=a[0]+2*a[1];
                a=Arrays.copyOfRange(a,1,a.length);
                a[0]=ele;
                count++;
            } else{
                break;
            }
        }
        System.out.println(count+1);
    }
}
                                                                                                                            