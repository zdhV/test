package com.zdh.ss;

import java.util.Random;
import java.util.Scanner;

public class test {
	public int a,b;
	ran ts;
	
	public test(){
		a=new Random().nextInt(10);
	    b=new Random().nextInt(10);
	    System.out.println(a);
	    System.out.println(b);
	    ts=new ran(a, b);
	    ts.pan();
	    
	}

}
class ran {
	int a,b;
	
	public ran(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void pan() {
		Scanner sn = new Scanner(System.in);
		int num=Integer.parseInt(sn.nextLine());
		if(num==a*b) {
			new test();
		}
		else {
			System.out.println("err");
		}
	}
}