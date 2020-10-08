package javaprogram1;

class HardDisk{
	protected int amount;			//创建受保护的整形变量amount，用来记录电脑的容量
	public Double spareamount ;		//创建一个共有的的双浮点型变量spareamount，用来记录电脑剩余的内存
	HardDisk(){};
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
	void setAmount(int m){				//创建一个setAmount函数，用来给成员变量amount赋值
		this.amount = m;
}
	int getAmount(){		//创建一个getAmount变量，用来输出电脑的容量
		return amount ;
}	
}