import java.util.Scanner;

public class array_intro {

    public static void main(String[] args) {
	//LET US READ THE VALUE OF N USING SCANNER FUNCTION AND MAKE N NO. OF ARRAY ELEMENTS USING LOOP   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=scan.nextInt();
        }
        scan.close();

        // PRINTING EACH ELEMENT OF THE ARRAY
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
