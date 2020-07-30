
import java.util.Scanner;



public class Binary_Search  {
    public static void main(String args[])
    {
        //LET US TAKE A VAR VAR=0 AND SCAN THE VALUES IN VARIABLES v, n , AND ARRAY a and sort it
        int flag=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);

        // IN BINARY SEARCH, WE TAKE 2 INDEX VALUES AND NAME THEM HIGH AND LOW RESPECTIVELY AND DO COMPARISON BETWEEN THEM USING THE MIDDLE VALUE
        

        int low=0;
        int high=n-1;
        while (high >= low)
        {
            int mid = (low + high) / 2;

            if(a[mid]<v)
            {
                low=mid+1;
            }
            else if(a[mid]>v)
            {
                high=mid-1;
            }
            else if(a[mid]==v)
            {
                flag=1;
                System.out.println( v+"is found at index"+ (mid));
                break;
            }
        }
        if(flag==0)
            System.out.println( v+"is  not found at index ");
    }

}
