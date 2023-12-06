import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String i=s.nextLine();
        p(i.split(","));
        s.close();
    }
    public static void p(String[] q){
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        for(String qy:q){
            String[] p=qy.trim().split(" ");
            int t=Integer.parseInt(p[0]);
            if(t==1){
                int v=Integer.parseInt(p[1]);
                s1.push(v);
            } else if(t==2){
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                }
                if(!s2.isEmpty()){
                    s2.pop();
                }
            } else if(t==3){
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                }
                if(!s2.isEmpty()){
                    System.out.println(s2.peek());
                }
            }
        }
    }
}
                                                                                                                            