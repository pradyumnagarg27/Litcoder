import java.util.*;
class Main{
    public static int minimumNumbers(int num,int k){
        if(num==0){
            return 0;
        }
        for(int i=1;i*k<=num && i<=10;i++){
            if(num%10==((i*k)%10)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        try{
            Scanner s=new Scanner(System.in);
            int num=s.nextInt();
            int k=s.nextInt();
            System.out.println(minimumNumbers(num,k));
        } catch(NoSuchElementException e){
            System.out.println(-1);
        }
    }
}
                                                                                                                            