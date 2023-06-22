import java.util.Scanner;

public class coding_ninja_problem_03 {

    public static int maximizeMinSubarraySum( int n,int[] arr) {
        n=arr.length;
        int maxMinSum = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            int subarraySum = arr[i] + arr[i + 1];
            maxMinSum = Math.max(maxMinSum, subarraySum);
        }

        return maxMinSum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int N=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int maxMinSum = maximizeMinSubarraySum(n,arr);
        System.out.println("Maximum minimum sum of subarrays: " + maxMinSum);
    }
}
