
import java.util.* ;
        import java.io.*;
public class  coding_ninja_problem_02{
    public static class Pair {
        int idx = 0;
        ArrayList< Integer>list = new ArrayList< >();
    }
    public static int[] anagramMapping(int n, int[] a, int[] b) {
        HashMap< Integer, Pair>map = new HashMap< >();
        for (int i = 0; i < b.length; i++) {
            if (map.containsKey(b[i])) {
                Pair p = map.get(b[i]);
                p.list.add(i);
            } else {
                Pair p = new Pair();
                p.list.add(i);
                map.put(b[i], p);
            }
        }
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            Pair p = map.get(a[i]);
            ans[i] = p.list.get(p.idx);
            p.idx++;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        int[] B=new int[N];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
        }
        int[] result=anagramMapping(N,A,B);
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
    }

}
