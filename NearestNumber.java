import java.util.Scanner;
public class NearestNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter size of array");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int sum=0;
		int sum1=0;
		int x=0;
		int y=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum=Math.abs(a[i]+a[j]);
				if(i==0 && j==1)
				{
					sum1=sum;
					x=a[i];
					y=a[j];
					
				}
				if(sum<sum1)
				{
					sum1=sum;
					x=a[i];
					y=a[j];
				}
				
				
			}
			
		}
		System.out.println("the two elements whose sum is nearest to zero : "+x+" "+y);
	}

}
