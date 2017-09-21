package Quiz;

import java.util.Scanner;

public class getNumbers {
	
	String num1,num2;
	Scanner sc = new Scanner(System.in);
	

	String getFirstNumber()
	{
		
		System.out.print("첫 번째 숫자 입력: ");
		num1 = sc.nextLine();
		boolean f1 =checklfDigit(num1);
		if(f1 == false)
		{System.out.println("숫자가아닙니다."); num1 = getFirstNumber();}
		return num1;
	}
	String getSecondNumber()
	{
		
		System.out.print("두 번째 숫자 입력: ");
		num2 = sc.nextLine();
		boolean f1 =checklfDigit(num2);
		if(f1 == false)
		{System.out.println("숫자가아닙니다."); num1 = getFirstNumber();}
		return num2;
	}
	boolean checklfDigit(String num)
	{
		for(int i=0; i<num.length(); i++) {
            char ch = num.charAt(i);
            
            if(ch<'0' || ch>'9') {
            	return false;
            }
        }
		return true;
	}
}
