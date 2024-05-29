package com.day3;

import java.io.FileNotFoundException;

public class Exception1 {

	public void add(int a) {
		if (a < 3) {
			throw new ArithmeticException();
		}

	}

	public void multiply(int a) throws ArithmeticException, ClassCastException, FileNotFoundException {
		if (a < 3) {
			throw new ArithmeticException();
		} else if (a == 4) {
			throw new ClassCastException();
		} else if (a == 10) {
			throw new FileNotFoundException();

		} else {
			System.out.println("No Exception : ");
		}
		{
		
		}

	}

	public static void main(String[] args) {

		Exception1 egobj = new Exception1();
		try {
		
			
			egobj.multiply(100);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		
		}catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
		}
		try {
		egobj.add(10);
			
	
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}