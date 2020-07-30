import java.util.Scanner;

public class left_rotation {

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int s=sc.nextInt();
       int arr1[]=new int[s];
       int ss[]=new int[n-s];
       for(int i=0;i<s;i++)
       {
           arr1[i]=sc.nextInt();
       }   
    for(int j=0;j<n-s;j++)
    {
        arr2[j]=sc.nextInt();
    }
    sc.close();
    for(int i=0;i<arr2.length;i++)
    {
    System.out.print(arr2[i]+" ");
    }
    for(int y=0;y<arr.length;y++)
    {
        System.out.print(arr[y]+" ");
    }
    }
}
