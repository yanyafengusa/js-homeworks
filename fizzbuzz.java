import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args)
	{
		//ArrayList al=new ArrayList();
		int al[] = new int[241];
		int num=(int) (Math.random()*240+1);//length of al[]
		
		for(int i=0;i<num;i++)
		{
			al[i]=(int) (Math.random()*240+10);// the element of al[]
		}
		function(al,num);
		return;
        
    }
	public static int function(int a[],int num)
	{

		for(int m=0;m<num;m++)
		{

			if(a[m]%3==0&&a[m]%5!=0)
			{
				System.out.println(a[m]+" Buzz");
			}
			else if(a[m]%3!=0&&a[m]%5==0)
			{
				System.out.println(a[m]+" Fizz");
			}
			else if(a[m]%15==0)
			{
				System.out.println(a[m]+" BuzzFizz");
			}
			else
				System.out.println(a[m]);
		
		}
		return 0;
	}
}
