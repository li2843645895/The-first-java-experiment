package javaprogram1;

class HardDisk{
	protected int amount;			//�����ܱ��������α���amount��������¼���Ե�����
	public Double spareamount ;		//����һ�����еĵ�˫�����ͱ���spareamount��������¼����ʣ����ڴ�
	HardDisk(){};
	HardDisk(Double n){				//�������췽���������������ʣ������������жϵ����Ƿ���Ҫ����
		spareamount=n;
		System.out.println("ʣ������Ϊ��"+spareamount+"��G");
		if(spareamount <=30) {
			System.out.println("-------------------------------------���������������---------------------------------------"); //�ж�Ӳ��ʣ���ڴ�
		}else if(spareamount > 30&&spareamount<100) {
			System.out.println("-------------------------------------�ڴ�ʣ���С�������ʹ�ã�---------------------------------------");
		}
		else {
			System.out.println("-----------------------------------------�ڴ���㣬����ʹ�ã�--------------------------------------------------");
		}
	}
	void setAmount(int m){				//����һ��setAmount��������������Ա����amount��ֵ
		this.amount = m;
}
	int getAmount(){		//����һ��getAmount����������������Ե�����
		return amount ;
}	
}