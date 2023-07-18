package weekday1.day2Assignment;

import java.util.Iterator;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum=0;
		int secondnum=1;
		int range=8;
		System.out.println(firstnum+" "+secondnum);
		for(int i=2;i<=range;i++)
		{
		int sum=firstnum+secondnum;
		System.out.println(""+sum);
		firstnum=secondnum;
		secondnum=sum;
		}
		
	}

}
