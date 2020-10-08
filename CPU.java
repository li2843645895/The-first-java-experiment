package javaprogram1;

class CPU{
	public int speed;	//创建一个共有整型变量speed，用来记录CPU的工作速度
	private int time ;		//创建一个私有整型变量time，记录CPU的工作时间
	CPU(){};
	CPU (int m){				//创建构造方法，用来判断 CPU的工作时长
		time = m;
		System.out.println("cpu的工作时间(小时)为："+time+"hour");
		if(time>=5) {
			System.out.println("----------------------------计算机使用时间过长，休息一会吧!------------------------------------");
		}
	}
	void setSpeed(int m){		//创建一个setSpeed函数，用来给成员变量speed赋值
		this.speed = m;
}
}
