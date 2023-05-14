import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        int lc1=countLeaders(a,n1);
        int lc2=countLeaders(b,n2);
        if(lc1>lc2)
        System.out.println(1);
        else
        System.out.println(2);
    }
    public static int countLeaders(int[] arr,int n){
        int count=0;
        int max=arr[n-1];
        count++;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                count++;
            }
        }
        return count;
    }
}