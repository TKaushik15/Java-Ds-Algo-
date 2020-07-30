import java.util.Scanner;
class linear_search
{
 public static void main(String[] args)
  // We will read an array and read the element we need to find
  // We will declare var flag= 0 and use a for loop to find the elemtnt 
  
 {  Scanner sc =new Scanner (System.in);
     int n = sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
       a[i]=sc.nextInt();
     }
     int x=sc.nextInt();
  
     int j;
     int flag=0;
     for(j = 0; j < n; j++) 
    { 
        if(a[j] == x) 
          { 
            flag=1;
        break;}
    } 
    if(flag==1)
    System.out.print("element is found at index"+" "+j);
    else
    System.out.print("element not found");
 }
}
