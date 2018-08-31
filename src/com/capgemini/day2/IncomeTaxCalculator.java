package com.capgemini.day2;

public class IncomeTaxCalculator {

	public static double taxCalculator(double i) {
		if(i<=180000) {
			double fl=0;
		return fl;}
		else if(i<=300000) {
			double fl=(i*10)/100;
			return fl;}
		else if(i<=500000) {
			double fl=(i*20)/100;
			return fl;}
		else {
			double fl=(i*30)/100;
			return fl;}
		//return i;
	}

}
