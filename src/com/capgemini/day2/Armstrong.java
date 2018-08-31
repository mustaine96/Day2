package com.capgemini.day2;

public class Armstrong {

	public static boolean checkIfArmstrong(int i) {
		
		int num=i,fl=0, a=num;
		while(num!=0)
		{//System.out.println( fl);
			fl+=Math.pow((num%10),3);
			num=num/10;
		}
		if(fl==a)
		{
			System.out.println("Armstrong number");
			return true;
		}
		else {
			System.out.println("jnot Armstrong number"+ fl);
		
		
		return false;}
		// TODO Auto-generated method stub
		
	}

}
