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
	void show(){										//������ CPU���ٶȺ�Ӳ�̵�����
		System.out.println("CPU���ڵ��ٶ�Ϊ��"+cpu.speed+"r/s");
		System.out.println("Ӳ��Ŀǰ����Ϊ��"+ HD.amount+"G");
	}


}