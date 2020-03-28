package ElectricityBill;

public class BillCalculation {
	
	public double billCalcuation(int units)
	{
		double UnitCharge=0;
		double TaxAmount=0;
		
		
		if(units<=100)
		{
			UnitCharge=FirstHundredUnitCalculation(units);
		}
		else if(units>100 && units<=300)
		{
			UnitCharge=FirstHundredUnitCalculation(100)+SecondHundredUnitCalculation(units-100);
			
		}
		else if(units>300)
		{
			UnitCharge=FirstHundredUnitCalculation(100)+SecondHundredUnitCalculation(200)+AboveTwoHundredUnitCalculation(units-300);
		}
		
		TaxAmount=(ElectricyCharges.serviceTaxInPercentage/100)*UnitCharge;
		
		
		return UnitCharge+TaxAmount;
		
	}
	
	public double FirstHundredUnitCalculation(int unit)
	{
		return unit*ElectricyCharges.firstHundredUnitCharge;
	}
	public double SecondHundredUnitCalculation(int unit)
	{
		return unit*ElectricyCharges.secondTwoHundredUnitCharge;
	}
	public double AboveTwoHundredUnitCalculation(int unit)
	{
		return unit*ElectricyCharges.aboveThreeHundredUnitCharge;
	}
	
	
	

}
