package javaprogram1;
import java.util.Scanner;				//引用Scanner类
public class Test3{
	public static void main(String args[]){
		System.out.println("请输入电脑型号：1为联想电脑；2为华为电脑；3苹果电脑");
		logo logo1 = new logo();		//用来输入电脑型号.输出不同电脑型号的内存大小和运行速度
		if(logo1.computerType == 1) {
			logo1.allamount = 520;
			logo1.allspeed = 2560;
		}else if(logo1.computerType == 2){
			logo1.allamount = 650;
			logo1.allspeed = 3567;
		}else if(logo1.computerType == 3) {
			logo1.allamount = 750;
			logo1.allspeed = 5621;
		}else {
			System.out.println("输入错误，结束！");
		}
		CPU cpu1 = new CPU();
		HardDisk disk1 = new HardDisk();
		cpu1.setSpeed(logo1.allspeed);			//调用CPU类创建的setSpeed方法，给对象cpu1的speed赋值
		disk1.setAmount(logo1.allamount);			//调用HarDisk类创建的setAmount方法，给对象disk1的amount赋值
		PC pc =new PC ();
		pc.setCPU(cpu1);				//调用PC类创建的setCPU函数
		pc.setHardDisk(disk1);			//调用PC类创建的setHarDisk函数
		pc.show();				//调用PC创建的show函数用来输出CPU的运行速度值和PC的容量值
		Scanner beginTime = new Scanner(System.in);
		System.out.println("请输入电脑开始工作的时间工作时间（h）：");
		int beginTime1=beginTime.nextInt();							//输入电脑开始运行的时间
		System.out.println("请输入电脑现在的时间（h）：");						//输入目前时间
		Scanner overTime = new Scanner(System.in);
		int overTime1 = overTime.nextInt();
		CPU cpu = new CPU((overTime1-beginTime1));		//利用构造方法，输出CPU的工作时间 
		System.out.println("请输入计算机的剩余内存");
		Scanner reader1 =new Scanner(System.in);
		HardDisk disk = new HardDisk(reader1.nextDouble());				//利用构造方法，输出电脑剩余的内存
			
			
				}
}