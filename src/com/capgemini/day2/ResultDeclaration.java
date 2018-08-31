package com.capgemini.day2;

public class ResultDeclaration {

	public static String declareResult(int sub1, int sub2, int sub3) {
		int fl=0;
		if(sub1>60)
			fl++;
		if(sub2>60)
			fl++;
		if(sub3>60)
			fl++;
		if(fl==3)			
		return "Passed";
		else if(fl==2)
		return "Promoted";
		else
			return "Failed";
	}

}
