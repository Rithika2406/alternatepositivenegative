import java.util.Scanner;public class Main
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    int n=S.nextInt();
	    int arr[]=new int[n];
	    int result[]=new int[n];
	    int pos=0;
	    int neg=1;
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=S.nextInt();
	        
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]>0)
	        {
	            result[i]=arr[i];
	            pos+=2;
	        }
	        else{
	            result[i]=arr[i];
	            neg+=2;
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
		System.out.print(result[i]+" ");
	    }
	}
}