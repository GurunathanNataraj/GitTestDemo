package ElectricityBill;

public class UserClass extends BillCalculation{
	
	public static void main(String[] args) {
		double TotalBillAmount=0;
		
		BillCalculation obj=new BillCalculation();
		TotalBillAmount=obj.billCalcuation(1000);
		
		System.out.println(TotalBillAmount);
	}

}
