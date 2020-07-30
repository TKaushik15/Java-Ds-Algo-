import java.util.Scanner;

class bubble_sort
{
    public static void main(String[] args)
  {
	    //IN BUBBLE SORT, WE COMPARE 2 ADJACENT ELEMENTS AND CHECK WHICH ONE IS GREATER AND SWAP THEM ACCORDINGLY USING A TEMPORARY VARIABLE temp
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
      }
      
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n-1;j++)
		  {
			  //COMPARING ADJACENT INDEX ELEMENTS
			  if(a[j]>a[j+1])
			  {
				  int temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
			  }
		  }
	  }
	  
	  for(int i=0;i<n;i++)
	  {
		  System.out.print(a[i]);
	  }
  }
}
