import java.util.Scanner;

public class coding_ninja_problem_01 {
    public static int search(int[] nums, int target) {
        //Your code goes here
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               return i;

            }
        }
       return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int target=sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }


        int result=search(A,target);
        System.out.println(result);
    }

}
