import java.util.Scanner;
public class array_rev {
  public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  
  //READING SIZE OF ARRAY
  System.out.print("What is Size of your array: ");
  int size=sc.nextInt();
  
  //CREATING ARRAY
  int arr[]=new int[size];
  
  
  //READING ELEMENTS USING FOR LOOP
  System.out.print("Enter Elements of array: ");
  for(int i=0;i<size;i++)
  arr[i]=sc.nextInt();
  
  //REVERSING THE ARRAY USING FOR LOOP FROM n-1 INDEX TO 0th INDEX POSITION
  System.out.print("Reversed Array: ");
  for(int i=size-1;i>=0;i--)
  System.out.print(arr[i]+" ");
  
 }
}
