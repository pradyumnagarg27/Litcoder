import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] o=s.nextLine().split(",");
        List<String> a=new ArrayList<>();
        List<String> b=new ArrayList<>();
        for(String c:o){
            if(c.charAt(0)=='1'){
                b=new ArrayList<>(a);
                a.addAll(Arrays.asList(c.substring(2).split("")));
            } else if(c.charAt(0)=='2'){
                b=new ArrayList<>(a);
                int d=Integer.parseInt(c.substring(2));
                int e=a.size()-d;
                if(e>=0){
                    for(int i=0;i<d;i++){
                        a.remove(a.size()-1);
                    }
                }
            } else if(c.charAt(0)=='3'){
                b=new ArrayList<>(a);
                int d=Integer.parseInt(c.substring(2));
                if(d<=a.size()){
                    System.out.println(a.get(d-1));
                }
            } else if(c.charAt(0)=='4'){
                a=new ArrayList<>(b);
            }
        }
        s.close();
    }
}
                                                                                                                            