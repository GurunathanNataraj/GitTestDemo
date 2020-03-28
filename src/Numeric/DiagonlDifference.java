package Numeric;

public class DiagonlDifference {

	public int diagonalDifference(int arr[][])
	{
		int right=0;
		int left=0;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					right+=arr[i][j];
				}
				if((i+j)==(arr.length-1))
				{
					left+=arr[i][j];
				}
				
			}
		}
		return right-left;
	}
	public static void main(String[] args) {
		
		DiagonlDifference obj=new DiagonlDifference();
		int arr[][]= {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		System.out.println(obj.diagonalDifference(arr));
		
		
	}
}
