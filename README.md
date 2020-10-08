# java-lishengxiang
java任务仓库
# java实验报告
###  课程名称：Java程序语言设计
### 班级： 计191
### 姓名： 李胜祥 
### 学号： 2019311326
### 教师： 张世博
## 一.实验目的
1. 学会类的创建。  
2· 掌握对象的创建，对象对属性和行为的调用和赋值。  
3· 掌握构造方法的创建，并学会使用如何调用构造方法。  
4· 理解并掌握修饰符public,protected,友好型，private各自作用。  
## 二·实验过程
    用类表述计算机中CPU的速度和硬盘的容量，程序有五个类，名字分别为PC,CPU,HarDisk，logo和Test，其中Test是主类，将其写在同一个包的不同的java文件中。  
    在cpu类中创建共有整型变量speed，用来记录CPU的工作速度。私有整型变量time，记录CPU的工作时间。创建CPU构造方法，参数为整型，用来输出电脑已经工作的时间。    
    在HardDisk类中，创建一个受保护的整形变量amount，用来记录电脑的容量，一个公共的的双浮点型变量spareamount，用来记录电脑剩余的内存。创建HardDisk构造方法，
    用来输出电脑剩余的容量，并判断电脑是否需要清理。在logo类中创建一个logo构造方法，用来输入不同品牌电脑，输出各自电脑的操作系统类型 。PC类则用来输出CPU目前  
    的速度和硬盘目前的容量。  
## 三·核心方法
### 在CPU类中：  
  public int speed;	//创建一个共有整型变量speed，用来记录CPU的工作速度  
	private int time ;		//创建一个私有整型变量time，记录CPU的工作时间  
	CPU (int m){				//创建构造方法，用来判断 CPU的工作时长  
		time = m;  
		System.out.println("cpu的工作时间(小时)为："+time+"hour");				//输出cpu的工作时间  
		if(time>=5) {
			System.out.println("----------------------------计算机使用时间过长，休息一会吧!------------------------------------");  
		}  
	}  
  通过计算，将计算机工作时间输入构造方法CPU（）中，将工作时间输入，如果工作时间超过5小时，则提醒用户休息一会。  
  void setSpeed(int m){		//创建一个setSpeed函数，用来给成员变量speed赋值
		this.speed = m;
}  
创建一个方法，用来给公共型整型变量speed赋值，记录cpu的工作速度。
### 在HardDisk类中：
HardDisk(Double n){				//创建构造方法，用来输出电脑剩余的容量，并判断电脑是否需要清理  
		spareamount=n;  
		System.out.println("剩余容量为："+spareamount+"个G");  
		if(spareamount <=30) {  
			System.out.println("-------------------------------------请清理电脑垃圾！---------------------------------------"); //判断硬盘剩余内存  
		}else if(spareamount > 30&&spareamount<100) {  
			System.out.println("-------------------------------------内存剩余过小，请谨慎使用！---------------------------------------");  
		}  
		else {  
			System.out.println("-----------------------------------------内存充足，尽管使用！--------------------------------------------------");  
		}  
	}  
  创建构造方法HardDisk（），输出电脑的剩余容量，并且当剩余容量小于30G时，提醒用户清理垃圾，当剩余容量小于100G时，提醒用户谨慎使用内存，其余情况，则内存充足，放心使用。  
  void setAmount(int m){				
		this.amount = m;  
}  
	int getAmount(){		//创建一个getAmount变量，用来输出电脑的容量  
		return amount ;  
}	  
创建一个setAmount函数，用来给成员变量amount赋值 ，创建一个getAmount变量，用来输出电脑的容量 。
### 在PC类中：  
void show(){  										
		System.out.println("CPU现在的速度为："+cpu.speed+"r/s");  
		System.out.println("硬盘目前容量为："+ HD.amount+"G");  
	}    
  创建一个show函数，用来输 CPU现在的速度和硬盘目前的的容量  
  ### 在logo类中：
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
    创建一个创造方法logo（），让用户输入电脑型号，如果按1，则电脑型号为联想，用的是Window10系统，如果输入 2，用的是小米电脑，  
    使用的是window8系统，如果输出3，则使用的是苹果电脑，用的是MacOs系统  
   ### 在主类Test中：
    logo logo1 = new logo();  
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
    此模块用来判断不同品牌的电脑，同时输出不同电脑型号的内存大小和运行速度。  
    Scanner beginTime = new Scanner(System.in)；  
		System.out.println("请输入电脑开始工作的时间工作时间（h）：");  
		int beginTime1=beginTime.nextInt();	  					
		System.out.println("请输入电脑现在的时间（h）：");  						
		Scanner overTime = new Scanner(System.in);  
		int overTime1 = overTime.nextInt();  
		CPU cpu = new CPU((overTime1-beginTime1));  		 
		System.out.println("请输入计算机的剩余内存");  
		Scanner reader1 =new Scanner(System.in);  
		HardDisk disk = new HardDisk(reader1.nextDouble());  				
    此模块中，用户输入电脑开始运行的时间和输入目前时间调用CPU的构造方法，输出CPU的工作时间。调用HardDisk的构造方法，输出电脑剩余的内存。  
## 四·实验结果
运行程序时：  
https://github.com/li2843645895/java-lishengxiang/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008142001.png?raw=true  
输入2，选择华为笔记本电脑：  
https://github.com/li2843645895/java-lishengxiang/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008142012.png?raw=true  
输入开始工作时间6:  
https://github.com/li2843645895/java-lishengxiang/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008142031.png?raw=true  
输入现在时间15：  
https://github.com/li2843645895/java-lishengxiang/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008142037.png?raw=true  
输入电脑剩余的内存60：  
https://github.com/li2843645895/java-lishengxiang/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201008142042.png?raw=true  
## 五·实验感想
通过本次实验，我熟练掌握了类的创建，对象的创建，对象对属性和行为的调用和赋值。学会如何创建构造方法，并且调用它。  
理解了修饰符public,protected,友好型，private各自作用，和对方法的创建和使用等。同时激发了我对Java语言深刻的兴趣，我一定积极努力学习和钻研这门语言。
