import java.util.*;
public class Double{
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        
        for(int i=0;i<n1;i++){
            l1.add(sc.nextInt());

        }
        for(int j=0;j<n2;j++){
            l2.add(sc.nextInt());

        }
        l1.addAll(l2);
        System.out.println(l1);

        Collections.sort(l1);
        System.out.println(l1);
    }
}
       