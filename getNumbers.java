package Quiz;

import java.util.Scanner;

public class getNumbers {
	
	String num1,num2;
	Scanner sc = new Scanner(System.in);
	

	String getFirstNumber()
	{
		
		System.out.print("ù ��° ���� �Է�: ");
		num1 = sc.nextLine();
		boolean f1 =checklfDigit(num1);
		if(f1 == false)
		{System.out.println("���ڰ��ƴմϴ�."); num1 = getFirstNumber();}
		return num1;
	}
	String getSecondNumber()
	{
		
		System.out.print("�� ��° ���� �Է�: ");
		num2 = sc.nextLine();
		boolean f1 =checklfDigit(num2);
		if(f1 == false)
		{System.out.println("���ڰ��ƴմϴ�."); num1 = getFirstNumber();}
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
