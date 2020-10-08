package javaprogram1;

import java.util.Scanner;

public class logo {
	protected int computerType;
	public int allspeed;
	public int allamount;
	logo(){
		Scanner logo =new Scanner(System.in);
		computerType = logo.nextInt(); 			//用来输入电脑的型号
		if(computerType == 1) {
			System.out.println("Welcome to Window10");
		}else if(computerType == 2 ){
			System.out.println("welcome to Windows 8");
		}else if(computerType == 3) {
			System.out.println("Welcome to MacOs");
		}
	}
}
