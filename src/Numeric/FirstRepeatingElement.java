package Numeric;

public class FirstRepeatingElement {
	
	public int firstRepeatingElement(int arr[])
	{
		int out = 0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(flag)
			{
				break;
			}
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					out=arr[i];
					flag=true;
					break;
				}
			}
		}
		
		return out;
	}
	public static void main(String[] args)
	{
		int arr[]= {1,3,2,4,2,3,2,3};
		FirstRepeatingElement obj=new FirstRepeatingElement();
		System.out.println(obj.firstRepeatingElement(arr));
	}

}
