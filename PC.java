package javaprogram1;

class PC{
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU c){
		cpu = c;
	}
	void setHardDisk(HardDisk d){
	HD = d;
	}
	void show(){										//用来输 CPU的速度和硬盘的容量
		System.out.println("CPU现在的速度为："+cpu.speed+"r/s");
		System.out.println("硬盘目前容量为："+ HD.amount+"G");
	}


}