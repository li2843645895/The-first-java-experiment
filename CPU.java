package javaprogram1;

class CPU{
	public int speed;	//����һ���������ͱ���speed��������¼CPU�Ĺ����ٶ�
	private int time ;		//����һ��˽�����ͱ���time����¼CPU�Ĺ���ʱ��
	CPU(){};
	CPU (int m){				//�������췽���������ж� CPU�Ĺ���ʱ��
		time = m;
		System.out.println("cpu�Ĺ���ʱ��(Сʱ)Ϊ��"+time+"hour");
		if(time>=5) {
			System.out.println("----------------------------�����ʹ��ʱ���������Ϣһ���!------------------------------------");
		}
	}
	void setSpeed(int m){		//����һ��setSpeed��������������Ա����speed��ֵ
		this.speed = m;
}
}
