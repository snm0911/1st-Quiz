package Quiz;

import java.util.Scanner;

public class Mycalc {
	public static void main(String args[])
	{
		getNumbers n = new getNumbers();
		Scanner s = new Scanner(System.in);
		showMenu();
		int a = s.nextInt();
		String num1,num2;
		double result = 0;
		num1 = n.getFirstNumber();
		num2 = n.getSecondNumber();
		switch(a)
		{
			case 1: {result=addNumbers(num1,num2);System.out.println("결과값 "+num1+"+"+num2+"="+result);break;}
			case 2: {result=subNumbers(num1,num2);System.out.println("결과값 "+num1+"-"+num2+"="+result);break;}
			case 3: {result=multNumbers(num1,num2);System.out.println("결과값 "+num1+"*"+num2+"="+result);break;}
			case 4: {result=divNumbers(num1,num2);System.out.println("결과값 "+num1+"/"+num2+"="+result);break;}
		}
	}
	static void showMenu()
	{
		System.out.println("1.더하기  2.빼기 3.곱하기 4.나누기");
		System.out.print("위의 옵션 번호중 하나를 선택하십시오.");
	}
	static double convertNumbers(String num)
	{
		double a= Double.parseDouble(num);
		return a;
	}
	static double addNumbers(String num1,String num2)
	{
		double a,b ;
		a= convertNumbers(num1);
		b= convertNumbers(num2);
		return a+b;
	}
	static double divNumbers(String num1,String num2)
	{

		double a,b;
		a= convertNumbers(num1);
		b= convertNumbers(num2);
		return a/b;
	}
	static double subNumbers(String num1,String num2)
	{

		double a,b;
		a= convertNumbers(num1);
		b= convertNumbers(num2);
		return a-b;
	}
	static double multNumbers(String num1,String num2)
	{

		double a,b;
		a= convertNumbers(num1);
		b= convertNumbers(num2);
		return a*b;
	}
}
